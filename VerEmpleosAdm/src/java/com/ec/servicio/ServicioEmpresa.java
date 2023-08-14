/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.CatEstado;
import com.ec.entidad.Empresa;
import com.ec.entidad.Empresa;
import com.ec.entidad.MembresiaEmpresa;
import com.ec.entidad.Usuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.validation.ConstraintViolationException;

/**
 *
 * @author gato
 */
public class ServicioEmpresa {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void crear(Empresa empresa,CatEstado catPaisSelected) {

        try {
            Usuario usuario = new Usuario();
            usuario.setEmail(empresa.getEmailEmpresa());
            usuario.setEdoConfirmacion(Boolean.TRUE);
            usuario.setContrasenia("verempleos");
            usuario.setTipo(Boolean.TRUE);
            usuario.setIdCatEstado(catPaisSelected);
            
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
//            em.flush();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT a FROM Usuario a WHERE a.email=:email");
            query.setParameter("email", usuario.getEmail());
            List<Usuario> recup = query.getResultList();
            empresa.setIdUsuario(recup.get(0).getIdUsuario());
            em.persist(empresa);
            em.getTransaction().commit();
//            em.flush();
            em.getTransaction().begin();
            Query queryE = em.createQuery("SELECT a FROM Empresa a WHERE a.emailEmpresa=:email");
            queryE.setParameter("email", usuario.getEmail());
            em.getTransaction().commit();
            em.getTransaction().begin();
            List<Empresa> recupE = queryE.getResultList();
            MembresiaEmpresa membresiaEmpresa = new MembresiaEmpresa();
            membresiaEmpresa.setBusqCandIlimitada(Boolean.TRUE);
            membresiaEmpresa.setVacantesIlimitadas(Boolean.TRUE);
            membresiaEmpresa.setComentarios("Empresa registrada desde Administrador");
            membresiaEmpresa.setIdTipoMembresia(1);
            membresiaEmpresa.setFechaInicio(new Date());
            membresiaEmpresa.setFechaCompra(new Date());
            membresiaEmpresa.setIdEmpresa(recupE.get(0));
//            membresiaEmpresa.setIdEmpresa(recupE.size() > 0 ? recupE.get(0) : null);
            Calendar calendar = Calendar.getInstance(); //obtiene la fecha de hoy 
            calendar.add(Calendar.YEAR, 1); // indica que se le sume 1 año
            Date fin = calendar.getTime();
            membresiaEmpresa.setFechaFin(fin);
            em.getTransaction().commit();

            em.getTransaction().begin();
            em.persist(membresiaEmpresa);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(" Exception " + e.toString());
            StackTraceElement[] stack = e.getStackTrace();
            String exception = "";
            for (StackTraceElement s : stack) {
                exception = exception + s.toString() + "\n\t\t";
            }
            System.out.println(exception);
            // then you can send the exception string to a external file.

            if (e instanceof ConstraintViolationException) {
                ConstraintViolationException jdbcEx = (ConstraintViolationException) e;
                String messagee = e.getMessage() + "; SQL [" + jdbcEx.getMessage()
                        + "]; constraint [" + jdbcEx.getConstraintViolations().toString() + "]";

                System.out.println(" messagee " + messagee);

                if (em != null) {
                    em.getTransaction().rollback();
                }
            }
        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void eliminar(Empresa empresa) {

        try {
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.remove(em.merge(empresa));
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error en eliminar  empresa " + e.getMessage());
            if (em != null) {
                em.getTransaction().rollback();
            }

        } finally {
            if (em != null) {
                em.close();
            }

        }

    }

    public void modificar(Empresa empresa) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.merge(empresa);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null) {
                em.getTransaction().rollback();
            }

            System.out.println("Error en insertar empresa " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public List<Empresa> findEmpresaPorNombre(String nombre, Usuario usuario) {

        List<Empresa> listaDatos = new ArrayList<Empresa>();

        try {

            String SQL = " SELECT u FROM Empresa u ";
            String WHERE = "WHERE UPPER( u.nombreEmpresa) LIKE :nombreEmpresa ";
            if (!usuario.getIdTipousuario().getTipuSigla().equals("SADM")) {
                WHERE = WHERE + " AND u.idPais=:idPais";
            }
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery(SQL + WHERE);
            query.setParameter("nombreEmpresa", "%" + nombre + "%");
            if (!usuario.getIdTipousuario().getTipuSigla().equals("SADM")) {
//                query.setParameter("idUsuario", usuario.getIdUsuario());
                query.setParameter("idPais", usuario.getIdCatEstado().getIdPais().getId());
            }

            listaDatos = (List<Empresa>) query.getResultList();

            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en findEmpresaPorNombre empresa    " + e.getMessage());
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
