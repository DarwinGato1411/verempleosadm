/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.CatTipoMoneda;
import com.ec.entidad.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.validation.ConstraintViolationException;

/**
 *
 * @author gato
 */
public class ServicioCatTipoMoneda {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void crear(CatTipoMoneda catTipoMoneda) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.persist(catTipoMoneda);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en insertar catTipoMoneda " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void eliminar(CatTipoMoneda catTipoMoneda) {

        try {
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.remove(em.merge(catTipoMoneda));
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error en eliminar  catTipoMoneda " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void modificar(CatTipoMoneda catTipoMoneda) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.merge(catTipoMoneda);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(" Exception " + e.toString());
            StackTraceElement[] stack = e.getStackTrace();
            String exception = "";
            for (StackTraceElement s : stack) {
                exception = exception + s.toString() + "\n\t\t";
            }
            System.out.println(exception);
            // then you can send the exception string to a external file.

            if (e instanceof ConstraintViolationException) {
                ConstraintViolationException jdbcEx = (ConstraintViolationException) e;
                String messagee = e.getMessage() + "; SQL [" + jdbcEx.getMessage()
                        + "]; constraint [" + jdbcEx.getConstraintViolations().toString() + "]";

                System.out.println(" messagee " + messagee);

                if (em != null) {
                    em.getTransaction().rollback();
                }
            }
            System.out.println("Error en insertar catTipoMoneda " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public List<CatTipoMoneda> findByMoneda(String nombre) {

        List<CatTipoMoneda> listaDatosMoneda = new ArrayList<CatTipoMoneda>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM CatTipoMoneda a WHERE a.moneda LIke :moneda");
            query.setParameter("moneda", "%" + nombre + "%");
            listaDatosMoneda = (List<CatTipoMoneda>) query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en findByMoneda " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

        return listaDatosMoneda;
    }

}
