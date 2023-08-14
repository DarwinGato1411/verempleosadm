/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.catalogo;

import com.ec.entidad.CatPais;
import com.ec.entidad.CatTipoMoneda;
import com.ec.servicio.ServicioCatTipoMoneda;
import com.ec.servicio.ServicioGiro;
import com.ec.servicio.ServicioPais;
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
public class ModalPais {

    @Wire
    Window windowPais;

    ServicioPais serviciopais = new ServicioPais();
    private CatPais entidad = new CatPais();
    private String accion = "create";

    @AfterCompose
    public void afterCompose(@ExecutionArgParam("valor") CatPais valor, @ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);
        if (valor != null) {
             accion = "update";
            this.entidad = valor;
        } else {
            this.entidad = new CatPais();
            accion = "create";

        }

    }

    @Command
    public void guardar() {

        if (entidad != null
                && entidad.getPais()!= null) {

            if (accion.equals("create")) {
                serviciopais.crear(entidad);
                // Messagebox.show("Guardado con exito");

                windowPais.detach();
            } else {

                serviciopais.modificar(entidad);
                // Messagebox.show("Guardado con exito");

                windowPais.detach();
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

    public CatPais getEntidad() {
        return entidad;
    }

    public void setEntidad(CatPais entidad) {
        this.entidad = entidad;
    }
    
}
