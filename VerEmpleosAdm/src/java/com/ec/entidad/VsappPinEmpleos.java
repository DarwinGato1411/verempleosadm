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
@Table(name = "vs_app_PinEmpleos")
@NamedQueries({
    @NamedQuery(name = "VsappPinEmpleos.findAll", query = "SELECT v FROM VsappPinEmpleos v")})
public class VsappPinEmpleos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdVacante")
    @Id
    private int idVacante;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private int id;
    @Column(name = "Latitud")
    private BigDecimal latitud;
    @Column(name = "Longitud")
    private BigDecimal longitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Pais")
    private String pais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Estado")
    private String estado;
    @Size(max = 100)
    @Column(name = "ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "codigoPostal")
    private String codigoPostal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUbicacion")
    private int idUbicacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NombreEmpresa")
    private String nombreEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Paginaweb")
    private String paginaweb;

    public VsappPinEmpleos() {
    }

    public int getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(int idVacante) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getPaginaweb() {
        return paginaweb;
    }

    public void setPaginaweb(String paginaweb) {
        this.paginaweb = paginaweb;
    }
    
}
