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
@Table(name = "Cat_TipoContratacion")
@NamedQueries({
    @NamedQuery(name = "CatTipoContratacion.findAll", query = "SELECT c FROM CatTipoContratacion c")})
public class CatTipoContratacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "jornada")
    private String jornada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idHorario")
    private Collection<PreferenciaHorario> preferenciaHorarioCollection;

    public CatTipoContratacion() {
    }

    public CatTipoContratacion(Integer id) {
        this.id = id;
    }

    public CatTipoContratacion(Integer id, String jornada) {
        this.id = id;
        this.jornada = jornada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public Collection<PreferenciaHorario> getPreferenciaHorarioCollection() {
        return preferenciaHorarioCollection;
    }

    public void setPreferenciaHorarioCollection(Collection<PreferenciaHorario> preferenciaHorarioCollection) {
        this.preferenciaHorarioCollection = preferenciaHorarioCollection;
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
        if (!(object instanceof CatTipoContratacion)) {
            return false;
        }
        CatTipoContratacion other = (CatTipoContratacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CatTipoContratacion[ id=" + id + " ]";
    }
    
}
