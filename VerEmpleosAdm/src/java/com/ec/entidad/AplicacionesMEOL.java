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
@Table(name = "AplicacionesMEOL")
@NamedQueries({
    @NamedQuery(name = "AplicacionesMEOL.findAll", query = "SELECT a FROM AplicacionesMEOL a")})
public class AplicacionesMEOL implements Serializable {
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
    @Column(name = "IdAplicacionMEOL")
    private int idAplicacionMEOL;

    public AplicacionesMEOL() {
    }

    public AplicacionesMEOL(Integer id) {
        this.id = id;
    }

    public AplicacionesMEOL(Integer id, String cedulaIdentidad, Date fecha, int idPrueba, int idAplicacionMEOL) {
        this.id = id;
        this.cedulaIdentidad = cedulaIdentidad;
        this.fecha = fecha;
        this.idPrueba = idPrueba;
        this.idAplicacionMEOL = idAplicacionMEOL;
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

    public int getIdAplicacionMEOL() {
        return idAplicacionMEOL;
    }

    public void setIdAplicacionMEOL(int idAplicacionMEOL) {
        this.idAplicacionMEOL = idAplicacionMEOL;
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
        if (!(object instanceof AplicacionesMEOL)) {
            return false;
        }
        AplicacionesMEOL other = (AplicacionesMEOL) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.AplicacionesMEOL[ id=" + id + " ]";
    }
    
}
