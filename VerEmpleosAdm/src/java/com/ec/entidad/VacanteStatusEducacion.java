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
@Table(name = "vacanteStatusEducacion")
@NamedQueries({
    @NamedQuery(name = "VacanteStatusEducacion.findAll", query = "SELECT v FROM VacanteStatusEducacion v")})
public class VacanteStatusEducacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVacanteStatusEducacion")
    private Integer idVacanteStatusEducacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "status")
    private String status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVacanteStatusEducacion")
    private Collection<VacanteEducacion> vacanteEducacionCollection;

    public VacanteStatusEducacion() {
    }

    public VacanteStatusEducacion(Integer idVacanteStatusEducacion) {
        this.idVacanteStatusEducacion = idVacanteStatusEducacion;
    }

    public VacanteStatusEducacion(Integer idVacanteStatusEducacion, String status) {
        this.idVacanteStatusEducacion = idVacanteStatusEducacion;
        this.status = status;
    }

    public Integer getIdVacanteStatusEducacion() {
        return idVacanteStatusEducacion;
    }

    public void setIdVacanteStatusEducacion(Integer idVacanteStatusEducacion) {
        this.idVacanteStatusEducacion = idVacanteStatusEducacion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        hash += (idVacanteStatusEducacion != null ? idVacanteStatusEducacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VacanteStatusEducacion)) {
            return false;
        }
        VacanteStatusEducacion other = (VacanteStatusEducacion) object;
        if ((this.idVacanteStatusEducacion == null && other.idVacanteStatusEducacion != null) || (this.idVacanteStatusEducacion != null && !this.idVacanteStatusEducacion.equals(other.idVacanteStatusEducacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.VacanteStatusEducacion[ idVacanteStatusEducacion=" + idVacanteStatusEducacion + " ]";
    }
    
}
