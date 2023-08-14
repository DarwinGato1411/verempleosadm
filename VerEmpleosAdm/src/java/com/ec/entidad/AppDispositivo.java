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
@Table(name = "app_Dispositivo")
@NamedQueries({
    @NamedQuery(name = "AppDispositivo.findAll", query = "SELECT a FROM AppDispositivo a")})
public class AppDispositivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdDispositivo")
    private Integer idDispositivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "Token")
    private String token;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "ARN")
    private String arn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UsuarioId")
    private int usuarioId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tipo")
    private int tipo;

    public AppDispositivo() {
    }

    public AppDispositivo(Integer idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public AppDispositivo(Integer idDispositivo, String token, String arn, int usuarioId, int tipo) {
        this.idDispositivo = idDispositivo;
        this.token = token;
        this.arn = arn;
        this.usuarioId = usuarioId;
        this.tipo = tipo;
    }

    public Integer getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(Integer idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getArn() {
        return arn;
    }

    public void setArn(String arn) {
        this.arn = arn;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDispositivo != null ? idDispositivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AppDispositivo)) {
            return false;
        }
        AppDispositivo other = (AppDispositivo) object;
        if ((this.idDispositivo == null && other.idDispositivo != null) || (this.idDispositivo != null && !this.idDispositivo.equals(other.idDispositivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.AppDispositivo[ idDispositivo=" + idDispositivo + " ]";
    }
    
}
