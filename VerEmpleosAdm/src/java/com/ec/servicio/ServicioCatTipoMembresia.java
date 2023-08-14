/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.CatTipoMembresia;
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
public class ServicioCatTipoMembresia {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void crear(CatTipoMembresia catTipoMembresia) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.persist(catTipoMembresia);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en insertar catTipoMembresia " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void eliminar(CatTipoMembresia catTipoMembresia) {

        try {
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.remove(em.merge(catTipoMembresia));
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error en eliminar  catTipoMembresia " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void modificar(CatTipoMembresia catTipoMembresia) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.merge(catTipoMembresia);
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
            System.out.println("Error en insertar catTipoMembresia " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public List<CatTipoMembresia> findMembresiasActivas(String nombre) {

        List<CatTipoMembresia> listaDatosMoneda = new ArrayList<CatTipoMembresia>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM CatTipoMembresia a WHERE a.estadoMembresia =:estadoMembresia");
            query.setParameter("estadoMembresia", nombre);
            listaDatosMoneda = (List<CatTipoMembresia>) query.getResultList();
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

    public CatTipoMembresia findById(Integer id) {

        List<CatTipoMembresia> listaDatosMoneda = new ArrayList<CatTipoMembresia>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM CatTipoMembresia a WHERE a.id =:id");
            query.setParameter("id", id);
            listaDatosMoneda = (List<CatTipoMembresia>) query.getResultList();
            em.getTransaction().commit();
            return listaDatosMoneda.size() > 0 ? listaDatosMoneda.get(0) : null;

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

        return null;
    }

}
