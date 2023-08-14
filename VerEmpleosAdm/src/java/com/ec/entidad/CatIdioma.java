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
@Table(name = "Cat_Idioma")
@NamedQueries({
    @NamedQuery(name = "CatIdioma.findAll", query = "SELECT c FROM CatIdioma c")})
public class CatIdioma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idioma")
    private String idioma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idIdioma")
    private Collection<CandidatoIdioma> candidatoIdiomaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idIdioma")
    private Collection<VacanteIdioma> vacanteIdiomaCollection;

    public CatIdioma() {
    }

    public CatIdioma(Integer id) {
        this.id = id;
    }

    public CatIdioma(Integer id, String idioma) {
        this.id = id;
        this.idioma = idioma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Collection<CandidatoIdioma> getCandidatoIdiomaCollection() {
        return candidatoIdiomaCollection;
    }

    public void setCandidatoIdiomaCollection(Collection<CandidatoIdioma> candidatoIdiomaCollection) {
        this.candidatoIdiomaCollection = candidatoIdiomaCollection;
    }

    public Collection<VacanteIdioma> getVacanteIdiomaCollection() {
        return vacanteIdiomaCollection;
    }

    public void setVacanteIdiomaCollection(Collection<VacanteIdioma> vacanteIdiomaCollection) {
        this.vacanteIdiomaCollection = vacanteIdiomaCollection;
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
        if (!(object instanceof CatIdioma)) {
            return false;
        }
        CatIdioma other = (CatIdioma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CatIdioma[ id=" + id + " ]";
    }
    
}
