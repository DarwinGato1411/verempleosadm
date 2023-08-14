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
@Table(name = "VacanteMostrarDatosEmp")
@NamedQueries({
    @NamedQuery(name = "VacanteMostrarDatosEmp.findAll", query = "SELECT v FROM VacanteMostrarDatosEmp v")})
public class VacanteMostrarDatosEmp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdVacante")
    private int idVacante;
    @Column(name = "MostrarDatosEmp")
    private Boolean mostrarDatosEmp;
    @Size(max = 1000)
    @Column(name = "Descripcion")
    private String descripcion;

    public VacanteMostrarDatosEmp() {
    }

    public VacanteMostrarDatosEmp(Integer id) {
        this.id = id;
    }

    public VacanteMostrarDatosEmp(Integer id, int idVacante) {
        this.id = id;
        this.idVacante = idVacante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(int idVacante) {
        this.idVacante = idVacante;
    }

    public Boolean getMostrarDatosEmp() {
        return mostrarDatosEmp;
    }

    public void setMostrarDatosEmp(Boolean mostrarDatosEmp) {
        this.mostrarDatosEmp = mostrarDatosEmp;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VacanteMostrarDatosEmp)) {
            return false;
        }
        VacanteMostrarDatosEmp other = (VacanteMostrarDatosEmp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.VacanteMostrarDatosEmp[ id=" + id + " ]";
    }
    
}
