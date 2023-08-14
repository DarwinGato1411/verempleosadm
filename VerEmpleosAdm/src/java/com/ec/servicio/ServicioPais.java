/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.CatEstado;
import com.ec.entidad.CatPais;
import com.ec.entidad.CatPais;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author gato
 */
public class ServicioPais {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void crear(CatPais catPais) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.persist(catPais);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en insertar catPais " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void eliminar(CatPais catPais) {

        try {
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.remove(em.merge(catPais));
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error en eliminar  catPais " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void modificar(CatPais catPais) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.merge(catPais);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }

            System.out.println("Error en insertar catPais " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public List<CatPais> findByPais(String nombre) {

        List<CatPais> listaDatos = new ArrayList<CatPais>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM CatPais a WHERE a.pais LIke :pais");
            query.setParameter("pais", "%" + nombre + "%");
            listaDatos = (List<CatPais>) query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en findByPais " + e.getMessage());
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

    public CatPais findByIdPais(Integer id) {

        List<CatPais> listaDatosPais = new ArrayList<CatPais>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM CatPais a WHERE a.id LIke :id");
            query.setParameter("id", id);
            listaDatosPais = (List<CatPais>) query.getResultList();
            em.getTransaction().commit();
            if (listaDatosPais.size() > 0) {
                return listaDatosPais.get(0);
            }
        } catch (Exception e) {
            System.out.println("Error en findByEstado " + e.getMessage());
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
