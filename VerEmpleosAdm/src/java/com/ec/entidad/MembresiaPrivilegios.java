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
@Table(name = "MembresiaPrivilegios")
@NamedQueries({
    @NamedQuery(name = "MembresiaPrivilegios.findAll", query = "SELECT m FROM MembresiaPrivilegios m")})
public class MembresiaPrivilegios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPrivilegio")
    private int idPrivilegio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdMembresia")
    private int idMembresia;

    public MembresiaPrivilegios() {
    }

    public MembresiaPrivilegios(Integer id) {
        this.id = id;
    }

    public MembresiaPrivilegios(Integer id, int idPrivilegio, int idMembresia) {
        this.id = id;
        this.idPrivilegio = idPrivilegio;
        this.idMembresia = idMembresia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPrivilegio() {
        return idPrivilegio;
    }

    public void setIdPrivilegio(int idPrivilegio) {
        this.idPrivilegio = idPrivilegio;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
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
        if (!(object instanceof MembresiaPrivilegios)) {
            return false;
        }
        MembresiaPrivilegios other = (MembresiaPrivilegios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.MembresiaPrivilegios[ id=" + id + " ]";
    }
    
}
