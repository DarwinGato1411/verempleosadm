/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.postulante;

import com.ec.*;
import com.ec.entidad.CatEstado;
import com.ec.entidad.CatGiroEmpresa;
import com.ec.entidad.CatPais;
import com.ec.*;
import com.ec.entidad.EmpresaPostulante;
import com.ec.servicio.*;
import com.ec.servicio.ServicioEmpresasPostulante;
import com.ec.servicio.ServicioGiro;
import com.ec.servicio.ServicioPais;
import com.ec.servicio.ServicioProvincia;
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
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Fileupload;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Window;

/**
 *
 * @author gato
 */
public class ModalPostulante {

    @Wire
    Window windowPostulante;
    @Wire
    //Combobox idProvincia;

    ServicioEmpresasPostulante servicioEmpresasPostulante = new ServicioEmpresasPostulante();
    private  EmpresaPostulante postulante = new EmpresaPostulante();
    //private String accion = "create";


    //ServicioUsuario servicioUsuario = new ServicioUsuario();

    @AfterCompose
   
    @Command

    public ServicioEmpresasPostulante getServicioEmpresasPostulante() {
        return servicioEmpresasPostulante;
    }

    public void setServicioEmpresasPostulante(ServicioEmpresasPostulante servicioEmpresasPostulante) {
        this.servicioEmpresasPostulante = servicioEmpresasPostulante;
    }

    public EmpresaPostulante getPostulante() {
        return postulante;
    }

    public void setPostulante(EmpresaPostulante postulante) {
        this.postulante = postulante;
    }
   
    
    
}
