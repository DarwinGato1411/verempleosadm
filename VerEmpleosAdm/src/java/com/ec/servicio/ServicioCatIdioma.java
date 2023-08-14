/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.CatIdioma;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.validation.ConstraintViolationException;

/**
 *
 * @author gato
 */
public class ServicioCatIdioma {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void crear(CatIdioma catIdioma) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.persist(catIdioma);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en insertar catIdioma " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void eliminar(CatIdioma catIdioma) {

        try {
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.remove(em.merge(catIdioma));
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error en eliminar  catIdioma " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void modificar(CatIdioma catIdioma) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.merge(catIdioma);
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
            System.out.println("Error en insertar catIdioma " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public List<CatIdioma> findByGiro(String nombre) {

        List<CatIdioma> listaDatos = new ArrayList<CatIdioma>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM CatIdioma a WHERE a.giro LIke :giro");
            query.setParameter("giro", "%" + nombre + "%");
            listaDatos = (List<CatIdioma>) query.getResultList();
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
