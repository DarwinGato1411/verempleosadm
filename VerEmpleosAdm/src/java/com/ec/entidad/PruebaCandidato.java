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

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "PruebaCandidato")
@NamedQueries({
    @NamedQuery(name = "PruebaCandidato.findAll", query = "SELECT p FROM PruebaCandidato p")})
public class PruebaCandidato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdHistorialEnvioPrue")
    private int idHistorialEnvioPrue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPrueba")
    private int idPrueba;
    @Column(name = "FechaAplicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAplicacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estatus")
    private boolean estatus;

    public PruebaCandidato() {
    }

    public PruebaCandidato(Integer id) {
        this.id = id;
    }

    public PruebaCandidato(Integer id, int idHistorialEnvioPrue, int idPrueba, boolean estatus) {
        this.id = id;
        this.idHistorialEnvioPrue = idHistorialEnvioPrue;
        this.idPrueba = idPrueba;
        this.estatus = estatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdHistorialEnvioPrue() {
        return idHistorialEnvioPrue;
    }

    public void setIdHistorialEnvioPrue(int idHistorialEnvioPrue) {
        this.idHistorialEnvioPrue = idHistorialEnvioPrue;
    }

    public int getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(int idPrueba) {
        this.idPrueba = idPrueba;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PruebaCandidato)) {
            return false;
        }
        PruebaCandidato other = (PruebaCandidato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.PruebaCandidato[ id=" + id + " ]";
    }
    
}
