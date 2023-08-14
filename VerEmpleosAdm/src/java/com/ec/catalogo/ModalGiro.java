/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.catalogo;

import com.ec.entidad.CatGiroEmpresa;
import com.ec.servicio.ServicioGiro;
import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Window;

/**
 *
 * @author root
 */
public class ModalGiro {

    @Wire
    Window windowGiro;

    ServicioGiro servicioGiro = new ServicioGiro();
    private CatGiroEmpresa entidad = new CatGiroEmpresa();
    private String accion = "create";

    @AfterCompose
    public void afterCompose(@ExecutionArgParam("valor") CatGiroEmpresa valor, @ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);
        if (valor != null) {
             accion = "update";
            this.entidad = valor;
        } else {
            this.entidad = new CatGiroEmpresa();
            accion = "create";

        }

    }

    @Command
    public void guardar() {

        if (entidad != null
                && entidad.getGiro() != null) {

            if (accion.equals("create")) {
                servicioGiro.crear(entidad);
                // Messagebox.show("Guardado con exito");

                windowGiro.detach();
            } else {

                servicioGiro.modificar(entidad);
                // Messagebox.show("Guardado con exito");

                windowGiro.detach();
            }

        } else {
            Messagebox.show("Todos los campos son requeridos", "Atención", Messagebox.OK, Messagebox.ERROR);
        }
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public CatGiroEmpresa getEntidad() {
        return entidad;
    }

    public void setEntidad(CatGiroEmpresa entidad) {
        this.entidad = entidad;
    }

}
