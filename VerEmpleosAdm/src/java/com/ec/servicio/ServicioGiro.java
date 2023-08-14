/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.CatGiroEmpresa;
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
public class ServicioGiro {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void crear(CatGiroEmpresa catGiroEmpresa) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.persist(catGiroEmpresa);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en insertar catGiroEmpresa " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void eliminar(CatGiroEmpresa catGiroEmpresa) {

        try {
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.remove(em.merge(catGiroEmpresa));
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error en eliminar  catGiroEmpresa " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void modificar(CatGiroEmpresa catGiroEmpresa) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.merge(catGiroEmpresa);
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
            System.out.println("Error en insertar catGiroEmpresa " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public List<CatGiroEmpresa> findByGiro(String nombre) {

        List<CatGiroEmpresa> listaDatos = new ArrayList<CatGiroEmpresa>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM CatGiroEmpresa a WHERE a.giro LIke :giro");
            query.setParameter("giro", "%" + nombre + "%");
            listaDatos = (List<CatGiroEmpresa>) query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en findByGiro " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

        return listaDatos;
    }

}
