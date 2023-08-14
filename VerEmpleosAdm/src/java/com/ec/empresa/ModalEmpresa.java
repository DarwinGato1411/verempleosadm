/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.empresa;

import com.ec.entidad.CatEstado;
import com.ec.entidad.CatGiroEmpresa;
import com.ec.entidad.CatPais;
import com.ec.entidad.Empresa;
import com.ec.servicio.ServicioEmpresa;
import com.ec.servicio.ServicioGiro;
import com.ec.servicio.ServicioPais;
import com.ec.servicio.ServicioProvincia;
import com.ec.servicio.ServicioUsuario;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.io.Files;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
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
public class ModalEmpresa {

    @Wire
    Window windowEmpresa;
    @Wire
    Combobox idProvincia;

    ServicioEmpresa servicioEmpresa = new ServicioEmpresa();
    private Empresa empresa = new Empresa();
    private String accion = "create";

    ServicioGiro servicioGiro = new ServicioGiro();
    private List<CatGiroEmpresa> listaGiro = new ArrayList<CatGiroEmpresa>();
    private CatGiroEmpresa catGiroEmpresaSelected = null;

    ServicioPais servicioPais = new ServicioPais();
    private List<CatPais> listaPais = new ArrayList<CatPais>();
    private CatPais catPaisSelected = null;

    ServicioProvincia servicioProvincia = new ServicioProvincia();
    private List<CatEstado> listaProvincia = new ArrayList<CatEstado>();
    private CatEstado catEstadoSelected = null;

    ServicioUsuario servicioUsuario = new ServicioUsuario();

    private String tipoStand = "1";

    @AfterCompose
    public void afterCompose(@ExecutionArgParam("valor") Empresa valor, @ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);
        if (valor != null) {
            empresa = valor;
            accion = "update";
            catGiroEmpresaSelected = empresa.getIdGiro() != null ? empresa.getIdGiro() : null;
            catEstadoSelected = empresa.getIdEstado() != 0 ? servicioProvincia.findByIdEstado(empresa.getIdEstado()) : null;
            catPaisSelected = empresa.getIdEstado() != 0 ? servicioPais.findByIdPais(empresa.getIdPais()) : null;
            listaGiro = servicioGiro.findByGiro("");
            listaPais = servicioPais.findByPais("");
            tipoStand = valor.getEmpTipoStand().toString();
            if (catPaisSelected != null) {
                listaProvincia = servicioProvincia.findByIdPais(catPaisSelected.getId());
            }

        } else {
            this.empresa = new Empresa();
            accion = "create";
            listaGiro = servicioGiro.findByGiro("");
            listaPais = servicioPais.findByPais("");
        }

    }

    @Command
    @NotifyChange({"listaProvincia", "catEstadoSelected"})
    public void buscarProvincia() {
        if (catPaisSelected != null) {
            listaProvincia = servicioProvincia.findByIdPais(catPaisSelected.getId());
            catEstadoSelected = null;
        }

    }

    @Command
    public void guardar() {

        if (catGiroEmpresaSelected != null
                    && catEstadoSelected != null
                    && catPaisSelected != null
                    && empresa.getNombreEmpresa() != null
                    && empresa.getApellidoEncargado() != null
                    && empresa.getRazonSocial() != null
                    && empresa.getRfc() != null
                    && empresa.getDescripcion() != null
                    && empresa.getDireccion() != null
                    && empresa.getTelefonoPrimario() != null
                    && empresa.getPaginaweb() != null
                    && empresa.getProductoServicio() != null
                    && empresa.getCiudad() != null) {
            if (servicioUsuario.findByCorreo(empresa.getEmailEmpresa()) != null && accion.equals("create")) {
                Clients.showNotification("El correo ya se encuentra registrado",
                            Clients.NOTIFICATION_TYPE_ERROR, null, "end_center", 3000, true);
                return;
            }
            empresa.setIdGeolocalizacion(1);
            empresa.setIdGiro(catGiroEmpresaSelected);
            empresa.setCantidadEmpleado(1);
            empresa.setIdEstado(catEstadoSelected.getId());
            empresa.setIdPais(catPaisSelected.getId());
            empresa.setTelefonoSecundario(empresa.getTelefonoSecundario() == null ? "" : empresa.getTelefonoSecundario());
            empresa.setReferido("");
            empresa.setFax(empresa.getFax() == null ? "" : empresa.getFax());
            empresa.setCodigoPostal(" ");
            empresa.setEmpTipoStand(Integer.valueOf(tipoStand));
            if (accion.equals("create")) {
                servicioEmpresa.crear(empresa, catEstadoSelected);
                // Messagebox.show("Guardado con exito");

                windowEmpresa.detach();
            } else {

                servicioEmpresa.modificar(empresa);
                // Messagebox.show("Guardado con exito");

                windowEmpresa.detach();
            }

        } else {
            Messagebox.show("Todos los campos son requeridos", "Atención", Messagebox.OK, Messagebox.ERROR);
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

    /*cargar imagen*/
    @Command
    @NotifyChange("empresa")
    public void subirFotografia() throws InterruptedException, IOException {

        String reportFile = "C:\\inetpub\\vhost\\VerEmpleos.com\\Imagenes\\imgferia2022";
//        String reportFile = Executions.getCurrent().getDesktop().getWebApp()
//                    .getRealPath("/imgferia2022");
        org.zkoss.util.media.Media media = Fileupload.get();
        if (media instanceof org.zkoss.image.Image) {
            if (media.getByteData().length > 10 * 1024 * 1024) {
                Messagebox.show("El arhivo seleccionado sobrepasa el tamaño de 10MB .\n Por favor seleccione un archivo más pequeño.");
                return;
            }

            File baseDir = new File(reportFile);
            if (!baseDir.exists()) {
                baseDir.mkdirs();
            }
            reportFile = reportFile + File.separator + media.getName().replace(" ", "_");
            Files.copy(new File(reportFile),
                        media.getStreamData());
            this.empresa.setLogoFeria(media.getName().replace(" ", "_"));
            this.empresa.setLogo(media.getByteData());
        }

    }

    public List<CatGiroEmpresa> getListaGiro() {
        return listaGiro;
    }

    public void setListaGiro(List<CatGiroEmpresa> listaGiro) {
        this.listaGiro = listaGiro;
    }

    public CatGiroEmpresa getCatGiroEmpresaSelected() {
        return catGiroEmpresaSelected;
    }

    public void setCatGiroEmpresaSelected(CatGiroEmpresa catGiroEmpresaSelected) {
        this.catGiroEmpresaSelected = catGiroEmpresaSelected;
    }

    public List<CatPais> getListaPais() {
        return listaPais;
    }

    public void setListaPais(List<CatPais> listaPais) {
        this.listaPais = listaPais;
    }

    public List<CatEstado> getListaProvincia() {
        return listaProvincia;
    }

    public void setListaProvincia(List<CatEstado> listaProvincia) {
        this.listaProvincia = listaProvincia;
    }

    public CatPais getCatPaisSelected() {
        return catPaisSelected;
    }

    public void setCatPaisSelected(CatPais catPaisSelected) {
        this.catPaisSelected = catPaisSelected;
    }

    public CatEstado getCatEstadoSelected() {
        return catEstadoSelected;
    }

    public void setCatEstadoSelected(CatEstado catEstadoSelected) {
        this.catEstadoSelected = catEstadoSelected;
    }

    public String getTipoStand() {
        return tipoStand;
    }

    public void setTipoStand(String tipoStand) {
        this.tipoStand = tipoStand;
    }

}
