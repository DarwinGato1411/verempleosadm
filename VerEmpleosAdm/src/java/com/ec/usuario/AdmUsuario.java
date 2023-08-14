/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.usuario;

import com.ec.entidad.Empresa;
import com.ec.entidad.Usuario;
import com.ec.seguridad.EnumSesion;
import com.ec.seguridad.UserCredential;
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
public class AdmUsuario {

    ServicioUsuario servicioUsuario = new ServicioUsuario();
    UserCredential credential = new UserCredential();
    private List<Usuario> listaDatos = new ArrayList<Usuario>();

    private String buscar = "";
    
   

    public AdmUsuario() {
        Session sess = Sessions.getCurrent();
        UserCredential cre = (UserCredential) sess.getAttribute(EnumSesion.userCredential.getNombre());
        credential = cre;

    }

    private void buscar() {

        listaDatos = servicioUsuario.findByCorreoList(buscar,credential.getUsuarioSistema());
    }

    public List<Usuario> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<Usuario> listaDatos) {
        this.listaDatos = listaDatos;
    }

    

    @Command
    @NotifyChange({"listaDatos", "buscar"})
    public void buscarEmpresas() {

        buscar();
    }
    @Command
    public void activaModuloAdm(@BindingParam("valor") Usuario valor) {

        servicioUsuario.modificar(valor);
    }

    @Command
    public void modificaRegistro(@BindingParam("valor") Usuario valor) {

        try {
            final HashMap<String, Usuario> map = new HashMap<String, Usuario>();

            map.put("valor", valor);
            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                    "/modales/modalUsuario.zul", null, map);
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
                    "/modales/modalUsuario.zul", null, null);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }
   

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
 @Command
    public void activarModAdm(@BindingParam("valor") Usuario valor) {
        
        servicioUsuario.modificar(valor);
        
    }
    
}
