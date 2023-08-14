/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.Vacante;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 *
 * @author gato
 */
public class ServicioVacante {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void crear(Vacante vacante) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.persist(vacante);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en insertar vacante " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public void eliminar(Vacante vacante) {

        try {
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.remove(em.merge(vacante));
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error en eliminar  vacante " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public void modificar(Vacante vacante) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.merge(vacante);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en insertar vacante " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public Vacante findByCorreo(String nombre) {

        Vacante vacanteLogeado = null;
        List<Vacante> listaVacantes = new ArrayList<Vacante>();
        try {
            System.out.println("Entra a consultar vacantes " + nombre);
            //Connection connection = em.unwrap(Connection.class);
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT u FROM Vacante u WHERE u.email LIKE :email ORDER BY u.idVacante ASC");
            query.setParameter("email", "%" + nombre + "%");
            listaVacantes = (List<Vacante>) query.getResultList();
            if (listaVacantes.size() > 0) {
                vacanteLogeado = listaVacantes.get(0);
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error en lsa consulta findByCorreo" + e.getMessage());
        } finally {
            em.close();
        }

        return vacanteLogeado;
    }

    public Vacante findById(Integer idVacante) {

        Vacante vacanteLogeado = null;
        List<Vacante> listaVacantes = new ArrayList<Vacante>();
        try {
//            System.out.println("Entra a consultar vacantes " + nombre);
            //Connection connection = em.unwrap(Connection.class);
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT u FROM Vacante u WHERE u.idVacante=:idVacante");
            query.setParameter("idVacante", idVacante);
            listaVacantes = (List<Vacante>) query.getResultList();
            if (listaVacantes.size() > 0) {
                vacanteLogeado = listaVacantes.get(0);
            }

            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            Validator validator = factory.getValidator();
            Set<ConstraintViolation<Vacante>> constraintViolations = validator.validate(vacanteLogeado);
            if (constraintViolations.size() > 0) {
                Iterator<ConstraintViolation<Vacante>> iterator = constraintViolations.iterator();
                while (iterator.hasNext()) {
                    ConstraintViolation<Vacante> cv = iterator.next();
                    System.err.println(cv.getRootBeanClass().getName() + "." + cv.getPropertyPath() + " " + cv.getMessage());

//            JsfUtil.addErrorMessage(cv.getRootBeanClass().getSimpleName()+"."+cv.getPropertyPath() + " " +cv.getMessage());
                }
            }
            em.getTransaction().commit();
        } catch (ConstraintViolationException e) {
            for (ConstraintViolation actual : e.getConstraintViolations()) {
                System.out.println(actual.toString());
            }
            if (em != null) {
                em.getTransaction().rollback();
            }
            System.out.println("Error en lsa consulta findByCorreo" + e.getMessage());
        } finally {
            em.close();
        }

        return vacanteLogeado;
    }

//    public List<Vacante> findByCorreoList(String nombre, Vacante vacante) {
//
//        List<Vacante> listaVacantes = new ArrayList<Vacante>();
//        try {
//            String SQL = "SELECT u FROM Vacante u WHERE u.email LIKE :email  ";
//            String WHERE = "";
//            String ORDERBY = " ORDER BY u.idVacante ASC ";
//            System.out.println("Entra a consultar vacantes");
//            if (!vacante.getIdTipovacante().getTipuSigla().equals("SADM")) {
//                WHERE = WHERE + " AND u.idVacante IN (SELECT b.idVacante FROM Empresa b WHERE b.idPais=:idPais) ";
//            }
//            //Connection connection = em.unwrap(Connection.class);
//            em = HelperPersistencia.getEMF();
//            em.getTransaction().begin();
//            Query query = em.createQuery(SQL + WHERE + ORDERBY);
//
//            query.setParameter("email", "%" + nombre + "%");
//            if (!vacante.getIdTipovacante().getTipuSigla().equals("SADM")) {
//                query.setParameter("idPais", vacante.getIdCatEstado().getIdPais().getId());
//            }
//            listaVacantes = (List<Vacante>) query.getResultList();
//
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            System.out.println("Error en lsa consulta findByCorreoList" + e.getMessage());
//        } finally {
//            em.close();
//        }
//
//        return listaVacantes;
//    }
//
//    /*para el login*/
//    public Vacante findByCorreoAdm(String nombre) {
//
//        Vacante vacanteLogeado = null;
//        List<Vacante> listaVacantes = new ArrayList<Vacante>();
//        try {
//            System.out.println("Entra a consultar vacantes");
//            //Connection connection = em.unwrap(Connection.class);
//            em = HelperPersistencia.getEMF();
//            em.getTransaction().begin();
//            Query query = em.createQuery("SELECT u FROM Vacante u WHERE u.email LIKE :email AND u.modAdministrativo=TRUE AND u.idTipovacante IS NOT NULL ORDER BY u.idVacante ASC");
//            query.setParameter("email", "%" + nombre + "%");
//            listaVacantes = (List<Vacante>) query.getResultList();
//            if (listaVacantes.size() > 0) {
//                vacanteLogeado = listaVacantes.get(0);
//            }
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            System.out.println("Error en lsa consulta findByCorreoAdm" + e.getMessage());
//        } finally {
//            em.close();
//        }
//
//        return vacanteLogeado;
//    }
}
