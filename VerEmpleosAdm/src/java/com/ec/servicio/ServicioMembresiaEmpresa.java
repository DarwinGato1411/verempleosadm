/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.Empresa;
import com.ec.entidad.MembresiaEmpresa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;

/**
 *
 * @author gato
 */
public class ServicioMembresiaEmpresa {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void crear(MembresiaEmpresa membresiaEmpresa) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.persist(membresiaEmpresa);
            em.getTransaction().commit();
        } catch (ConstraintViolationException e) {
            System.out.println("Error en insertar membresiaEmpresa " + e.getMessage());
            // I only need the first violation
            ConstraintViolation<?> violation = e.getConstraintViolations().iterator().next();
// get the last node of the violation
            String field = null;
            for (Path.Node node : violation.getPropertyPath()) {
                field = node.getName();
                System.out.println("ERROR CONSTRAINT "+field);
            }
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void eliminar(MembresiaEmpresa membresiaEmpresa) {

        try {
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.remove(em.merge(membresiaEmpresa));
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error en eliminar  membresiaEmpresa " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void modificar(MembresiaEmpresa membresiaEmpresa) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.merge(membresiaEmpresa);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }

            System.out.println("Error en insertar membresiaEmpresa " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public List<MembresiaEmpresa> findAll(String nombre) {

        List<MembresiaEmpresa> listaDatos = new ArrayList<MembresiaEmpresa>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM MembresiaEmpresa a ");
//            query.setParameter("pais", "%" + nombre + "%");
            listaDatos = (List<MembresiaEmpresa>) query.getResultList();
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

    public MembresiaEmpresa findByIdEmpresa(Empresa id) {

        List<MembresiaEmpresa> listaDatosPais = new ArrayList<MembresiaEmpresa>();

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM MembresiaEmpresa a WHERE a.idEmpresa.idUsuario=:id");
            query.setParameter("id", id.getIdUsuario());
            listaDatosPais = (List<MembresiaEmpresa>) query.getResultList();
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
