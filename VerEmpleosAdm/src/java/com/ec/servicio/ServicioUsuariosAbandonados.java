/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidad.UsuariosSinEmpresaCandidato;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author gato
 */
public class ServicioUsuariosAbandonados {

    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void eliminar(Integer idUsuario) {

        try {
            em = HelperPersistencia.getEMF();            
            em.getTransaction().begin();
            Query query = em.createNativeQuery("DELETE FROM Usuario where idUsuario=?");
            query.setParameter(1, idUsuario);
            query.executeUpdate();
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error en eliminar  usuariosSinEmpresaCandidato " + e.getMessage());
        } finally {
            em.close();
        }

    }

    public List<UsuariosSinEmpresaCandidato> findByCorreoList(String nombre) {

        List<UsuariosSinEmpresaCandidato> listaUsuarios = new ArrayList<UsuariosSinEmpresaCandidato>();
        try {
            String SQL = "SELECT u FROM UsuariosSinEmpresaCandidato u WHERE u.email LIKE :email";
            String WHERE = "";
            String ORDERBY = " ORDER BY u.idUsuario ASC ";

            //Connection connection = em.unwrap(Connection.class);
            em = HelperPersistencia.getEMF();
            em.getTransaction().begin();
            Query query = em.createQuery(SQL + WHERE + ORDERBY);
            query.setParameter("email", "%" + nombre + "%");
            listaUsuarios = (List<UsuariosSinEmpresaCandidato>) query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en lsa consulta UsuariosSinEmpresaCandidato" + e.getMessage());
        } finally {
            em.close();
        }

        return listaUsuarios;
    }

}
