/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "experienciaLaboral")
@NamedQueries({
    @NamedQuery(name = "ExperienciaLaboral.findAll", query = "SELECT e FROM ExperienciaLaboral e")})
public class ExperienciaLaboral implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdExperienciaLaboral")
    private Integer idExperienciaLaboral;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "puestoDesempeniado")
    private String puestoDesempeniado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "telefonoEmpresa")
    private String telefonoEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "jefe")
    private String jefe;
    @Column(name = "fechaEntrada")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrada;
    @Column(name = "fechaSalida")
    @Temporal(TemporalType.DATE)
    private Date fechaSalida;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "funcion")
    private String funcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "logro")
    private String logro;
    @Size(max = 100)
    @Column(name = "razonSalida")
    private String razonSalida;
    @JoinColumn(name = "idGiro", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private CatGiroEmpresa idGiro;
    @JoinColumn(name = "idArea", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private CatArea idArea;
    @JoinColumn(name = "idCandidato", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Candidato idCandidato;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Integer idExperienciaLaboral) {
        this.idExperienciaLaboral = idExperienciaLaboral;
    }

    public ExperienciaLaboral(Integer idExperienciaLaboral, String puestoDesempeniado, String nombreEmpresa, String telefonoEmpresa, String jefe, String funcion, String logro) {
        this.idExperienciaLaboral = idExperienciaLaboral;
        this.puestoDesempeniado = puestoDesempeniado;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.jefe = jefe;
        this.funcion = funcion;
        this.logro = logro;
    }

    public Integer getIdExperienciaLaboral() {
        return idExperienciaLaboral;
    }

    public void setIdExperienciaLaboral(Integer idExperienciaLaboral) {
        this.idExperienciaLaboral = idExperienciaLaboral;
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

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getLogro() {
        return logro;
    }

    public void setLogro(String logro) {
        this.logro = logro;
    }

    public String getRazonSalida() {
        return razonSalida;
    }

    public void setRazonSalida(String razonSalida) {
        this.razonSalida = razonSalida;
    }

    public CatGiroEmpresa getIdGiro() {
        return idGiro;
    }

    public void setIdGiro(CatGiroEmpresa idGiro) {
        this.idGiro = idGiro;
    }

    public CatArea getIdArea() {
        return idArea;
    }

    public void setIdArea(CatArea idArea) {
        this.idArea = idArea;
    }

    public Candidato getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Candidato idCandidato) {
        this.idCandidato = idCandidato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExperienciaLaboral != null ? idExperienciaLaboral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExperienciaLaboral)) {
            return false;
        }
        ExperienciaLaboral other = (ExperienciaLaboral) object;
        if ((this.idExperienciaLaboral == null && other.idExperienciaLaboral != null) || (this.idExperienciaLaboral != null && !this.idExperienciaLaboral.equals(other.idExperienciaLaboral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.ExperienciaLaboral[ idExperienciaLaboral=" + idExperienciaLaboral + " ]";
    }
    
}
