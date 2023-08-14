/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "Cat_AreaInformatica")
@NamedQueries({
    @NamedQuery(name = "CatAreaInformatica.findAll", query = "SELECT c FROM CatAreaInformatica c")})
public class CatAreaInformatica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Area")
    private String area;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAreaInformatica")
    private Collection<CatSubAreaInformatica> catSubAreaInformaticaCollection;

    public CatAreaInformatica() {
    }

    public CatAreaInformatica(Integer id) {
        this.id = id;
    }

    public CatAreaInformatica(Integer id, String area) {
        this.id = id;
        this.area = area;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Collection<CatSubAreaInformatica> getCatSubAreaInformaticaCollection() {
        return catSubAreaInformaticaCollection;
    }

    public void setCatSubAreaInformaticaCollection(Collection<CatSubAreaInformatica> catSubAreaInformaticaCollection) {
        this.catSubAreaInformaticaCollection = catSubAreaInformaticaCollection;
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
        if (!(object instanceof CatAreaInformatica)) {
            return false;
        }
        CatAreaInformatica other = (CatAreaInformatica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CatAreaInformatica[ id=" + id + " ]";
    }
    
}
