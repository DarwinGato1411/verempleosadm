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
import javax.persistence.Lob;
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
@Table(name = "vs_Vacante")
@NamedQueries({
    @NamedQuery(name = "VsVacante.findAll", query = "SELECT v FROM VsVacante v")})
public class VsVacante implements Serializable {
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
    @Size(min = 1, max = 50)
    @Column(name = "NombreEmpresa")
    private String nombreEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaPublicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPublicacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "area")
    private String area;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre")
    private String nombre;
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
    @Size(min = 1, max = 100)
    @Column(name = "Pais")
    private String pais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "DescripcionPuesto")
    private String descripcionPuesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "DireccionDeTrabajo")
    private String direccionDeTrabajo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MostrarDireccion")
    private boolean mostrarDireccion;
    @Lob
    @Column(name = "Logo")
    private byte[] logo;
    @Size(max = 30)
    @Column(name = "jornada")
    private String jornada;
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
    @Column(name = "ReqGenero")
    private int reqGenero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ReqExperienciaMinima")
    private String reqExperienciaMinima;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReqMostrarEnAviso")
    private boolean reqMostrarEnAviso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Activa")
    private boolean activa;
    @Size(max = 20)
    @Column(name = "idioma")
    private String idioma;
    @Size(max = 10)
    @Column(name = "Nivel")
    private String nivel;
    @Size(max = 20)
    @Column(name = "status")
    private String status;
    @Size(max = 15)
    @Column(name = "EduNivel")
    private String eduNivel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NotDesactivarNotificaciones")
    private boolean notDesactivarNotificaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdArea")
    private int idArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPais")
    private int idPais;
    @Column(name = "IdTipoMoneda")
    private Integer idTipoMoneda;
    @Size(max = 300)
    @Column(name = "Moneda")
    private String moneda;
    @Column(name = "IdGeolocalizacion")
    private Integer idGeolocalizacion;
    @Column(name = "FechaFinPublicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinPublicacion;
    @Column(name = "MostrarDatosEmp")
    private Boolean mostrarDatosEmp;
    @Size(max = 1000)
    @Column(name = "Descripcion")
    private String descripcion;
    @Size(max = 100)
    @Column(name = "NombreImagen")
    private String nombreImagen;
    @Size(max = 500)
    @Column(name = "PathImagen")
    private String pathImagen;

    public VsVacante() {
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

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getDescripcionPuesto() {
        return descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
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

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
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

    public int getReqGenero() {
        return reqGenero;
    }

    public void setReqGenero(int reqGenero) {
        this.reqGenero = reqGenero;
    }

    public String getReqExperienciaMinima() {
        return reqExperienciaMinima;
    }

    public void setReqExperienciaMinima(String reqExperienciaMinima) {
        this.reqExperienciaMinima = reqExperienciaMinima;
    }

    public boolean getReqMostrarEnAviso() {
        return reqMostrarEnAviso;
    }

    public void setReqMostrarEnAviso(boolean reqMostrarEnAviso) {
        this.reqMostrarEnAviso = reqMostrarEnAviso;
    }

    public boolean getActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEduNivel() {
        return eduNivel;
    }

    public void setEduNivel(String eduNivel) {
        this.eduNivel = eduNivel;
    }

    public boolean getNotDesactivarNotificaciones() {
        return notDesactivarNotificaciones;
    }

    public void setNotDesactivarNotificaciones(boolean notDesactivarNotificaciones) {
        this.notDesactivarNotificaciones = notDesactivarNotificaciones;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public Integer getIdTipoMoneda() {
        return idTipoMoneda;
    }

    public void setIdTipoMoneda(Integer idTipoMoneda) {
        this.idTipoMoneda = idTipoMoneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Integer getIdGeolocalizacion() {
        return idGeolocalizacion;
    }

    public void setIdGeolocalizacion(Integer idGeolocalizacion) {
        this.idGeolocalizacion = idGeolocalizacion;
    }

    public Date getFechaFinPublicacion() {
        return fechaFinPublicacion;
    }

    public void setFechaFinPublicacion(Date fechaFinPublicacion) {
        this.fechaFinPublicacion = fechaFinPublicacion;
    }

    public Boolean getMostrarDatosEmp() {
        return mostrarDatosEmp;
    }

    public void setMostrarDatosEmp(Boolean mostrarDatosEmp) {
        this.mostrarDatosEmp = mostrarDatosEmp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public String getPathImagen() {
        return pathImagen;
    }

    public void setPathImagen(String pathImagen) {
        this.pathImagen = pathImagen;
    }
    
}
