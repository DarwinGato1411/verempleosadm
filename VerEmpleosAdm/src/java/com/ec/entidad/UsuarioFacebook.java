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
@Table(name = "usuarioFacebook")
@NamedQueries({
    @NamedQuery(name = "UsuarioFacebook.findAll", query = "SELECT u FROM UsuarioFacebook u")})
public class UsuarioFacebook implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUsuarioFacebook")
    private Integer idUsuarioFacebook;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;

    public UsuarioFacebook() {
    }

    public UsuarioFacebook(Integer idUsuarioFacebook) {
        this.idUsuarioFacebook = idUsuarioFacebook;
    }

    public UsuarioFacebook(Integer idUsuarioFacebook, String email) {
        this.idUsuarioFacebook = idUsuarioFacebook;
        this.email = email;
    }

    public Integer getIdUsuarioFacebook() {
        return idUsuarioFacebook;
    }

    public void setIdUsuarioFacebook(Integer idUsuarioFacebook) {
        this.idUsuarioFacebook = idUsuarioFacebook;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioFacebook != null ? idUsuarioFacebook.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioFacebook)) {
            return false;
        }
        UsuarioFacebook other = (UsuarioFacebook) object;
        if ((this.idUsuarioFacebook == null && other.idUsuarioFacebook != null) || (this.idUsuarioFacebook != null && !this.idUsuarioFacebook.equals(other.idUsuarioFacebook))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.UsuarioFacebook[ idUsuarioFacebook=" + idUsuarioFacebook + " ]";
    }
    
}
