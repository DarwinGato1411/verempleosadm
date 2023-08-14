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
@Table(name = "app_NotificacionCandidatoVacante")
@NamedQueries({
    @NamedQuery(name = "AppNotificacionCandidatoVacante.findAll", query = "SELECT a FROM AppNotificacionCandidatoVacante a")})
public class AppNotificacionCandidatoVacante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CandidatoId")
    private int candidatoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VacanteId")
    private int vacanteId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public AppNotificacionCandidatoVacante() {
    }

    public AppNotificacionCandidatoVacante(Integer id) {
        this.id = id;
    }

    public AppNotificacionCandidatoVacante(Integer id, int candidatoId, int vacanteId, Date fecha) {
        this.id = id;
        this.candidatoId = candidatoId;
        this.vacanteId = vacanteId;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCandidatoId() {
        return candidatoId;
    }

    public void setCandidatoId(int candidatoId) {
        this.candidatoId = candidatoId;
    }

    public int getVacanteId() {
        return vacanteId;
    }

    public void setVacanteId(int vacanteId) {
        this.vacanteId = vacanteId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        if (!(object instanceof AppNotificacionCandidatoVacante)) {
            return false;
        }
        AppNotificacionCandidatoVacante other = (AppNotificacionCandidatoVacante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.AppNotificacionCandidatoVacante[ id=" + id + " ]";
    }
    
}
