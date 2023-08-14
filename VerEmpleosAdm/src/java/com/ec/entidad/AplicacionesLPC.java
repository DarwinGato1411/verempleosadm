/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "AplicacionesLPC")
@NamedQueries({
    @NamedQuery(name = "AplicacionesLPC.findAll", query = "SELECT a FROM AplicacionesLPC a")})
public class AplicacionesLPC implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CedulaIdentidad")
    private String cedulaIdentidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPrueba")
    private int idPrueba;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdAplicacionLPC")
    private int idAplicacionLPC;

    public AplicacionesLPC() {
    }

    public AplicacionesLPC(Integer id) {
        this.id = id;
    }

    public AplicacionesLPC(Integer id, String cedulaIdentidad, Date fecha, int idPrueba, int idAplicacionLPC) {
        this.id = id;
        this.cedulaIdentidad = cedulaIdentidad;
        this.fecha = fecha;
        this.idPrueba = idPrueba;
        this.idAplicacionLPC = idAplicacionLPC;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public void setCedulaIdentidad(String cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(int idPrueba) {
        this.idPrueba = idPrueba;
    }

    public int getIdAplicacionLPC() {
        return idAplicacionLPC;
    }

    public void setIdAplicacionLPC(int idAplicacionLPC) {
        this.idAplicacionLPC = idAplicacionLPC;
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
        if (!(object instanceof AplicacionesLPC)) {
            return false;
        }
        AplicacionesLPC other = (AplicacionesLPC) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.AplicacionesLPC[ id=" + id + " ]";
    }
    
}
