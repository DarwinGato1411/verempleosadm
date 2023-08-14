/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.VsPorcentajeCandidato;
import com.ec.entidad.VsPorcentajeVacantePais;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author gato
 */
public class ServicioPorcentajeVacantePais {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<VsPorcentajeVacantePais> findALl() {

        List<VsPorcentajeVacantePais> listaDatos = new ArrayList<VsPorcentajeVacantePais>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM VsPorcentajeVacantePais a ORDER BY a.cantidad DESC ");

            listaDatos = (List<VsPorcentajeVacantePais>) query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en findALl " + e.getMessage());
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
