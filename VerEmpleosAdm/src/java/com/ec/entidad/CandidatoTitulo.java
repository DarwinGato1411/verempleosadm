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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "candidatoTitulo")
@NamedQueries({
    @NamedQuery(name = "CandidatoTitulo.findAll", query = "SELECT c FROM CandidatoTitulo c")})
public class CandidatoTitulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCandidatoTitulo")
    private Integer idCandidatoTitulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "tituloObtenido")
    private String tituloObtenido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "institucion")
    private String institucion;
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "FechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @JoinColumn(name = "idCandidato", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Candidato idCandidato;

    public CandidatoTitulo() {
    }

    public CandidatoTitulo(Integer idCandidatoTitulo) {
        this.idCandidatoTitulo = idCandidatoTitulo;
    }

    public CandidatoTitulo(Integer idCandidatoTitulo, String tituloObtenido, String institucion) {
        this.idCandidatoTitulo = idCandidatoTitulo;
        this.tituloObtenido = tituloObtenido;
        this.institucion = institucion;
    }

    public Integer getIdCandidatoTitulo() {
        return idCandidatoTitulo;
    }

    public void setIdCandidatoTitulo(Integer idCandidatoTitulo) {
        this.idCandidatoTitulo = idCandidatoTitulo;
    }

    public String getTituloObtenido() {
        return tituloObtenido;
    }

    public void setTituloObtenido(String tituloObtenido) {
        this.tituloObtenido = tituloObtenido;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Candidato getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Candidato idCandidato) {
        this.idCandidato = idCandidato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCandidatoTitulo != null ? idCandidatoTitulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CandidatoTitulo)) {
            return false;
        }
        CandidatoTitulo other = (CandidatoTitulo) object;
        if ((this.idCandidatoTitulo == null && other.idCandidatoTitulo != null) || (this.idCandidatoTitulo != null && !this.idCandidatoTitulo.equals(other.idCandidatoTitulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CandidatoTitulo[ idCandidatoTitulo=" + idCandidatoTitulo + " ]";
    }
    
}
