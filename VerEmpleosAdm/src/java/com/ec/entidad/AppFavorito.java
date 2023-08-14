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
@Table(name = "app_Favorito")
@NamedQueries({
    @NamedQuery(name = "AppFavorito.findAll", query = "SELECT a FROM AppFavorito a")})
public class AppFavorito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdFavorito")
    private Integer idFavorito;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCandidato")
    private int idCandidato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "Puesto")
    private String puesto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPais")
    private int idPais;
    @Column(name = "IdEstado")
    private Integer idEstado;
    @Column(name = "IdArea")
    private Integer idArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RecibirNotificacion")
    private boolean recibirNotificacion;
    @Column(name = "PublicadaDesde")
    private Integer publicadaDesde;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    public AppFavorito() {
    }

    public AppFavorito(Integer idFavorito) {
        this.idFavorito = idFavorito;
    }

    public AppFavorito(Integer idFavorito, int idCandidato, String nombre, String puesto, int idPais, boolean recibirNotificacion, Date fechaCreacion) {
        this.idFavorito = idFavorito;
        this.idCandidato = idCandidato;
        this.nombre = nombre;
        this.puesto = puesto;
        this.idPais = idPais;
        this.recibirNotificacion = recibirNotificacion;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdFavorito() {
        return idFavorito;
    }

    public void setIdFavorito(Integer idFavorito) {
        this.idFavorito = idFavorito;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public boolean getRecibirNotificacion() {
        return recibirNotificacion;
    }

    public void setRecibirNotificacion(boolean recibirNotificacion) {
        this.recibirNotificacion = recibirNotificacion;
    }

    public Integer getPublicadaDesde() {
        return publicadaDesde;
    }

    public void setPublicadaDesde(Integer publicadaDesde) {
        this.publicadaDesde = publicadaDesde;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFavorito != null ? idFavorito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AppFavorito)) {
            return false;
        }
        AppFavorito other = (AppFavorito) object;
        if ((this.idFavorito == null && other.idFavorito != null) || (this.idFavorito != null && !this.idFavorito.equals(other.idFavorito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.AppFavorito[ idFavorito=" + idFavorito + " ]";
    }
    
}
