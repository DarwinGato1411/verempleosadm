/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "vs_app_VacanteActiva")
@NamedQueries({
    @NamedQuery(name = "VsappVacanteActiva.findAll", query = "SELECT v FROM VsappVacanteActiva v")})
public class VsappVacanteActiva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdVacante")
    private Integer idVacante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdUsuario")
    private int idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "Puesto")
    private String puesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "DescripcionPuesto")
    private String descripcionPuesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "PalabrasClave")
    private String palabrasClave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "DireccionDeTrabajo")
    private String direccionDeTrabajo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MostrarDireccion")
    private boolean mostrarDireccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RecibirCVEnPanel")
    private boolean recibirCVEnPanel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdArea")
    private int idArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdSubArea")
    private int idSubArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPais")
    private int idPais;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdEstado")
    private int idEstado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ReqExperienciaMinima")
    private String reqExperienciaMinima;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ReqEdadMinima")
    private String reqEdadMinima;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ReqEdadMaxima")
    private String reqEdadMaxima;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReqTipoEdad")
    private int reqTipoEdad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReqGenero")
    private int reqGenero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReqSalarioMinimo")
    private BigDecimal reqSalarioMinimo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReqSalarioMaximo")
    private BigDecimal reqSalarioMaximo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReqSalarioTipoPago")
    private int reqSalarioTipoPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReqSalarioFormaPago")
    private int reqSalarioFormaPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReqMostrarEnAviso")
    private boolean reqMostrarEnAviso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReqSolicitarSalarioPostulante")
    private boolean reqSolicitarSalarioPostulante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ReqTecnologia")
    private String reqTecnologia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaPublicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPublicacion;
    @Column(name = "FechaFinPublicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinPublicacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NotRecibirTodo")
    private boolean notRecibirTodo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NotRecibirResumen")
    private boolean notRecibirResumen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NotPrimerPostulante")
    private boolean notPrimerPostulante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NotDesactivarNotificaciones")
    private boolean notDesactivarNotificaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TipoPuesto")
    private int tipoPuesto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdIdioma")
    private int idIdioma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdNivelIdioma")
    private int idNivelIdioma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdEducacion")
    private int idEducacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdEstatusEducacion")
    private int idEstatusEducacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Activa")
    private boolean activa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Vistas")
    private int vistas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Actividad")
    private int actividad;
    @Column(name = "IdGeolocalizacion")
    private Integer idGeolocalizacion;
    @Column(name = "IdTipoMoneda")
    private Integer idTipoMoneda;

    public VsappVacanteActiva() {
    }

    public VsappVacanteActiva(Integer idVacante) {
        this.idVacante = idVacante;
    }

    public VsappVacanteActiva(Integer idVacante, int idUsuario, String puesto, String descripcionPuesto, String palabrasClave, String direccionDeTrabajo, boolean mostrarDireccion, boolean recibirCVEnPanel, int idArea, int idSubArea, int idPais, int idEstado, String reqExperienciaMinima, String reqEdadMinima, String reqEdadMaxima, int reqTipoEdad, int reqGenero, BigDecimal reqSalarioMinimo, BigDecimal reqSalarioMaximo, int reqSalarioTipoPago, int reqSalarioFormaPago, boolean reqMostrarEnAviso, boolean reqSolicitarSalarioPostulante, String reqTecnologia, Date fechaPublicacion, boolean notRecibirTodo, boolean notRecibirResumen, boolean notPrimerPostulante, boolean notDesactivarNotificaciones, int tipoPuesto, int idIdioma, int idNivelIdioma, int idEducacion, int idEstatusEducacion, boolean activa, int vistas, int actividad) {
        this.idVacante = idVacante;
        this.idUsuario = idUsuario;
        this.puesto = puesto;
        this.descripcionPuesto = descripcionPuesto;
        this.palabrasClave = palabrasClave;
        this.direccionDeTrabajo = direccionDeTrabajo;
        this.mostrarDireccion = mostrarDireccion;
        this.recibirCVEnPanel = recibirCVEnPanel;
        this.idArea = idArea;
        this.idSubArea = idSubArea;
        this.idPais = idPais;
        this.idEstado = idEstado;
        this.reqExperienciaMinima = reqExperienciaMinima;
        this.reqEdadMinima = reqEdadMinima;
        this.reqEdadMaxima = reqEdadMaxima;
        this.reqTipoEdad = reqTipoEdad;
        this.reqGenero = reqGenero;
        this.reqSalarioMinimo = reqSalarioMinimo;
        this.reqSalarioMaximo = reqSalarioMaximo;
        this.reqSalarioTipoPago = reqSalarioTipoPago;
        this.reqSalarioFormaPago = reqSalarioFormaPago;
        this.reqMostrarEnAviso = reqMostrarEnAviso;
        this.reqSolicitarSalarioPostulante = reqSolicitarSalarioPostulante;
        this.reqTecnologia = reqTecnologia;
        this.fechaPublicacion = fechaPublicacion;
        this.notRecibirTodo = notRecibirTodo;
        this.notRecibirResumen = notRecibirResumen;
        this.notPrimerPostulante = notPrimerPostulante;
        this.notDesactivarNotificaciones = notDesactivarNotificaciones;
        this.tipoPuesto = tipoPuesto;
        this.idIdioma = idIdioma;
        this.idNivelIdioma = idNivelIdioma;
        this.idEducacion = idEducacion;
        this.idEstatusEducacion = idEstatusEducacion;
        this.activa = activa;
        this.vistas = vistas;
        this.actividad = actividad;
    }

    public Integer getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(Integer idVacante) {
        this.idVacante = idVacante;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcionPuesto() {
        return descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
    }

    public String getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public String getDireccionDeTrabajo() {
        return direccionDeTrabajo;
    }

    public void setDireccionDeTrabajo(String direccionDeTrabajo) {
        this.direccionDeTrabajo = direccionDeTrabajo;
    }

    public boolean getMostrarDireccion() {
        return mostrarDireccion;
    }

    public void setMostrarDireccion(boolean mostrarDireccion) {
        this.mostrarDireccion = mostrarDireccion;
    }

    public boolean getRecibirCVEnPanel() {
        return recibirCVEnPanel;
    }

    public void setRecibirCVEnPanel(boolean recibirCVEnPanel) {
        this.recibirCVEnPanel = recibirCVEnPanel;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdSubArea() {
        return idSubArea;
    }

    public void setIdSubArea(int idSubArea) {
        this.idSubArea = idSubArea;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getReqExperienciaMinima() {
        return reqExperienciaMinima;
    }

    public void setReqExperienciaMinima(String reqExperienciaMinima) {
        this.reqExperienciaMinima = reqExperienciaMinima;
    }

    public String getReqEdadMinima() {
        return reqEdadMinima;
    }

    public void setReqEdadMinima(String reqEdadMinima) {
        this.reqEdadMinima = reqEdadMinima;
    }

    public String getReqEdadMaxima() {
        return reqEdadMaxima;
    }

    public void setReqEdadMaxima(String reqEdadMaxima) {
        this.reqEdadMaxima = reqEdadMaxima;
    }

    public int getReqTipoEdad() {
        return reqTipoEdad;
    }

    public void setReqTipoEdad(int reqTipoEdad) {
        this.reqTipoEdad = reqTipoEdad;
    }

    public int getReqGenero() {
        return reqGenero;
    }

    public void setReqGenero(int reqGenero) {
        this.reqGenero = reqGenero;
    }

    public BigDecimal getReqSalarioMinimo() {
        return reqSalarioMinimo;
    }

    public void setReqSalarioMinimo(BigDecimal reqSalarioMinimo) {
        this.reqSalarioMinimo = reqSalarioMinimo;
    }

    public BigDecimal getReqSalarioMaximo() {
        return reqSalarioMaximo;
    }

    public void setReqSalarioMaximo(BigDecimal reqSalarioMaximo) {
        this.reqSalarioMaximo = reqSalarioMaximo;
    }

    public int getReqSalarioTipoPago() {
        return reqSalarioTipoPago;
    }

    public void setReqSalarioTipoPago(int reqSalarioTipoPago) {
        this.reqSalarioTipoPago = reqSalarioTipoPago;
    }

    public int getReqSalarioFormaPago() {
        return reqSalarioFormaPago;
    }

    public void setReqSalarioFormaPago(int reqSalarioFormaPago) {
        this.reqSalarioFormaPago = reqSalarioFormaPago;
    }

    public boolean getReqMostrarEnAviso() {
        return reqMostrarEnAviso;
    }

    public void setReqMostrarEnAviso(boolean reqMostrarEnAviso) {
        this.reqMostrarEnAviso = reqMostrarEnAviso;
    }

    public boolean getReqSolicitarSalarioPostulante() {
        return reqSolicitarSalarioPostulante;
    }

    public void setReqSolicitarSalarioPostulante(boolean reqSolicitarSalarioPostulante) {
        this.reqSolicitarSalarioPostulante = reqSolicitarSalarioPostulante;
    }

    public String getReqTecnologia() {
        return reqTecnologia;
    }

    public void setReqTecnologia(String reqTecnologia) {
        this.reqTecnologia = reqTecnologia;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Date getFechaFinPublicacion() {
        return fechaFinPublicacion;
    }

    public void setFechaFinPublicacion(Date fechaFinPublicacion) {
        this.fechaFinPublicacion = fechaFinPublicacion;
    }

    public boolean getNotRecibirTodo() {
        return notRecibirTodo;
    }

    public void setNotRecibirTodo(boolean notRecibirTodo) {
        this.notRecibirTodo = notRecibirTodo;
    }

    public boolean getNotRecibirResumen() {
        return notRecibirResumen;
    }

    public void setNotRecibirResumen(boolean notRecibirResumen) {
        this.notRecibirResumen = notRecibirResumen;
    }

    public boolean getNotPrimerPostulante() {
        return notPrimerPostulante;
    }

    public void setNotPrimerPostulante(boolean notPrimerPostulante) {
        this.notPrimerPostulante = notPrimerPostulante;
    }

    public boolean getNotDesactivarNotificaciones() {
        return notDesactivarNotificaciones;
    }

    public void setNotDesactivarNotificaciones(boolean notDesactivarNotificaciones) {
        this.notDesactivarNotificaciones = notDesactivarNotificaciones;
    }

    public int getTipoPuesto() {
        return tipoPuesto;
    }

    public void setTipoPuesto(int tipoPuesto) {
        this.tipoPuesto = tipoPuesto;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public int getIdNivelIdioma() {
        return idNivelIdioma;
    }

    public void setIdNivelIdioma(int idNivelIdioma) {
        this.idNivelIdioma = idNivelIdioma;
    }

    public int getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(int idEducacion) {
        this.idEducacion = idEducacion;
    }

    public int getIdEstatusEducacion() {
        return idEstatusEducacion;
    }

    public void setIdEstatusEducacion(int idEstatusEducacion) {
        this.idEstatusEducacion = idEstatusEducacion;
    }

    public boolean getActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getVistas() {
        return vistas;
    }

    public void setVistas(int vistas) {
        this.vistas = vistas;
    }

    public int getActividad() {
        return actividad;
    }

    public void setActividad(int actividad) {
        this.actividad = actividad;
    }

    public Integer getIdGeolocalizacion() {
        return idGeolocalizacion;
    }

    public void setIdGeolocalizacion(Integer idGeolocalizacion) {
        this.idGeolocalizacion = idGeolocalizacion;
    }

    public Integer getIdTipoMoneda() {
        return idTipoMoneda;
    }

    public void setIdTipoMoneda(Integer idTipoMoneda) {
        this.idTipoMoneda = idTipoMoneda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVacante != null ? idVacante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VsappVacanteActiva)) {
            return false;
        }
        VsappVacanteActiva other = (VsappVacanteActiva) object;
        if ((this.idVacante == null && other.idVacante != null) || (this.idVacante != null && !this.idVacante.equals(other.idVacante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.VsappVacanteActiva[ idVacante=" + idVacante + " ]";
    }
    
}
