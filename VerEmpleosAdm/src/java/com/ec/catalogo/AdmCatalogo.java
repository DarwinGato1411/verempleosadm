/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.catalogo;

import com.ec.entidad.CatEstado;
import com.ec.entidad.CatGiroEmpresa;
import com.ec.entidad.CatIdioma;
import com.ec.entidad.CatPais;
import com.ec.entidad.CatTipoMoneda;
import com.ec.entidad.Empresa;
import com.ec.seguridad.EnumSesion;
import com.ec.seguridad.UserCredential;
import com.ec.servicio.ServicioCatTipoMoneda;
import com.ec.servicio.ServicioGiro;
import com.ec.servicio.ServicioPais;
import com.ec.servicio.ServicioProvincia;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Messagebox;

/**
 *
 * @author root
 */
public class AdmCatalogo {

    /*Es para  giro de negocio*/
    ServicioGiro servicioGiro = new ServicioGiro();
    UserCredential credential = new UserCredential();
    private List<CatGiroEmpresa> listaDatos = new ArrayList<CatGiroEmpresa>();

    private String buscar = "";
    /*Para CatTipoMoneda*/
    ServicioCatTipoMoneda serviciocattipomoneda = new ServicioCatTipoMoneda();
    private List<CatTipoMoneda> listaDatosMoneda = new ArrayList<CatTipoMoneda>();

    private String buscarMoneda = "";
    /*Para Pais*/
    ServicioPais servicioPais = new ServicioPais();
    private List<CatPais> listaDatosPais = new ArrayList<CatPais>();
    private ListModelList<CatPais> listaPaisModel;
    private Set<CatPais> registrosSeleccionados = new HashSet<CatPais>();
    private CatPais paisSelected = null;

    private String buscarPais = "";
    /*Para Provincia-Estado*/
    ServicioProvincia servicioProvincia = new ServicioProvincia();
    private List<CatEstado> listaDatosProvin = new ArrayList<CatEstado>();

    
    private List<CatIdioma> listCatIdiomas;
    
    private String buscarProvincia = "";

//    /*Para CatTipoMoneda*/
//    ServicioCatTipoMoneda serviciocattipomoneda = new ServicioCatTipoMoneda();
//    private List<CatTipoMoneda> listaDatosMoneda = new ArrayList<CatTipoMoneda>();
//
//    private String buscarMoneda = "";
    public AdmCatalogo() {
        Session sess = Sessions.getCurrent();
        UserCredential cre = (UserCredential) sess.getAttribute(EnumSesion.userCredential.getNombre());
        credential = cre;
        buscar();
        buscarMoneda();

        //llena el list model y consulta a la base de datos 
        getObtenerPais();
        buscarProvincia();
    }

//    para buscar y seleccionar los registros de pais
    private void getObtenerPais() {
        buscarPais();
        
        setListaPaisModel(new ListModelList<CatPais>(getListaDatosPais()));
        ((ListModelList<CatPais>) listaPaisModel).setMultiple(false);
    }

    @Command
    @NotifyChange({"listaDatosProvin"})
    public void seleccionarRegistros() {

        registrosSeleccionados = ((ListModelList<CatPais>) getListaPaisModel()).getSelection();
        for (CatPais item : registrosSeleccionados) {
            paisSelected = item;
            break;
        }
        buscarProvincia();
    }

    private void buscar() {

        listaDatos = servicioGiro.findByGiro(buscar);
    }

    private void buscarMoneda() {

        listaDatosMoneda = serviciocattipomoneda.findByMoneda(buscarMoneda);
    }

    private void buscarPais() {

        listaDatosPais = servicioPais.findByPais(buscarPais);
    }

    private void buscarProvincia() {

        listaDatosProvin = servicioProvincia.findByIdPaisNombrePais(paisSelected,buscarProvincia);
    }

    public List<CatGiroEmpresa> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<CatGiroEmpresa> listaDatos) {
        this.listaDatos = listaDatos;
    }

    public ServicioCatTipoMoneda getServiciocattipomoneda() {
        return serviciocattipomoneda;
    }

    public void setServiciocattipomoneda(ServicioCatTipoMoneda serviciocattipomoneda) {
        this.serviciocattipomoneda = serviciocattipomoneda;
    }

    public List<CatTipoMoneda> getListaDatosMoneda() {
        return listaDatosMoneda;
    }

    public void setListaDatosMoneda(List<CatTipoMoneda> listaDatosMoneda) {
        this.listaDatosMoneda = listaDatosMoneda;
    }

    public List<CatPais> getListaDatosPais() {
        return listaDatosPais;
    }

    public void setListaDatosPais(List<CatPais> listaDatosPais) {
        this.listaDatosPais = listaDatosPais;
    }

    public List<CatEstado> getListaDatosProvin() {
        return listaDatosProvin;
    }

    public void setListaDatosProvin(List<CatEstado> listaDatosProvin) {
        this.listaDatosProvin = listaDatosProvin;
    }

    @Command
    @NotifyChange({"listaDatos", "buscar"})
    public void buscarGiro() {

        buscar();
    }

    @Command
    public void modificaRegistro(@BindingParam("valor") CatGiroEmpresa valor) {

        try {
            final HashMap<String, CatGiroEmpresa> map = new HashMap<String, CatGiroEmpresa>();

            map.put("valor", valor);
            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                    "/modales/modalgiro.zul", null, map);
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
                    "/modales/modalgiro.zul", null, null);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }

    @Command
    public void eliminarEmpresa(@BindingParam("valor") Empresa valor) {
        if (Messagebox.show("¿Desea eliminar el registros ?", "Atención", Messagebox.YES | Messagebox.NO, Messagebox.EXCLAMATION) == Messagebox.YES) {

        }
    }

    @Command
    @NotifyChange({"listaDatosMoneda", "buscarMoneda"})
    public void buscarTipoMoneda() {

        buscarMoneda();
    }

    @Command
    public void modificarMoneda(@BindingParam("valor") CatTipoMoneda valor) {

        try {
            final HashMap<String, CatTipoMoneda> map = new HashMap<String, CatTipoMoneda>();

            map.put("valor", valor);
            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                    "/modales/modalmoneda.zul", null, map);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }

    @Command
    public void crearMoneda() {

        try {

            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                    "/modales/modalmoneda.zul", null, null);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }

    @Command
    public void eliminarMOneda(@BindingParam("valor") Empresa valor) {
        if (Messagebox.show("¿Desea eliminar el registros ?", "Atención", Messagebox.YES | Messagebox.NO, Messagebox.EXCLAMATION) == Messagebox.YES) {

        }
    }

    @Command
    @NotifyChange({"listaPaisModel", "buscarPais"})
    public void buscarPaisVer() {

       getObtenerPais();
    }

    @Command
    public void modificarPais(@BindingParam("valor") CatPais valor) {

        try {
            final HashMap<String, CatPais> map = new HashMap<String, CatPais>();

            map.put("valor", valor);
            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                    "/modales/modalpais.zul", null, map);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }

    @Command
    public void crearPais() {

        try {

            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                    "/modales/modalpais.zul", null, null);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }

    @Command
    public void eliminarPais(@BindingParam("valor") Empresa valor) {
        if (Messagebox.show("¿Desea eliminar el registros ?", "Atención", Messagebox.YES | Messagebox.NO, Messagebox.EXCLAMATION) == Messagebox.YES) {

        }
    }

    @Command
    @NotifyChange({"listaDatosProvin", "buscarProvincia"})
    public void buscarProvinciaVer() {

        buscarProvincia();
    }

    @Command
    public void modificarProvincia(@BindingParam("valor") CatEstado valor) {

        try {
            final HashMap<String, CatEstado> map = new HashMap<String, CatEstado>();

            map.put("valor", valor);
            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                    "/modales/modalprovincia.zul", null, map);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }

    @Command
    public void crearProvincia() {

        try {

            org.zkoss.zul.Window window = (org.zkoss.zul.Window) Executions.createComponents(
                    "/modales/modalprovincia.zul", null, null);
            window.doModal();
//            window.detach();
        } catch (Exception e) {
            Messagebox.show("Error " + e.toString(), "Atención", Messagebox.OK, Messagebox.INFORMATION);
        }
    }

    @Command
    public void eliminarProvincia(@BindingParam("valor") Empresa valor) {
        if (Messagebox.show("¿Desea eliminar el registros ?", "Atención", Messagebox.YES | Messagebox.NO, Messagebox.EXCLAMATION) == Messagebox.YES) {

        }
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

    public String getBuscarMoneda() {
        return buscarMoneda;
    }

    public void setBuscarMoneda(String buscarMoneda) {
        this.buscarMoneda = buscarMoneda;
    }

    public String getBuscarPais() {
        return buscarPais;
    }

    public void setBuscarPais(String buscarPais) {
        this.buscarPais = buscarPais;
    }

    public String getBuscarProvincia() {
        return buscarProvincia;
    }

    public void setBuscarProvincia(String buscarProvincia) {
        this.buscarProvincia = buscarProvincia;
    }

    public ListModelList<CatPais> getListaPaisModel() {
        return listaPaisModel;
    }

    public void setListaPaisModel(ListModelList<CatPais> listaPaisModel) {
        this.listaPaisModel = listaPaisModel;
    }

    public Set<CatPais> getRegistrosSeleccionados() {
        return registrosSeleccionados;
    }

    public void setRegistrosSeleccionados(Set<CatPais> registrosSeleccionados) {
        this.registrosSeleccionados = registrosSeleccionados;
    }

    public CatPais getPaisSelected() {
        return paisSelected;
    }

    public void setPaisSelected(CatPais paisSelected) {
        this.paisSelected = paisSelected;
    }

}
