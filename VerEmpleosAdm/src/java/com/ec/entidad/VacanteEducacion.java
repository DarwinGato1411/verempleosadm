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
@Table(name = "vacanteEducacion")
@NamedQueries({
    @NamedQuery(name = "VacanteEducacion.findAll", query = "SELECT v FROM VacanteEducacion v")})
public class VacanteEducacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVacanteEducacion")
    private Integer idVacanteEducacion;
    @JoinColumn(name = "idVacanteStatusEducacion", referencedColumnName = "idVacanteStatusEducacion")
    @ManyToOne(optional = false)
    private VacanteStatusEducacion idVacanteStatusEducacion;
    @JoinColumn(name = "idVacanteNivelEducacion", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private CatVacanteNivelEducacion idVacanteNivelEducacion;

    public VacanteEducacion() {
    }

    public VacanteEducacion(Integer idVacanteEducacion) {
        this.idVacanteEducacion = idVacanteEducacion;
    }

    public Integer getIdVacanteEducacion() {
        return idVacanteEducacion;
    }

    public void setIdVacanteEducacion(Integer idVacanteEducacion) {
        this.idVacanteEducacion = idVacanteEducacion;
    }

    public VacanteStatusEducacion getIdVacanteStatusEducacion() {
        return idVacanteStatusEducacion;
    }

    public void setIdVacanteStatusEducacion(VacanteStatusEducacion idVacanteStatusEducacion) {
        this.idVacanteStatusEducacion = idVacanteStatusEducacion;
    }

    public CatVacanteNivelEducacion getIdVacanteNivelEducacion() {
        return idVacanteNivelEducacion;
    }

    public void setIdVacanteNivelEducacion(CatVacanteNivelEducacion idVacanteNivelEducacion) {
        this.idVacanteNivelEducacion = idVacanteNivelEducacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVacanteEducacion != null ? idVacanteEducacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VacanteEducacion)) {
            return false;
        }
        VacanteEducacion other = (VacanteEducacion) object;
        if ((this.idVacanteEducacion == null && other.idVacanteEducacion != null) || (this.idVacanteEducacion != null && !this.idVacanteEducacion.equals(other.idVacanteEducacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.VacanteEducacion[ idVacanteEducacion=" + idVacanteEducacion + " ]";
    }
    
}
