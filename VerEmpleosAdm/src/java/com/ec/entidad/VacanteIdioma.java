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

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "vacanteIdioma")
@NamedQueries({
    @NamedQuery(name = "VacanteIdioma.findAll", query = "SELECT v FROM VacanteIdioma v")})
public class VacanteIdioma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @JoinColumn(name = "idVacanteNivelIdioma", referencedColumnName = "idVacanteNivelIdioma")
    @ManyToOne(optional = false)
    private VacanteNivelIdioma idVacanteNivelIdioma;
    @JoinColumn(name = "idIdioma", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private CatIdioma idIdioma;

    public VacanteIdioma() {
    }

    public VacanteIdioma(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public VacanteNivelIdioma getIdVacanteNivelIdioma() {
        return idVacanteNivelIdioma;
    }

    public void setIdVacanteNivelIdioma(VacanteNivelIdioma idVacanteNivelIdioma) {
        this.idVacanteNivelIdioma = idVacanteNivelIdioma;
    }

    public CatIdioma getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(CatIdioma idIdioma) {
        this.idIdioma = idIdioma;
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
        if (!(object instanceof VacanteIdioma)) {
            return false;
        }
        VacanteIdioma other = (VacanteIdioma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.VacanteIdioma[ id=" + id + " ]";
    }
    
}
