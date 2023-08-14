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

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "app_Configuracion")
@NamedQueries({
    @NamedQuery(name = "AppConfiguracion.findAll", query = "SELECT a FROM AppConfiguracion a")})
public class AppConfiguracion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdConfiguracion")
    private Integer idConfiguracion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NotificacionVacantes")
    private boolean notificacionVacantes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KilometrosMaximoBusqueda")
    private int kilometrosMaximoBusqueda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCandidato")
    private int idCandidato;

    public AppConfiguracion() {
    }

    public AppConfiguracion(Integer idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public AppConfiguracion(Integer idConfiguracion, boolean notificacionVacantes, int kilometrosMaximoBusqueda, int idCandidato) {
        this.idConfiguracion = idConfiguracion;
        this.notificacionVacantes = notificacionVacantes;
        this.kilometrosMaximoBusqueda = kilometrosMaximoBusqueda;
        this.idCandidato = idCandidato;
    }

    public Integer getIdConfiguracion() {
        return idConfiguracion;
    }

    public void setIdConfiguracion(Integer idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public boolean getNotificacionVacantes() {
        return notificacionVacantes;
    }

    public void setNotificacionVacantes(boolean notificacionVacantes) {
        this.notificacionVacantes = notificacionVacantes;
    }

    public int getKilometrosMaximoBusqueda() {
        return kilometrosMaximoBusqueda;
    }

    public void setKilometrosMaximoBusqueda(int kilometrosMaximoBusqueda) {
        this.kilometrosMaximoBusqueda = kilometrosMaximoBusqueda;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConfiguracion != null ? idConfiguracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AppConfiguracion)) {
            return false;
        }
        AppConfiguracion other = (AppConfiguracion) object;
        if ((this.idConfiguracion == null && other.idConfiguracion != null) || (this.idConfiguracion != null && !this.idConfiguracion.equals(other.idConfiguracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.AppConfiguracion[ idConfiguracion=" + idConfiguracion + " ]";
    }
    
}
