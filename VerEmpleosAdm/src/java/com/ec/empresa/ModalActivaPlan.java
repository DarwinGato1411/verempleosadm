/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.empresa;

import com.ec.entidad.CatTipoMembresia;
import com.ec.entidad.Empresa;
import com.ec.entidad.MembresiaEmpresa;
import com.ec.servicio.ServicioCatTipoMembresia;
import com.ec.servicio.ServicioEmpresa;
import com.ec.servicio.ServicioMembresiaEmpresa;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Window;

/**
 *
 * @author gato
 */
public class ModalActivaPlan {

    @Wire
    Window windowEmpresa;
    @Wire
    Combobox idProvincia;

    ServicioEmpresa servicioEmpresa = new ServicioEmpresa();
    private Empresa empresa = new Empresa();
    private String accion = "create";

    ServicioMembresiaEmpresa servicioMembresiaEmpresa = new ServicioMembresiaEmpresa();
    private MembresiaEmpresa membresiaEmpresa1 = new MembresiaEmpresa();

    ServicioCatTipoMembresia servicioCatTipoMembresia = new ServicioCatTipoMembresia();
    private CatTipoMembresia catTipoMembresia = new CatTipoMembresia();
    private List<CatTipoMembresia> listaCatTipoMembresias = new ArrayList<CatTipoMembresia>();

    @AfterCompose
    public void afterCompose(@ExecutionArgParam("valor") Empresa valor, @ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);
        empresa = valor;
        listaCatTipoMembresias = servicioCatTipoMembresia.findMembresiasActivas("A");
        MembresiaEmpresa membresiaEmpresaRecup = servicioMembresiaEmpresa.findByIdEmpresa(valor);

        if (membresiaEmpresaRecup != null) {
            catTipoMembresia = servicioCatTipoMembresia.findById(membresiaEmpresaRecup.getIdTipoMembresia());
            accion = "update";
            membresiaEmpresa1 = membresiaEmpresaRecup;
        } else {
            accion = "create";
            membresiaEmpresa1 = new MembresiaEmpresa();
            membresiaEmpresa1.setFechaInicio(new Date());
            membresiaEmpresa1.setFechaFin(new Date());
            membresiaEmpresa1.setFechaCompra(new Date());
            membresiaEmpresa1.setIdEmpresa(empresa);
            membresiaEmpresa1.setBusqCandIlimitada(Boolean.TRUE);
            membresiaEmpresa1.setVacantesIlimitadas(Boolean.TRUE);
            
            
        }

    }

    @Command
    public void guardar() {
        if (catTipoMembresia != null) {
            if (accion.equals("update")) {
                membresiaEmpresa1.setIdTipoMembresia(catTipoMembresia.getId());
                servicioMembresiaEmpresa.modificar(membresiaEmpresa1);
                Clients.showNotification("Membresia modificada correctamente",
                            Clients.NOTIFICATION_TYPE_INFO, null, "middle_center", 2000, true);
            } else {
                membresiaEmpresa1.setIdTipoMembresia(catTipoMembresia.getId());
                membresiaEmpresa1.setIdEmpresa(empresa);

                membresiaEmpresa1.setComentarios("Se crea la membresia desde el modulo administrador");
                membresiaEmpresa1.setBusqCandIlimitada(Boolean.TRUE);
                membresiaEmpresa1.setVacantesIlimitadas(Boolean.TRUE);
                servicioMembresiaEmpresa.crear(membresiaEmpresa1);
                Clients.showNotification("Membresia creada correctamente",
                            Clients.NOTIFICATION_TYPE_INFO, null, "middle_center", 2000, true);
            }
        } else {
            Clients.showNotification("Debe seleccionar un tipo de membresia",
                        Clients.NOTIFICATION_TYPE_ERROR, null, "middle_center", 2000, true);
        }

    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public MembresiaEmpresa getMembresiaEmpresa1() {
        return membresiaEmpresa1;
    }

    public void setMembresiaEmpresa1(MembresiaEmpresa membresiaEmpresa1) {
        this.membresiaEmpresa1 = membresiaEmpresa1;
    }

    public CatTipoMembresia getCatTipoMembresia() {
        return catTipoMembresia;
    }

    public void setCatTipoMembresia(CatTipoMembresia catTipoMembresia) {
        this.catTipoMembresia = catTipoMembresia;
    }

    public List<CatTipoMembresia> getListaCatTipoMembresias() {
        return listaCatTipoMembresias;
    }

    public void setListaCatTipoMembresias(List<CatTipoMembresia> listaCatTipoMembresias) {
        this.listaCatTipoMembresias = listaCatTipoMembresias;
    }

}
