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
@Table(name = "RifaVerEmpleosUsuarioPsaycoWare")
@NamedQueries({
    @NamedQuery(name = "RifaVerEmpleosUsuarioPsaycoWare.findAll", query = "SELECT r FROM RifaVerEmpleosUsuarioPsaycoWare r")})
public class RifaVerEmpleosUsuarioPsaycoWare implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdUsuario")
    private int idUsuario;
    @Size(max = 10)
    @Column(name = "UsuarioPsycoWare")
    private String usuarioPsycoWare;
    @Size(max = 50)
    @Column(name = "ContraseniaPsycoWare")
    private String contraseniaPsycoWare;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Codigo")
    private String codigo;

    public RifaVerEmpleosUsuarioPsaycoWare() {
    }

    public RifaVerEmpleosUsuarioPsaycoWare(Integer id) {
        this.id = id;
    }

    public RifaVerEmpleosUsuarioPsaycoWare(Integer id, int idUsuario, String codigo) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.codigo = codigo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuarioPsycoWare() {
        return usuarioPsycoWare;
    }

    public void setUsuarioPsycoWare(String usuarioPsycoWare) {
        this.usuarioPsycoWare = usuarioPsycoWare;
    }

    public String getContraseniaPsycoWare() {
        return contraseniaPsycoWare;
    }

    public void setContraseniaPsycoWare(String contraseniaPsycoWare) {
        this.contraseniaPsycoWare = contraseniaPsycoWare;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
        if (!(object instanceof RifaVerEmpleosUsuarioPsaycoWare)) {
            return false;
        }
        RifaVerEmpleosUsuarioPsaycoWare other = (RifaVerEmpleosUsuarioPsaycoWare) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.RifaVerEmpleosUsuarioPsaycoWare[ id=" + id + " ]";
    }
    
}
