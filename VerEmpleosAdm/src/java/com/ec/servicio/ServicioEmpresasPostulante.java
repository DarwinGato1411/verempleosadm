/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.*;
import com.ec.entidad.EmpresasVacante;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author
 */
public class ServicioEmpresasPostulante {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<EmpresaPostulante> findByLikeVacante(String nombre) {

        List<EmpresaPostulante> listaDatos = new ArrayList<EmpresaPostulante>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT  a FROM Postulantes a WHERE  a.idvacante=:idvacante");
            query.setParameter("idvacante", "%" + nombre + "%");
            listaDatos = (List<EmpresaPostulante>) query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en EmpresaVacante " + e.getMessage());
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

    public List<EmpresaPostulante> findByIdVacante(Integer IdVacante) {

        List<EmpresaPostulante> listaDatos = new ArrayList<EmpresaPostulante>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM EmpresaPostulante a WHERE  a.IdVacante =:IdVacante");
            query.setParameter("IdVacante", IdVacante);
            listaDatos = (List<EmpresaPostulante>) query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en EmpresaPostulante " + e.getMessage());
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

    public List<EmpresasVacante> findByLikePais(int nombre) {

        List<EmpresasVacante> listaDatos = new ArrayList<EmpresasVacante>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT  a.idempresa FROM Psotulante WHERE a.idempresa=:idempresa");
            query.setParameter("idempresa", "%" + nombre + "%");
            listaDatos = (List<EmpresasVacante>) query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en EmpresaPostulante " + e.getMessage());
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

    public List<EmpresasVacante> findByLikePorFechas(String fechapublicacion, String fechafin) {

        List<EmpresasVacante> listaDatosFechas = new ArrayList<EmpresasVacante>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM EmpresasVacante a WHERE  a.fechapublicacion  BETWEEN  :fechapublicacion and :fechafin");
            query.setParameter("fechasinicio", fechapublicacion);
            query.setParameter("fechafin", fechafin);
            listaDatosFechas = (List<EmpresasVacante>) query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en EmpresaVacante " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

        return listaDatosFechas;
    }
}
