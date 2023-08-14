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
@Table(name = "referencia")
@NamedQueries({
    @NamedQuery(name = "Referencia.findAll", query = "SELECT r FROM Referencia r")})
public class Referencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idReferencia")
    private Integer idReferencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "emailReferencia")
    private String emailReferencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipoRelacion")
    private int tipoRelacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaEnvio")
    @Temporal(TemporalType.DATE)
    private Date fechaEnvio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreReferencia")
    private String nombreReferencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "apellidoReferencia")
    private String apellidoReferencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mostrarReferencia")
    private boolean mostrarReferencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCandidato")
    private int idCandidato;
    @Size(max = 200)
    @Column(name = "observacion")
    private String observacion;

    public Referencia() {
    }

    public Referencia(Integer idReferencia) {
        this.idReferencia = idReferencia;
    }

    public Referencia(Integer idReferencia, String emailReferencia, int tipoRelacion, Date fechaEnvio, String nombreReferencia, String apellidoReferencia, String telefono, boolean mostrarReferencia, int idCandidato) {
        this.idReferencia = idReferencia;
        this.emailReferencia = emailReferencia;
        this.tipoRelacion = tipoRelacion;
        this.fechaEnvio = fechaEnvio;
        this.nombreReferencia = nombreReferencia;
        this.apellidoReferencia = apellidoReferencia;
        this.telefono = telefono;
        this.mostrarReferencia = mostrarReferencia;
        this.idCandidato = idCandidato;
    }

    public Integer getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(Integer idReferencia) {
        this.idReferencia = idReferencia;
    }

    public String getEmailReferencia() {
        return emailReferencia;
    }

    public void setEmailReferencia(String emailReferencia) {
        this.emailReferencia = emailReferencia;
    }

    public int getTipoRelacion() {
        return tipoRelacion;
    }

    public void setTipoRelacion(int tipoRelacion) {
        this.tipoRelacion = tipoRelacion;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getNombreReferencia() {
        return nombreReferencia;
    }

    public void setNombreReferencia(String nombreReferencia) {
        this.nombreReferencia = nombreReferencia;
    }

    public String getApellidoReferencia() {
        return apellidoReferencia;
    }

    public void setApellidoReferencia(String apellidoReferencia) {
        this.apellidoReferencia = apellidoReferencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean getMostrarReferencia() {
        return mostrarReferencia;
    }

    public void setMostrarReferencia(boolean mostrarReferencia) {
        this.mostrarReferencia = mostrarReferencia;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReferencia != null ? idReferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Referencia)) {
            return false;
        }
        Referencia other = (Referencia) object;
        if ((this.idReferencia == null && other.idReferencia != null) || (this.idReferencia != null && !this.idReferencia.equals(other.idReferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.Referencia[ idReferencia=" + idReferencia + " ]";
    }
    
}
