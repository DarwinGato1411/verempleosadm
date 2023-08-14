/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.CatEstado;
import com.ec.entidad.CatPais;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author gato
 */
public class ServicioProvincia {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void crear(CatEstado catEstado) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.persist(catEstado);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en insertar catEstado " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void eliminar(CatEstado catEstado) {

        try {
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.remove(em.merge(catEstado));
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error en eliminar  catEstado " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void modificar(CatEstado catEstado) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.merge(catEstado);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }

            System.out.println("Error en insertar catEstado " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public List<CatEstado> findByEstado(String nombre) {

        List<CatEstado> listaDatos = new ArrayList<CatEstado>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM CatEstado a WHERE a.estado LIke :estado");
            query.setParameter("estado", "%" + nombre + "%");
            listaDatos = (List<CatEstado>) query.getResultList();
            em.getTransaction().commit();
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

        return listaDatos;
    }

    public CatEstado findByIdEstado(Integer id) {

        List<CatEstado> listaDatos = new ArrayList<CatEstado>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM CatEstado a WHERE a.id LIke :id");
            query.setParameter("id", id);
            listaDatos = (List<CatEstado>) query.getResultList();
            em.getTransaction().commit();
            if (listaDatos.size() > 0) {
                return listaDatos.get(0);
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

    public List<CatEstado> findByIdPais(Integer id) {

        List<CatEstado> listaDatosProvin = new ArrayList<CatEstado>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM CatEstado a WHERE a.idPais.id =:idPais");
            query.setParameter("idPais", id);
            listaDatosProvin = (List<CatEstado>) query.getResultList();
            em.getTransaction().commit();

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

        return listaDatosProvin;
    }

    public List<CatEstado> findByIdPaisNombrePais(CatPais idPais, String nombre) {

        List<CatEstado> listaDatos = new ArrayList<CatEstado>();

        try {
            System.out.println("buscarProvincia "+nombre);
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM CatEstado a WHERE a.idPais =:idPais AND UPPER(a.estado) LIKE :estado");
            query.setParameter("idPais", idPais);
            query.setParameter("estado", "%" + nombre + "%");
            listaDatos = (List<CatEstado>) query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en findByIdPaisNombrePais " + e.getMessage());
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
