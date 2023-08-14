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
@Table(name = "Cat_TipoLicencia")
@NamedQueries({
    @NamedQuery(name = "CatTipoLicencia.findAll", query = "SELECT c FROM CatTipoLicencia c")})
public class CatTipoLicencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tipoLicencia")
    private String tipoLicencia;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLicencia")
//    private Collection<CandidatoLicencia> candidatoLicenciaCollection;

    public CatTipoLicencia() {
    }

    public CatTipoLicencia(Integer id) {
        this.id = id;
    }

    public CatTipoLicencia(Integer id, String tipoLicencia) {
        this.id = id;
        this.tipoLicencia = tipoLicencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

//    public Collection<CandidatoLicencia> getCandidatoLicenciaCollection() {
//        return candidatoLicenciaCollection;
//    }
//
//    public void setCandidatoLicenciaCollection(Collection<CandidatoLicencia> candidatoLicenciaCollection) {
//        this.candidatoLicenciaCollection = candidatoLicenciaCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatTipoLicencia)) {
            return false;
        }
        CatTipoLicencia other = (CatTipoLicencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CatTipoLicencia[ id=" + id + " ]";
    }
    
}
