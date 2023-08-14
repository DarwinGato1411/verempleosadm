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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "vs_app_EmpresaLogoMiniatura")
@NamedQueries({
    @NamedQuery(name = "VsappEmpresaLogoMiniatura.findAll", query = "SELECT v FROM VsappEmpresaLogoMiniatura v")})
public class VsappEmpresaLogoMiniatura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "LogoMiniatura")    
    private byte[] logoMiniatura;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdUsuario")
    private Integer idUsuario;

    public VsappEmpresaLogoMiniatura() {
    }

    public VsappEmpresaLogoMiniatura(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public byte[] getLogoMiniatura() {
        return logoMiniatura;
    }

    public void setLogoMiniatura(byte[] logoMiniatura) {
        this.logoMiniatura = logoMiniatura;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VsappEmpresaLogoMiniatura)) {
            return false;
        }
        VsappEmpresaLogoMiniatura other = (VsappEmpresaLogoMiniatura) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.VsappEmpresaLogoMiniatura[ idUsuario=" + idUsuario + " ]";
    }
    
}
