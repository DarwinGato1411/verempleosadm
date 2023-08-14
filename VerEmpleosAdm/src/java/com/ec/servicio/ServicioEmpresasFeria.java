/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.EmpresasFeria;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author gato
 */
public class ServicioEmpresasFeria {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<EmpresasFeria> findlikeDescripcionPuesto(String nombre) {

        List<EmpresasFeria> listaDatos = new ArrayList<EmpresasFeria>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM EmpresasFeria a WHERE a.descripcionPuesto LIKE :descripcionPuesto OR a.puesto LIKE :puesto");
            query.setParameter("descripcionPuesto", "%" + nombre + "%");
            query.setParameter("puesto", "%" + nombre + "%");
            listaDatos = (List<EmpresasFeria>) query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en findlikeDescripcionPuesto " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        }  finally {
            if (em != null) {
                em.close();
            }

        }

        return listaDatos;
    }

}
