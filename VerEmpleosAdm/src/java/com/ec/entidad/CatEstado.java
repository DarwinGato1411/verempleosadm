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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Cat_Estado")
@NamedQueries({
    @NamedQuery(name = "CatEstado.findAll", query = "SELECT c FROM CatEstado c")})
public class CatEstado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Estado")
    private String estado;
    @JoinColumn(name = "idPais", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private CatPais idPais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstado")
    private Collection<Ubicacion> ubicacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstado")
    private Collection<CatCiudad> catCiudadCollection;

    @OneToMany(mappedBy = "idCatEstado")
    private Collection<Usuario> catEstadoCollection;


    public CatEstado() {
    }

    public CatEstado(Integer id) {
        this.id = id;
    }

    public CatEstado(Integer id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public CatPais getIdPais() {
        return idPais;
    }

    public void setIdPais(CatPais idPais) {
        this.idPais = idPais;
    }

    public Collection<Ubicacion> getUbicacionCollection() {
        return ubicacionCollection;
    }

    public void setUbicacionCollection(Collection<Ubicacion> ubicacionCollection) {
        this.ubicacionCollection = ubicacionCollection;
    }

    public Collection<CatCiudad> getCatCiudadCollection() {
        return catCiudadCollection;
    }

    public void setCatCiudadCollection(Collection<CatCiudad> catCiudadCollection) {
        this.catCiudadCollection = catCiudadCollection;
    }

    public Collection<Usuario> getCatEstadoCollection() {
        return catEstadoCollection;
    }

    public void setCatEstadoCollection(Collection<Usuario> catEstadoCollection) {
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
        if (!(object instanceof CatEstado)) {
            return false;
        }
        CatEstado other = (CatEstado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CatEstado[ id=" + id + " ]";
    }

}
