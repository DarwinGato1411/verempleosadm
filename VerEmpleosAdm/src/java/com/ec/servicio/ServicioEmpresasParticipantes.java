/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.*;
import com.ec.entidad.EmpresasVacante;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author
 */
public class ServicioEmpresasParticipantes {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<EmpresasParticipantes> findByLikePorFechas(Date fechapublicacion, Date fechafin, String pais) {

        List<EmpresasParticipantes> listaDatosParticipantes = new ArrayList<EmpresasParticipantes>();

        try {

            em = HelperPersistencia.getEMF();

            //Query query1 = em.createQuery("SELECT a.idusuario, MAX(a.emailempresa), MAX(a.fechafinPublicacion), MAX(a.fechapublicacion), MAX(a.nombreempresa), MAX(a.pais) FROM EmpresasParticipantes a WHERE  a.fechapublicacion  BETWEEN  :fechapublicacion and :fechafin");
            String SQL = "SELECT NEW com.ec.entidad.EmpresasParticipantes(a.idusuario, MAX(a.emailempresa), MAX(a.nombreempresa), MAX(a.pais)) FROM EmpresasParticipantes a WHERE  a.fechapublicacion  BETWEEN  :fechapublicacion and :fechafin";
            String WHERE = " ";
            String GROUP = " GROUP BY a.idusuario";

            if (pais != null) {
                WHERE = WHERE + " AND  UPPER(a.pais) LIKE :pais";
            }
            em.getTransaction().begin();
            Query query = em.createQuery(SQL + WHERE + GROUP);
            query.setParameter("fechapublicacion", fechapublicacion);
            query.setParameter("fechafin", fechafin); 
            if (pais != null) {
                query.setParameter("pais", "%" + pais + "%");
            }
            listaDatosParticipantes = (List<EmpresasParticipantes>) query.getResultList();
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

        return listaDatosParticipantes;
    }
}
