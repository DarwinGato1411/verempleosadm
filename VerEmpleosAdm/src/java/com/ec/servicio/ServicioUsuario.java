/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author gato
 */
public class ServicioUsuario {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void crear(Usuario usuario) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en insertar usuario " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public void eliminar(Usuario usuario) {

        try {
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.remove(em.merge(usuario));
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error en eliminar  usuario " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public void modificar(Usuario usuario) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.merge(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en insertar usuario " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public Usuario findByCorreo(String nombre) {

        Usuario usuarioLogeado = null;
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        try {
            System.out.println("Entra a consultar usuarios " + nombre);
            //Connection connection = em.unwrap(Connection.class);
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.email LIKE :email ORDER BY u.idUsuario ASC");
            query.setParameter("email", "%" + nombre + "%");
            listaUsuarios = (List<Usuario>) query.getResultList();
            if (listaUsuarios.size() > 0) {
                usuarioLogeado = listaUsuarios.get(0);
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

        return usuarioLogeado;
    }

    public List<Usuario> findByCorreoList(String nombre, Usuario usuario) {

        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        try {
            String SQL = "SELECT u FROM Usuario u WHERE u.email LIKE :email  ";
            String WHERE = "";
            String ORDERBY = " ORDER BY u.idUsuario ASC ";
            System.out.println("Entra a consultar usuarios");
            if (!usuario.getIdTipousuario().getTipuSigla().equals("SADM")) {
                WHERE = WHERE + " AND u.idUsuario IN (SELECT b.idUsuario FROM Empresa b WHERE b.idPais=:idPais) ";
            }
            //Connection connection = em.unwrap(Connection.class);
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery(SQL + WHERE + ORDERBY);

            query.setParameter("email", "%" + nombre + "%");
            if (!usuario.getIdTipousuario().getTipuSigla().equals("SADM")) {
                query.setParameter("idPais", usuario.getIdCatEstado().getIdPais().getId());
            }
            listaUsuarios = (List<Usuario>) query.getResultList();

            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en lsa consulta findByCorreoList" + e.getMessage());
        } finally {
            em.close();
        }

        return listaUsuarios;
    }

    /*para el login*/
    public Usuario findByCorreoAdm(String nombre) {

        Usuario usuarioLogeado = null;
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        try {
            System.out.println("Entra a consultar usuarios");
            //Connection connection = em.unwrap(Connection.class);
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.email LIKE :email AND u.modAdministrativo=TRUE AND u.idTipousuario IS NOT NULL ORDER BY u.idUsuario ASC");
            query.setParameter("email", "%" + nombre + "%");
            listaUsuarios = (List<Usuario>) query.getResultList();
            if (listaUsuarios.size() > 0) {
                usuarioLogeado = listaUsuarios.get(0);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en lsa consulta findByCorreoAdm" + e.getMessage());
        } finally {
            em.close();
        }

        return usuarioLogeado;
    }

}
