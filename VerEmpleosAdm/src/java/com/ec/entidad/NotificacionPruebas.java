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
@Table(name = "NotificacionPruebas")
@NamedQueries({
    @NamedQuery(name = "NotificacionPruebas.findAll", query = "SELECT n FROM NotificacionPruebas n")})
public class NotificacionPruebas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCandidato")
    private int idCandidato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AplicadoPW")
    private boolean aplicadoPW;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AplicadoLPC")
    private boolean aplicadoLPC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AplicadoIngles")
    private boolean aplicadoIngles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PruebasAplicadas")
    private boolean pruebasAplicadas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaNotificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNotificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Notificado")
    private boolean notificado;

    public NotificacionPruebas() {
    }

    public NotificacionPruebas(Integer id) {
        this.id = id;
    }

    public NotificacionPruebas(Integer id, int idCandidato, boolean aplicadoPW, boolean aplicadoLPC, boolean aplicadoIngles, boolean pruebasAplicadas, Date fechaNotificacion, boolean notificado) {
        this.id = id;
        this.idCandidato = idCandidato;
        this.aplicadoPW = aplicadoPW;
        this.aplicadoLPC = aplicadoLPC;
        this.aplicadoIngles = aplicadoIngles;
        this.pruebasAplicadas = pruebasAplicadas;
        this.fechaNotificacion = fechaNotificacion;
        this.notificado = notificado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public boolean getAplicadoPW() {
        return aplicadoPW;
    }

    public void setAplicadoPW(boolean aplicadoPW) {
        this.aplicadoPW = aplicadoPW;
    }

    public boolean getAplicadoLPC() {
        return aplicadoLPC;
    }

    public void setAplicadoLPC(boolean aplicadoLPC) {
        this.aplicadoLPC = aplicadoLPC;
    }

    public boolean getAplicadoIngles() {
        return aplicadoIngles;
    }

    public void setAplicadoIngles(boolean aplicadoIngles) {
        this.aplicadoIngles = aplicadoIngles;
    }

    public boolean getPruebasAplicadas() {
        return pruebasAplicadas;
    }

    public void setPruebasAplicadas(boolean pruebasAplicadas) {
        this.pruebasAplicadas = pruebasAplicadas;
    }

    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public boolean getNotificado() {
        return notificado;
    }

    public void setNotificado(boolean notificado) {
        this.notificado = notificado;
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
        if (!(object instanceof NotificacionPruebas)) {
            return false;
        }
        NotificacionPruebas other = (NotificacionPruebas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.NotificacionPruebas[ id=" + id + " ]";
    }
    
}
