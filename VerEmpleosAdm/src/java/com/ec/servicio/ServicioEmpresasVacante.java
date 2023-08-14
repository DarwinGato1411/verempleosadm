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
public class ServicioEmpresasVacante {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<EmpresasVacante> findByLikeDescripcionPuesto(String nombre) {

        List<EmpresasVacante> listaDatos = new ArrayList<EmpresasVacante>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM EmpresasVacante a WHERE  UPPER(a.nombreempresa) LIKE :nombreEmpresa OR UPPER(a.puesto) LIKE :puesto");
            query.setParameter("nombreEmpresa", "%" + nombre + "%");
            query.setParameter("puesto", "%" + nombre + "%");
            listaDatos = (List<EmpresasVacante>) query.getResultList();
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

    
      public List<EmpresasVacante> findEmpresasVacanteByLikePaises(String nombre) {

        List<EmpresasVacante> listaDatos = new ArrayList<EmpresasVacante>();

        try {
            
//             String SQL = "SELECT new com.ec.untilitario.ModeloAcumuladoDiaUsuario(a.usuLogin,a.facTotal,a.totalntv,a.totalacumulado) FROM AcumuladopordiaUsuario a WHERE a.facFecha =:facFecha ";
//            String WHERE = " AND a.idUsuario=:idUsuario";

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM EmpresasVacante a WHERE  UPPER(a.pais) LIKE :pais  ");
            query.setParameter("pais", "%" + nombre + "%");
            query.setMaxResults(100);
//            query.setParameter("puesto", "%" + nombre + "%");
            listaDatos = (List<EmpresasVacante>) query.getResultList();
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
    public List<EmpresasVacante> findByLikeDescripcionPuestoEjemplo(Integer nombre) {

        List<EmpresasVacante> listaDatos = new ArrayList<EmpresasVacante>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM EmpresasVacante a WHERE  a.idvacante=:idvacante");
            query.setParameter("idvacante", nombre);
            listaDatos = (List<EmpresasVacante>) query.getResultList();
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
    
    public List<EmpresasVacante> findByIdEmpresa(Integer idusuario, Date inicio, Date fin) {

        List<EmpresasVacante> listaDatos = new ArrayList<EmpresasVacante>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM EmpresasVacante a WHERE  a.idusuario=:idusuario AND a.fechapublicacion BETWEEN :inicio AND :fin");
            query.setParameter("idusuario", idusuario);
            query.setParameter("inicio", inicio);
            query.setParameter("fin", fin);
            listaDatos = (List<EmpresasVacante>) query.getResultList();
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

    public List<EmpresasVacante> findByLikePais(String nombre) {

        List<EmpresasVacante> listaDatos = new ArrayList<EmpresasVacante>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT  a.pais FROM EmpresasVacante a WHERE a.pais LIKE :pais GROUP BY a.pais");
            query.setParameter("pais", "%" + nombre + "%");
            listaDatos = (List<EmpresasVacante>) query.getResultList();
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

    public List<EmpresasVacante> findByLikePorFechas(Date fechapublicacion, Date fechafin,String pais) {

        List<EmpresasVacante> listaDatos = new ArrayList<EmpresasVacante>();

        try {

            em = HelperPersistencia.getEMF();
            
            String SQL="SELECT a FROM EmpresasVacante a WHERE  a.fechapublicacion  BETWEEN  :fechapublicacion and :fechafin";
            String WHERE=" ";
            if (pais != null) {
                WHERE=WHERE+" AND  UPPER(a.pais) LIKE :pais";
            }
            em.getTransaction().begin();
            Query query = em.createQuery(SQL+WHERE);
            query.setParameter("fechapublicacion", fechapublicacion);
            query.setParameter("fechafin", fechafin);
             if (pais != null) {
               query.setParameter("pais","%"+ pais+"%");
            }
            listaDatos = (List<EmpresasVacante>) query.getResultList();
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

}
