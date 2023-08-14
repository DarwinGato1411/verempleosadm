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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Cat_SubAreaInformatica")
@NamedQueries({
    @NamedQuery(name = "CatSubAreaInformatica.findAll", query = "SELECT c FROM CatSubAreaInformatica c")})
public class CatSubAreaInformatica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "SubAreaInformatica")
    private String subAreaInformatica;
    @JoinColumn(name = "IdAreaInformatica", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private CatAreaInformatica idAreaInformatica;

    public CatSubAreaInformatica() {
    }

    public CatSubAreaInformatica(Integer id) {
        this.id = id;
    }

    public CatSubAreaInformatica(Integer id, String subAreaInformatica) {
        this.id = id;
        this.subAreaInformatica = subAreaInformatica;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubAreaInformatica() {
        return subAreaInformatica;
    }

    public void setSubAreaInformatica(String subAreaInformatica) {
        this.subAreaInformatica = subAreaInformatica;
    }

    public CatAreaInformatica getIdAreaInformatica() {
        return idAreaInformatica;
    }

    public void setIdAreaInformatica(CatAreaInformatica idAreaInformatica) {
        this.idAreaInformatica = idAreaInformatica;
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
        if (!(object instanceof CatSubAreaInformatica)) {
            return false;
        }
        CatSubAreaInformatica other = (CatSubAreaInformatica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CatSubAreaInformatica[ id=" + id + " ]";
    }
    
}
