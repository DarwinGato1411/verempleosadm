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
@Table(name = "vs_CandidatoBusqueda")
@NamedQueries({
    @NamedQuery(name = "VsCandidatoBusqueda.findAll", query = "SELECT v FROM VsCandidatoBusqueda v")})
public class VsCandidatoBusqueda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre")
    @Id
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "Apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CedulaIdentificacion")
    private String cedulaIdentificacion;
    @Column(name = "idEstado")
    private Integer idEstado;
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
    @Column(name = "Licencia")
    private boolean licencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NivelComputo")
    private int nivelComputo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SalarioMinimo")
    private BigDecimal salarioMinimo;
    @Column(name = "SalarioMaximo")
    private BigDecimal salarioMaximo;
    @Column(name = "FechaActualizacionCurriculum")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacionCurriculum;
    @Size(max = 100)
    @Column(name = "Estado")
    private String estado;
    @Column(name = "idPais")
    private Integer idPais;
    @Size(max = 100)
    @Column(name = "Pais")
    private String pais;
    @Column(name = "VerReferencia")
    private Boolean verReferencia;
    @Column(name = "CorreoInformativo")
    private Boolean correoInformativo;
    @Column(name = "EstadoCurriculum")
    private Boolean estadoCurriculum;
    @Column(name = "VerPruebaPsicometrica")
    private Boolean verPruebaPsicometrica;
    @Column(name = "VerPruebaCompetencia")
    private Boolean verPruebaCompetencia;
    @Column(name = "VerPruebaIngles")
    private Boolean verPruebaIngles;
    @Column(name = "idAreaInteres")
    private Integer idAreaInteres;
    @Column(name = "idSubArea")
    private Integer idSubArea;
    @Column(name = "idIdioma")
    private Integer idIdioma;
    @Size(max = 10)
    @Column(name = "nivel")
    private String nivel;
    @Size(max = 60)
    @Column(name = "puestoDesempeniado")
    private String puestoDesempeniado;
    @Size(max = 50)
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Column(name = "idArea")
    private Integer idArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdUsuario")
    private int idUsuario;
    @Column(name = "IdTitulo")
    private Integer idTitulo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Vehiculo")
    private boolean vehiculo;
    @Lob
    @Column(name = "FotografiaMiniatura")
    private byte[] fotografiaMiniatura;

    public VsCandidatoBusqueda() {
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

    public String getCedulaIdentificacion() {
        return cedulaIdentificacion;
    }

    public void setCedulaIdentificacion(String cedulaIdentificacion) {
        this.cedulaIdentificacion = cedulaIdentificacion;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
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

    public boolean getLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }

    public int getNivelComputo() {
        return nivelComputo;
    }

    public void setNivelComputo(int nivelComputo) {
        this.nivelComputo = nivelComputo;
    }

    public BigDecimal getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(BigDecimal salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public BigDecimal getSalarioMaximo() {
        return salarioMaximo;
    }

    public void setSalarioMaximo(BigDecimal salarioMaximo) {
        this.salarioMaximo = salarioMaximo;
    }

    public Date getFechaActualizacionCurriculum() {
        return fechaActualizacionCurriculum;
    }

    public void setFechaActualizacionCurriculum(Date fechaActualizacionCurriculum) {
        this.fechaActualizacionCurriculum = fechaActualizacionCurriculum;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Boolean getVerReferencia() {
        return verReferencia;
    }

    public void setVerReferencia(Boolean verReferencia) {
        this.verReferencia = verReferencia;
    }

    public Boolean getCorreoInformativo() {
        return correoInformativo;
    }

    public void setCorreoInformativo(Boolean correoInformativo) {
        this.correoInformativo = correoInformativo;
    }

    public Boolean getEstadoCurriculum() {
        return estadoCurriculum;
    }

    public void setEstadoCurriculum(Boolean estadoCurriculum) {
        this.estadoCurriculum = estadoCurriculum;
    }

    public Boolean getVerPruebaPsicometrica() {
        return verPruebaPsicometrica;
    }

    public void setVerPruebaPsicometrica(Boolean verPruebaPsicometrica) {
        this.verPruebaPsicometrica = verPruebaPsicometrica;
    }

    public Boolean getVerPruebaCompetencia() {
        return verPruebaCompetencia;
    }

    public void setVerPruebaCompetencia(Boolean verPruebaCompetencia) {
        this.verPruebaCompetencia = verPruebaCompetencia;
    }

    public Boolean getVerPruebaIngles() {
        return verPruebaIngles;
    }

    public void setVerPruebaIngles(Boolean verPruebaIngles) {
        this.verPruebaIngles = verPruebaIngles;
    }

    public Integer getIdAreaInteres() {
        return idAreaInteres;
    }

    public void setIdAreaInteres(Integer idAreaInteres) {
        this.idAreaInteres = idAreaInteres;
    }

    public Integer getIdSubArea() {
        return idSubArea;
    }

    public void setIdSubArea(Integer idSubArea) {
        this.idSubArea = idSubArea;
    }

    public Integer getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Integer idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getPuestoDesempeniado() {
        return puestoDesempeniado;
    }

    public void setPuestoDesempeniado(String puestoDesempeniado) {
        this.puestoDesempeniado = puestoDesempeniado;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(Integer idTitulo) {
        this.idTitulo = idTitulo;
    }

    public boolean getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(boolean vehiculo) {
        this.vehiculo = vehiculo;
    }

    public byte[] getFotografiaMiniatura() {
        return fotografiaMiniatura;
    }

    public void setFotografiaMiniatura(byte[] fotografiaMiniatura) {
        this.fotografiaMiniatura = fotografiaMiniatura;
    }
    
}
