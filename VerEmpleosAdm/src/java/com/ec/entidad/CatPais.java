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
@Table(name = "Cat_Pais")
@NamedQueries({
    @NamedQuery(name = "CatPais.findAll", query = "SELECT c FROM CatPais c")})
public class CatPais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Pais")
    private String pais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPais")
    private Collection<CatEstado> catEstadoCollection;

    public CatPais() {
    }

    public CatPais(Integer id) {
        this.id = id;
    }

    public CatPais(Integer id, String pais) {
        this.id = id;
        this.pais = pais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Collection<CatEstado> getCatEstadoCollection() {
        return catEstadoCollection;
    }

    public void setCatEstadoCollection(Collection<CatEstado> catEstadoCollection) {
        this.catEstadoCollection = catEstadoCollection;
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
        if (!(object instanceof CatPais)) {
            return false;
        }
        CatPais other = (CatPais) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CatPais[ id=" + id + " ]";
    }
    
}
