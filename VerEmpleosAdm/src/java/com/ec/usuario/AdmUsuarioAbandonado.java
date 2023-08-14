/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.usuario;

import com.ec.entidad.Usuario;
import com.ec.entidad.UsuariosSinEmpresaCandidato;
import com.ec.seguridad.EnumSesion;
import com.ec.seguridad.UserCredential;
import com.ec.servicio.ServicioUsuario;
import com.ec.servicio.ServicioUsuariosAbandonados;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Messagebox;

/**
 *
 * @author root
 */
public class AdmUsuarioAbandonado {

    ServicioUsuariosAbandonados servicioUsuarioAbandonados = new ServicioUsuariosAbandonados();
    UserCredential credential = new UserCredential();
    private List<UsuariosSinEmpresaCandidato> listaDatos = new ArrayList<UsuariosSinEmpresaCandidato>();

    private String buscar = "";

    public AdmUsuarioAbandonado() {
        Session sess = Sessions.getCurrent();
        UserCredential cre = (UserCredential) sess.getAttribute(EnumSesion.userCredential.getNombre());
        credential = cre;

    }

    private void buscar() {

        listaDatos = servicioUsuarioAbandonados.findByCorreoList(buscar);
    }

    public List<UsuariosSinEmpresaCandidato> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<UsuariosSinEmpresaCandidato> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @Command
    @NotifyChange({"listaDatos", "buscar"})
    public void buscarEmpresas() {

        buscar();
    }

    @Command
    @NotifyChange({"listaDatos", "buscar"})
    public void eliminar(@BindingParam("valor") UsuariosSinEmpresaCandidato valor) {
        if (Messagebox.show("¿Seguro que desea eliminar?", "Atención", Messagebox.YES | Messagebox.NO, Messagebox.INFORMATION) == Messagebox.YES) {
            servicioUsuarioAbandonados.eliminar(valor.getIdUsuario());
            buscar();
            Clients.showNotification("Eliminado con exito", Clients.NOTIFICATION_TYPE_INFO, null, "end_before", 2000, true);
        }
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

}
