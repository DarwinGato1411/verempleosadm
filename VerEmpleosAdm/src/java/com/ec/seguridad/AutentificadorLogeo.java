/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.seguridad;

import com.ec.entidad.Usuario;
import com.ec.servicio.ServicioUsuario;
import java.io.Serializable;

import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;

public class AutentificadorLogeo implements AutentificadorService, Serializable {

    private static final long serialVersionUID = 1L;
    ServicioUsuario servicioUsuario = new ServicioUsuario();

    public UserCredential getUserCredential() {
        Session sess = Sessions.getCurrent();
        UserCredential cre = (UserCredential) sess.getAttribute(EnumSesion.userCredential.getNombre());
        if (cre == null) {
            cre = new UserCredential();
            sess.setAttribute(EnumSesion.userCredential.getNombre(), cre);
        }
        return cre;
    }


    /*
     * Cambiar el método en el ModeloUsuario para traer datos de los usuarios de hibernate
     */
    public boolean login(String nombreUsuario, String claveUsuario) {

        Boolean administrador = Boolean.FALSE;
//        Usuario dato = new Usuario(Integer.MIN_VALUE);
//        dato.setUsuNivel(1);
//        dato.setUsuLogin("admin");
//        dato.setUsuPassword("admin");
//        dato.setUsuPassword("admin");
//        dato.setUsuNombre("ADMINISTRADOR DEL SISTEMA");
        Usuario dato = (Usuario) servicioUsuario.findByCorreoAdm(nombreUsuario);

//aa
        if (dato == null) {
            return false;
        }
        if (!dato.getEmail().equals(nombreUsuario) || !dato.getContrasenia().equals(claveUsuario)) {
            return false;
        }
        System.out.println("LOGUEADO " + dato.toString());
//        if (dato.getIdPerfil().getPerfSigla().trim().equals("AD")) {
//            System.out.println("entra como admin");
//            administrador = Boolean.TRUE;
//
//        } else {
//            System.out.println("no entra como admin");
//            administrador = Boolean.FALSE;
//        }

        Session sess = Sessions.getCurrent();
        UserCredential cre = new UserCredential(dato, dato.getIdTipousuario().getTipuDescripcion(), dato.getContrasenia(), 1, dato.getEmail(), administrador);
        // System.out.println("VALOR DE LA CREDENCIAL ASIGNADA A LA SESSION"+EnumSesion.userCredential.getNombre());
        sess.setAttribute(EnumSesion.userCredential.getNombre(), cre);

        return true;
    }

    public void logout() {
        Session sess = Sessions.getCurrent();
        sess.removeAttribute(EnumSesion.userCredential.getNombre());
    }
}
