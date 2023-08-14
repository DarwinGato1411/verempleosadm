/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.tipousuario;

import com.ec.usuario.*;
import com.ec.entidad.Empresa;
import com.ec.entidad.*;
import com.ec.seguridad.EnumSesion;
import com.ec.seguridad.UserCredential;
import com.ec.servicio.ServicioTipoUsuario;
import com.ec.servicio.ServicioUsuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.Messagebox;

/**
 *
 * @author root
 */
public class AdmTipoUsuario {

    ServicioTipoUsuario serviciotipoUsuario = new ServicioTipoUsuario();
    UserCredential credential = new UserCredential();
    private List<TipoUsuario> listaDatos = new ArrayList<TipoUsuario>();

    private String buscar = "";

    public AdmTipoUsuario() {
        Session sess = Sessions.getCurrent();
        UserCredential cre = (UserCredential) sess.getAttribute(EnumSesion.userCredential.getNombre());
        credential = cre;

    }

//    private void buscar() {
//
//        listaDatos = serviciotipoUsuario.find(buscar);
//    }

    public List<TipoUsuario> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<TipoUsuario> listaDatos) {
        this.listaDatos = listaDatos;
    }

    

//    @Command
//    @NotifyChange({"listaDatos", "buscar"})
//    public void buscarEmpresas() {
//
//        buscar();
//    }
    @Command
    public void activaModuloAdm(@BindingParam("valor") TipoUsuario valor) {

        serviciotipoUsuario.modificar(valor);
    }

    @Command
    public void modificaRegistro(@BindingParam("valor") TipoUsuario valor) {

        try {
            final HashMap<String, TipoUsuario> map = new HashMap<String, TipoUsuario>();

            map.put("valor", valor);
            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                    "/modales/modalTipoUsuario.zul", null, map);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }

      @Command
    public void crearRegistro() {

        try {
           
            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                    "/modales/modalTipoUsuario.zul", null, null);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }
    @Command
    public void eliminarEmpresa(@BindingParam("valor") TipoUsuario valor) {
        if (Messagebox.show("¿Desea eliminar el registros ?", "Atención", Messagebox.YES | Messagebox.NO, Messagebox.EXCLAMATION) == Messagebox.YES) {

        }
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

}
