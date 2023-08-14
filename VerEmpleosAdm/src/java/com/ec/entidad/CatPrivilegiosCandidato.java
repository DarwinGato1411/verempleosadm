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
@Table(name = "Cat_PrivilegiosCandidato")
@NamedQueries({
    @NamedQuery(name = "CatPrivilegiosCandidato.findAll", query = "SELECT c FROM CatPrivilegiosCandidato c")})
public class CatPrivilegiosCandidato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Categoria")
    private String categoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Activo")
    private boolean activo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdTipoCuentaCandidato")
    private int idTipoCuentaCandidato;

    public CatPrivilegiosCandidato() {
    }

    public CatPrivilegiosCandidato(Integer id) {
        this.id = id;
    }

    public CatPrivilegiosCandidato(Integer id, String descripcion, String categoria, boolean activo, int idTipoCuentaCandidato) {
        this.id = id;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.activo = activo;
        this.idTipoCuentaCandidato = idTipoCuentaCandidato;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getIdTipoCuentaCandidato() {
        return idTipoCuentaCandidato;
    }

    public void setIdTipoCuentaCandidato(int idTipoCuentaCandidato) {
        this.idTipoCuentaCandidato = idTipoCuentaCandidato;
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
        if (!(object instanceof CatPrivilegiosCandidato)) {
            return false;
        }
        CatPrivilegiosCandidato other = (CatPrivilegiosCandidato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CatPrivilegiosCandidato[ id=" + id + " ]";
    }
    
}
