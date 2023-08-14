/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.catalogo;

import com.ec.entidad.CatEstado;
import com.ec.entidad.CatPais;
import com.ec.entidad.CatTipoMoneda;
import com.ec.servicio.ServicioCatTipoMoneda;
import com.ec.servicio.ServicioGiro;
import com.ec.servicio.ServicioPais;
import com.ec.servicio.ServicioProvincia;
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
public class ModalProvincia {

    @Wire
    Window windowProvincia;

    ServicioProvincia servicioprovincia = new ServicioProvincia();
    private CatEstado entidad = new CatEstado();
    private String accion = "create";

    @AfterCompose
    public void afterCompose(@ExecutionArgParam("valor") CatEstado valor, @ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);
        if (valor != null) {
             accion = "update";
            this.entidad = valor;
        } else {
            this.entidad = new CatEstado();
            accion = "create";

        }

    }

    @Command
    public void guardar() {

        if (entidad != null
                && entidad.getEstado()!= null) {

            if (accion.equals("create")) {
                servicioprovincia.crear(entidad);
                // Messagebox.show("Guardado con exito");

                windowProvincia.detach();
            } else {

                servicioprovincia.modificar(entidad);
                // Messagebox.show("Guardado con exito");

                windowProvincia.detach();
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

    public CatEstado getEntidad() {
        return entidad;
    }

    public void setEntidad(CatEstado entidad) {
        this.entidad = entidad;
    }
    
}
