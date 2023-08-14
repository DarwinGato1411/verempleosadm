/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "vs_Configuracion")
@NamedQueries({
    @NamedQuery(name = "VsConfiguracion.findAll", query = "SELECT v FROM VsConfiguracion v")})
public class VsConfiguracion implements Serializable {
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
    @Column(name = "VerPruebaIngles")
    private Boolean verPruebaIngles;
    @Column(name = "VerPruebaCompetencia")
    private Boolean verPruebaCompetencia;
    @Column(name = "VerEntrevistaOnLine")
    private Boolean verEntrevistaOnLine;
    @Column(name = "VerPruebaPsicometrica")
    private Boolean verPruebaPsicometrica;
    @Column(name = "EstadoCurriculum")
    private Boolean estadoCurriculum;
    @Column(name = "CorreoInformativo")
    private Boolean correoInformativo;
    @Column(name = "VerReferencia")
    private Boolean verReferencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CedulaIdentificacion")
    private String cedulaIdentificacion;
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
    @Size(max = 2147483647)
    @Column(name = "perfil")
    private String perfil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "puestoDesempeniado")
    private String puestoDesempeniado;

    public VsConfiguracion() {
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

    public Boolean getVerPruebaIngles() {
        return verPruebaIngles;
    }

    public void setVerPruebaIngles(Boolean verPruebaIngles) {
        this.verPruebaIngles = verPruebaIngles;
    }

    public Boolean getVerPruebaCompetencia() {
        return verPruebaCompetencia;
    }

    public void setVerPruebaCompetencia(Boolean verPruebaCompetencia) {
        this.verPruebaCompetencia = verPruebaCompetencia;
    }

    public Boolean getVerEntrevistaOnLine() {
        return verEntrevistaOnLine;
    }

    public void setVerEntrevistaOnLine(Boolean verEntrevistaOnLine) {
        this.verEntrevistaOnLine = verEntrevistaOnLine;
    }

    public Boolean getVerPruebaPsicometrica() {
        return verPruebaPsicometrica;
    }

    public void setVerPruebaPsicometrica(Boolean verPruebaPsicometrica) {
        this.verPruebaPsicometrica = verPruebaPsicometrica;
    }

    public Boolean getEstadoCurriculum() {
        return estadoCurriculum;
    }

    public void setEstadoCurriculum(Boolean estadoCurriculum) {
        this.estadoCurriculum = estadoCurriculum;
    }

    public Boolean getCorreoInformativo() {
        return correoInformativo;
    }

    public void setCorreoInformativo(Boolean correoInformativo) {
        this.correoInformativo = correoInformativo;
    }

    public Boolean getVerReferencia() {
        return verReferencia;
    }

    public void setVerReferencia(Boolean verReferencia) {
        this.verReferencia = verReferencia;
    }

    public String getCedulaIdentificacion() {
        return cedulaIdentificacion;
    }

    public void setCedulaIdentificacion(String cedulaIdentificacion) {
        this.cedulaIdentificacion = cedulaIdentificacion;
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

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getPuestoDesempeniado() {
        return puestoDesempeniado;
    }

    public void setPuestoDesempeniado(String puestoDesempeniado) {
        this.puestoDesempeniado = puestoDesempeniado;
    }
    
}
