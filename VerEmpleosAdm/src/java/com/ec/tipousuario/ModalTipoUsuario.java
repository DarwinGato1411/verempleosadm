/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.tipousuario;

import com.ec.usuario.*;
import com.ec.empresa.*;
import com.ec.entidad.*;
import com.ec.servicio.ServicioUsuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Fileupload;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Window;

/**
 *
 * @author gato
 */
public class ModalTipoUsuario {

    ServicioUsuario servicioUsuario = new ServicioUsuario();
    private Usuario usuario = new Usuario();
    private List<Usuario> listaDatos = new ArrayList<Usuario>();
    private String accion = "create";
    @Wire
    Window windowUsuario;

    @AfterCompose
    public void afterCompose(@ExecutionArgParam("valor") Usuario valor, @ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);
        if (valor != null) {
            usuario = valor;
            accion = "update";

        } else {
            this.usuario = new Usuario();
            accion = "create";

        }

    }

    public List<Usuario> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<Usuario> listaDatos) {
        this.listaDatos = listaDatos;
    }
    

    @Command
    public void guardar() {
        if (usuario.getEmail()!= null
                && usuario.getModAdministrativo()!= null
                
                && usuario.getContrasenia()!= null) {

            if (accion.equals("create")) {
                servicioUsuario.crear(usuario);
                // Messagebox.show("Guardado con exito");

                windowUsuario.detach();
            } else {
                servicioUsuario.modificar(usuario);
                // Messagebox.show("Guardado con exito");

                windowUsuario.detach();
            }

        } else {
            Messagebox.show("Verifique la informacion requerida", "Atención", Messagebox.OK, Messagebox.ERROR);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    /*cargar imagen*/
//    @Command
//    @NotifyChange("usuario")
//    public void subirFotografia() throws InterruptedException, IOException {
//        org.zkoss.util.media.Media media = Fileupload.get();
//        if (media instanceof org.zkoss.image.Image) {
//            if (media.getByteData().length > 10 * 1024 * 1024) {
//                Messagebox.show("El arhivo seleccionado sobrepasa el tamaño de 10MB .\n Por favor seleccione un archivo más pequeño.");
//                return;
//            }
//
//            this.empresa.setLogo(media.getByteData());
//        }
//
//    }

}
