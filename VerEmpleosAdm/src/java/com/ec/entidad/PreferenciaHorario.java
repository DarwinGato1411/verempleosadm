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
@Table(name = "preferenciaHorario")
@NamedQueries({
    @NamedQuery(name = "PreferenciaHorario.findAll", query = "SELECT p FROM PreferenciaHorario p")})
public class PreferenciaHorario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPreferenciaHorario")
    private Integer idPreferenciaHorario;
    @JoinColumn(name = "idHorario", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private CatTipoContratacion idHorario;
    @JoinColumn(name = "idCandidato", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Candidato idCandidato;

    public PreferenciaHorario() {
    }

    public PreferenciaHorario(Integer idPreferenciaHorario) {
        this.idPreferenciaHorario = idPreferenciaHorario;
    }

    public Integer getIdPreferenciaHorario() {
        return idPreferenciaHorario;
    }

    public void setIdPreferenciaHorario(Integer idPreferenciaHorario) {
        this.idPreferenciaHorario = idPreferenciaHorario;
    }

    public CatTipoContratacion getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(CatTipoContratacion idHorario) {
        this.idHorario = idHorario;
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
        hash += (idPreferenciaHorario != null ? idPreferenciaHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreferenciaHorario)) {
            return false;
        }
        PreferenciaHorario other = (PreferenciaHorario) object;
        if ((this.idPreferenciaHorario == null && other.idPreferenciaHorario != null) || (this.idPreferenciaHorario != null && !this.idPreferenciaHorario.equals(other.idPreferenciaHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.PreferenciaHorario[ idPreferenciaHorario=" + idPreferenciaHorario + " ]";
    }
    
}
