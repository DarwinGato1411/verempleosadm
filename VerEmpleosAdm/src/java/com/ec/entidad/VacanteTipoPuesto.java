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
@Table(name = "vacanteTipoPuesto")
@NamedQueries({
    @NamedQuery(name = "VacanteTipoPuesto.findAll", query = "SELECT v FROM VacanteTipoPuesto v")})
public class VacanteTipoPuesto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVacanteTipoPuesto")
    private Integer idVacanteTipoPuesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "descripcion")
    private String descripcion;

    public VacanteTipoPuesto() {
    }

    public VacanteTipoPuesto(Integer idVacanteTipoPuesto) {
        this.idVacanteTipoPuesto = idVacanteTipoPuesto;
    }

    public VacanteTipoPuesto(Integer idVacanteTipoPuesto, String descripcion) {
        this.idVacanteTipoPuesto = idVacanteTipoPuesto;
        this.descripcion = descripcion;
    }

    public Integer getIdVacanteTipoPuesto() {
        return idVacanteTipoPuesto;
    }

    public void setIdVacanteTipoPuesto(Integer idVacanteTipoPuesto) {
        this.idVacanteTipoPuesto = idVacanteTipoPuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVacanteTipoPuesto != null ? idVacanteTipoPuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VacanteTipoPuesto)) {
            return false;
        }
        VacanteTipoPuesto other = (VacanteTipoPuesto) object;
        if ((this.idVacanteTipoPuesto == null && other.idVacanteTipoPuesto != null) || (this.idVacanteTipoPuesto != null && !this.idVacanteTipoPuesto.equals(other.idVacanteTipoPuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.VacanteTipoPuesto[ idVacanteTipoPuesto=" + idVacanteTipoPuesto + " ]";
    }
    
}
