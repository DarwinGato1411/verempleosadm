/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.empresavacante;

import com.ec.empresa.*;
import com.ec.entidad.*;
import com.ec.entidad.CatGiroEmpresa;
import com.ec.entidad.CatPais;
import com.ec.entidad.Empresa;
import com.ec.servicio.*;
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

    ServicioEmpresasPostulante servicioEmpresaPostulante = new ServicioEmpresasPostulante();
    private EmpresaPostulante empresapostulante = new EmpresaPostulante();

    ServicioEmpresasPostulante servicioempresapostulante = new ServicioEmpresasPostulante();
    private List<EmpresaPostulante> listaempresapostulante = new ArrayList<EmpresaPostulante>();
    private EmpresasVacante idEmpresasVacante = null;

    @AfterCompose
    public void afterCompose(@ExecutionArgParam("valor") EmpresasVacante valor, @ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);
        idEmpresasVacante = valor;
        buscarPostulantes();
    }

    public void buscarPostulantes() {
        System.out.println("com.ec.empresavacante.ModalPostulante.buscarPostulantes(idEmpresasVacante.getIdvacante())"+ idEmpresasVacante.getIdvacante());
        listaempresapostulante = servicioEmpresaPostulante.findByIdVacante(idEmpresasVacante.getIdvacante());

    }

    public List<EmpresaPostulante> getListaempresapostulante() {
        return listaempresapostulante;
    }

    public void setListaempresapostulante(List<EmpresaPostulante> listaempresapostulante) {
        this.listaempresapostulante = listaempresapostulante;
    }

    public ServicioEmpresasPostulante getServicioEmpresaPostulante() {
        return servicioEmpresaPostulante;
    }

    public void setServicioEmpresaPostulante(ServicioEmpresasPostulante servicioEmpresaPostulante) {
        this.servicioEmpresaPostulante = servicioEmpresaPostulante;
    }

    public EmpresaPostulante getEmpresapostulante() {
        return empresapostulante;
    }

    public void setEmpresapostulante(EmpresaPostulante empresapostulante) {
        this.empresapostulante = empresapostulante;
    }

}
