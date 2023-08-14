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
@Table(name = "preferenciaPuesto")
@NamedQueries({
    @NamedQuery(name = "PreferenciaPuesto.findAll", query = "SELECT p FROM PreferenciaPuesto p")})
public class PreferenciaPuesto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPreferenciaPuesto")
    private Integer idPreferenciaPuesto;
    @JoinColumn(name = "idPuesto", referencedColumnName = "idPuesto")
    @ManyToOne(optional = false)
    private Puesto idPuesto;
    @JoinColumn(name = "idCandidato", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Candidato idCandidato;

    public PreferenciaPuesto() {
    }

    public PreferenciaPuesto(Integer idPreferenciaPuesto) {
        this.idPreferenciaPuesto = idPreferenciaPuesto;
    }

    public Integer getIdPreferenciaPuesto() {
        return idPreferenciaPuesto;
    }

    public void setIdPreferenciaPuesto(Integer idPreferenciaPuesto) {
        this.idPreferenciaPuesto = idPreferenciaPuesto;
    }

    public Puesto getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Puesto idPuesto) {
        this.idPuesto = idPuesto;
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
        hash += (idPreferenciaPuesto != null ? idPreferenciaPuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreferenciaPuesto)) {
            return false;
        }
        PreferenciaPuesto other = (PreferenciaPuesto) object;
        if ((this.idPreferenciaPuesto == null && other.idPreferenciaPuesto != null) || (this.idPreferenciaPuesto != null && !this.idPreferenciaPuesto.equals(other.idPreferenciaPuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.PreferenciaPuesto[ idPreferenciaPuesto=" + idPreferenciaPuesto + " ]";
    }
    
}
