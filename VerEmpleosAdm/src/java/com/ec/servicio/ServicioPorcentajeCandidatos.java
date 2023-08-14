/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.VsPorcentajeCandidato;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author gato
 */
public class ServicioPorcentajeCandidatos {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<VsPorcentajeCandidato> findALl() {

        List<VsPorcentajeCandidato> listaDatos = new ArrayList<VsPorcentajeCandidato>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM VsPorcentajeCandidato a ORDER BY a.cantidad DESC");
           
            listaDatos = (List<VsPorcentajeCandidato>) query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en findALl " + e.getMessage());
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
