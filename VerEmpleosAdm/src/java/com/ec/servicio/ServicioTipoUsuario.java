/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author gato
 */
public class ServicioTipoUsuario {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void crear(TipoUsuario tipousuario) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.persist(tipousuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en insertar un tipo de usuario " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public void eliminar(TipoUsuario tipousuario) {

        try {
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.remove(em.merge(tipousuario));
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error en eliminar  tipo de usuario " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public void modificar(TipoUsuario tipousuario) {

        try {

            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            em.merge(tipousuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en insertar un tipo de usuario " + e.getMessage());
        } finally {
            em.close();
        }

    }

   

//    public Usuario findByCorreo(String nombre) {
//
//        Usuario usuarioLogeado = null;
//        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
//        try {
//            System.out.println("Entra a consultar usuarios");
//            //Connection connection = em.unwrap(Connection.class);
//            em = HelperPersistencia.getEMF();
//            em.getTransaction().begin();
//            Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.email LIKE :email AND u.idTipousuario IS NOT NULL ORDER BY u.idUsuario ASC");
//            query.setParameter("email", "%" + nombre + "%");
//            listaUsuarios = (List<Usuario>) query.getResultList();
//            if (listaUsuarios.size() > 0) {
//                usuarioLogeado = listaUsuarios.get(0);
//            }
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            System.out.println("Error en lsa consulta usuarios" + e.getMessage());
//        } finally {
//            em.close();
//        }
//
//        return usuarioLogeado;
//    }
    public List<TipoUsuario> findByTipoUsuario(String nombre) {

        
        List<TipoUsuario> listaTipoUsuarios = new ArrayList<TipoUsuario>();
        try {
            System.out.println("Entra a consultar usuarios");
            //Connection connection = em.unwrap(Connection.class);
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT u FROM TipoUsuario u WHERE u.tipuDescripcion like :tipuDescripcion ORDER BY u.tipuDescripcion ASC");
            query.setParameter("tipuDescripcion", "%" + nombre + "%");
            listaTipoUsuarios = (List<TipoUsuario>) query.getResultList();
           
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en lsa consulta findByTipoUsuario" + e.getMessage());
        } finally {
            em.close();
        }

        return listaTipoUsuarios;
    }
   
}
