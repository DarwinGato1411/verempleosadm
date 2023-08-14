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
@Table(name = "Cat_VacanteNivelEducacion")
@NamedQueries({
    @NamedQuery(name = "CatVacanteNivelEducacion.findAll", query = "SELECT c FROM CatVacanteNivelEducacion c")})
public class CatVacanteNivelEducacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "EduNivel")
    private String eduNivel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVacanteNivelEducacion")
    private Collection<VacanteEducacion> vacanteEducacionCollection;

    public CatVacanteNivelEducacion() {
    }

    public CatVacanteNivelEducacion(Integer id) {
        this.id = id;
    }

    public CatVacanteNivelEducacion(Integer id, String eduNivel) {
        this.id = id;
        this.eduNivel = eduNivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEduNivel() {
        return eduNivel;
    }

    public void setEduNivel(String eduNivel) {
        this.eduNivel = eduNivel;
    }

    public Collection<VacanteEducacion> getVacanteEducacionCollection() {
        return vacanteEducacionCollection;
    }

    public void setVacanteEducacionCollection(Collection<VacanteEducacion> vacanteEducacionCollection) {
        this.vacanteEducacionCollection = vacanteEducacionCollection;
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
        if (!(object instanceof CatVacanteNivelEducacion)) {
            return false;
        }
        CatVacanteNivelEducacion other = (CatVacanteNivelEducacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CatVacanteNivelEducacion[ id=" + id + " ]";
    }
    
}
