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
@Table(name = "candidatoVacante")
@NamedQueries({
    @NamedQuery(name = "CandidatoVacante.findAll", query = "SELECT c FROM CandidatoVacante c")})
public class CandidatoVacante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVacante")
    private int idVacante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaAplicacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAplicacion;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Size(max = 200)
    @Column(name = "experienciaPuestoSimilar")
    private String experienciaPuestoSimilar;
    @Size(max = 50)
    @Column(name = "expectativaSalarial")
    private String expectativaSalarial;
    @Size(max = 50)
    @Column(name = "fechaPosibleIncorporacion")
    private String fechaPosibleIncorporacion;
    @JoinColumn(name = "idCandidato", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Candidato idCandidato;

    public CandidatoVacante() {
    }

    public CandidatoVacante(Integer id) {
        this.id = id;
    }

    public CandidatoVacante(Integer id, int idVacante, Date fechaAplicacion) {
        this.id = id;
        this.idVacante = idVacante;
        this.fechaAplicacion = fechaAplicacion;
    }

    public int getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(int idVacante) {
        this.idVacante = idVacante;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExperienciaPuestoSimilar() {
        return experienciaPuestoSimilar;
    }

    public void setExperienciaPuestoSimilar(String experienciaPuestoSimilar) {
        this.experienciaPuestoSimilar = experienciaPuestoSimilar;
    }

    public String getExpectativaSalarial() {
        return expectativaSalarial;
    }

    public void setExpectativaSalarial(String expectativaSalarial) {
        this.expectativaSalarial = expectativaSalarial;
    }

    public String getFechaPosibleIncorporacion() {
        return fechaPosibleIncorporacion;
    }

    public void setFechaPosibleIncorporacion(String fechaPosibleIncorporacion) {
        this.fechaPosibleIncorporacion = fechaPosibleIncorporacion;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CandidatoVacante)) {
            return false;
        }
        CandidatoVacante other = (CandidatoVacante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CandidatoVacante[ id=" + id + " ]";
    }
    
}
