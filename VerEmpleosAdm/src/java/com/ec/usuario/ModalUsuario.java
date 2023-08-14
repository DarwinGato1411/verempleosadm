/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.usuario;

import com.ec.entidad.*;
import com.ec.servicio.ServicioPais;
import com.ec.servicio.ServicioProvincia;
import com.ec.servicio.ServicioTipoUsuario;
import com.ec.servicio.ServicioUsuario;
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
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Window;

/**
 *
 * @author gato
 */
public class ModalUsuario {

    ServicioUsuario servicioUsuario = new ServicioUsuario();
    ServicioTipoUsuario servicioTipoUsuario = new ServicioTipoUsuario();
    private Usuario usuario = new Usuario();
    private List<TipoUsuario> listaDatos = new ArrayList<TipoUsuario>();
    private TipoUsuario tipoUsuarioselect;
    private String accion = "create";
    @Wire
    Window windowUsuario;

    ServicioPais servicioPais = new ServicioPais();
    private List<CatPais> listaPais = new ArrayList<CatPais>();
    private CatPais catPaisSelected = null;

    ServicioProvincia servicioProvincia = new ServicioProvincia();
    private List<CatEstado> listaProvincia = new ArrayList<CatEstado>();
    private CatEstado catEstadoSelected = null;

    @AfterCompose
    public void afterCompose(@ExecutionArgParam("valor") Usuario valor, @ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);
        if (valor != null) {
            usuario = valor;
            accion = "update";
            tipoUsuarioselect = valor.getIdTipousuario() != null ? valor.getIdTipousuario() : null;
            catEstadoSelected = valor.getIdCatEstado() != null ? valor.getIdCatEstado() : null;
            catPaisSelected = valor.getIdCatEstado() != null ? valor.getIdCatEstado().getIdPais() : null;

            listaDatos = servicioTipoUsuario.findByTipoUsuario("");
            listaPais = servicioPais.findByPais("");
            listaProvincia = servicioProvincia.findByIdPais(catPaisSelected!=null?catPaisSelected.getId():null);
        } else {
            this.usuario = new Usuario();
            accion = "create";
            listaDatos = servicioTipoUsuario.findByTipoUsuario("");
            listaPais = servicioPais.findByPais("");
        }

    }

    public List<TipoUsuario> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<TipoUsuario> listaDatos) {
        this.listaDatos = listaDatos;
    }

    public TipoUsuario getTipoUsuarioselect() {
        return tipoUsuarioselect;
    }

    public void setTipoUsuarioselect(TipoUsuario tipoUsuarioselect) {
        this.tipoUsuarioselect = tipoUsuarioselect;
    }

    @Command
    @NotifyChange({"listaProvincia", "catEstadoSelected"})
    public void buscarProvincia() {
        listaProvincia = servicioProvincia.findByIdPais(catPaisSelected.getId());
        catEstadoSelected = null;

    }

    @Command
    public void guardar() {
        if (usuario.getEmail() != null
                && catEstadoSelected != null
                && catPaisSelected != null
                && usuario.getContrasenia() != null) {
            if (servicioUsuario.findByCorreo(usuario.getEmail()) != null && accion.equals("create")) {
                Clients.showNotification("El correo ya se encuentra registrado",
                        Clients.NOTIFICATION_TYPE_ERROR, null, "end_center", 3000, true);
                return;
            }
            usuario.setIdTipousuario(tipoUsuarioselect);
            usuario.setEdoConfirmacion(Boolean.TRUE);
            usuario.setIdCatEstado(catEstadoSelected);
            if (accion.equals("create")) {
                servicioUsuario.crear(usuario);
                // Messagebox.show("Guardado con exito");

                windowUsuario.detach();
            } else {
                servicioUsuario.modificar(usuario);
                // Messagebox.show("Guardado con exito");

                windowUsuario.detach();
            }
            Clients.showNotification("Guardado con exito", Clients.NOTIFICATION_TYPE_INFO, null, "end_before", 1000, true);
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

    public List<CatPais> getListaPais() {
        return listaPais;
    }

    public void setListaPais(List<CatPais> listaPais) {
        this.listaPais = listaPais;
    }

    public CatPais getCatPaisSelected() {
        return catPaisSelected;
    }

    public void setCatPaisSelected(CatPais catPaisSelected) {
        this.catPaisSelected = catPaisSelected;
    }

    public List<CatEstado> getListaProvincia() {
        return listaProvincia;
    }

    public void setListaProvincia(List<CatEstado> listaProvincia) {
        this.listaProvincia = listaProvincia;
    }

    public CatEstado getCatEstadoSelected() {
        return catEstadoSelected;
    }

    public void setCatEstadoSelected(CatEstado catEstadoSelected) {
        this.catEstadoSelected = catEstadoSelected;
    }

}
