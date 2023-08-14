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
@Table(name = "BusquedaCandudato")
@NamedQueries({
    @NamedQuery(name = "BusquedaCandudato.findAll", query = "SELECT b FROM BusquedaCandudato b")})
public class BusquedaCandudato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdUsuario")
    @Id
    private int idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "Apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Genero")
    private boolean genero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Vehiculo")
    private boolean vehiculo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NivelComputo")
    private int nivelComputo;
    @Column(name = "FechaActualizacionCurriculum")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacionCurriculum;
    @Size(max = 70)
    @Column(name = "Apellido2")
    private String apellido2;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SalarioMaximo")
    private BigDecimal salarioMaximo;
    @Column(name = "SalarioMinimo")
    private BigDecimal salarioMinimo;
    @Size(max = 2147483647)
    @Column(name = "Fotografia")
    private String fotografia;
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
    @Size(min = 1, max = 100)
    @Column(name = "Pais")
    private String pais;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idArea")
    private int idArea;
    @Size(max = 10)
    @Column(name = "nivel")
    private String nivel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Licencia")
    private boolean licencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTitulo")
    private int idTitulo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idIdioma")
    private int idIdioma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "puestoDesempeniado")
    private String puestoDesempeniado;

    public BusquedaCandudato() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean getGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(boolean vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNivelComputo() {
        return nivelComputo;
    }

    public void setNivelComputo(int nivelComputo) {
        this.nivelComputo = nivelComputo;
    }

    public Date getFechaActualizacionCurriculum() {
        return fechaActualizacionCurriculum;
    }

    public void setFechaActualizacionCurriculum(Date fechaActualizacionCurriculum) {
        this.fechaActualizacionCurriculum = fechaActualizacionCurriculum;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public BigDecimal getSalarioMaximo() {
        return salarioMaximo;
    }

    public void setSalarioMaximo(BigDecimal salarioMaximo) {
        this.salarioMaximo = salarioMaximo;
    }

    public BigDecimal getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(BigDecimal salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public boolean getLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }

    public int getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(int idTitulo) {
        this.idTitulo = idTitulo;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getPuestoDesempeniado() {
        return puestoDesempeniado;
    }

    public void setPuestoDesempeniado(String puestoDesempeniado) {
        this.puestoDesempeniado = puestoDesempeniado;
    }
    
}
