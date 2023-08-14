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
@Table(name = "vacanteNivelIdioma")
@NamedQueries({
    @NamedQuery(name = "VacanteNivelIdioma.findAll", query = "SELECT v FROM VacanteNivelIdioma v")})
public class VacanteNivelIdioma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVacanteNivelIdioma")
    private Integer idVacanteNivelIdioma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Nivel")
    private String nivel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVacanteNivelIdioma")
    private Collection<VacanteIdioma> vacanteIdiomaCollection;

    public VacanteNivelIdioma() {
    }

    public VacanteNivelIdioma(Integer idVacanteNivelIdioma) {
        this.idVacanteNivelIdioma = idVacanteNivelIdioma;
    }

    public VacanteNivelIdioma(Integer idVacanteNivelIdioma, String nivel) {
        this.idVacanteNivelIdioma = idVacanteNivelIdioma;
        this.nivel = nivel;
    }

    public Integer getIdVacanteNivelIdioma() {
        return idVacanteNivelIdioma;
    }

    public void setIdVacanteNivelIdioma(Integer idVacanteNivelIdioma) {
        this.idVacanteNivelIdioma = idVacanteNivelIdioma;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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
        hash += (idVacanteNivelIdioma != null ? idVacanteNivelIdioma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VacanteNivelIdioma)) {
            return false;
        }
        VacanteNivelIdioma other = (VacanteNivelIdioma) object;
        if ((this.idVacanteNivelIdioma == null && other.idVacanteNivelIdioma != null) || (this.idVacanteNivelIdioma != null && !this.idVacanteNivelIdioma.equals(other.idVacanteNivelIdioma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.VacanteNivelIdioma[ idVacanteNivelIdioma=" + idVacanteNivelIdioma + " ]";
    }
    
}
