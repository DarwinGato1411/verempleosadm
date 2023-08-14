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
@Table(name = "preferenciaArea")
@NamedQueries({
    @NamedQuery(name = "PreferenciaArea.findAll", query = "SELECT p FROM PreferenciaArea p")})
public class PreferenciaArea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPreferenciaArea")
    private Integer idPreferenciaArea;
    @Column(name = "idSubArea")
    private Integer idSubArea;
//    @JoinColumn(name = "idArea", referencedColumnName = "Id")
//    @ManyToOne(optional = false)
//    private CatArea idArea;
    @JoinColumn(name = "idCandidato", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Candidato idCandidato;

    public PreferenciaArea() {
    }

    public PreferenciaArea(Integer idPreferenciaArea) {
        this.idPreferenciaArea = idPreferenciaArea;
    }

    public Integer getIdPreferenciaArea() {
        return idPreferenciaArea;
    }

    public void setIdPreferenciaArea(Integer idPreferenciaArea) {
        this.idPreferenciaArea = idPreferenciaArea;
    }

    public Integer getIdSubArea() {
        return idSubArea;
    }

    public void setIdSubArea(Integer idSubArea) {
        this.idSubArea = idSubArea;
    }

//    public CatArea getIdArea() {
//        return idArea;
//    }
//
//    public void setIdArea(CatArea idArea) {
//        this.idArea = idArea;
//    }

    public Candidato getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Candidato idCandidato) {
        this.idCandidato = idCandidato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPreferenciaArea != null ? idPreferenciaArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreferenciaArea)) {
            return false;
        }
        PreferenciaArea other = (PreferenciaArea) object;
        if ((this.idPreferenciaArea == null && other.idPreferenciaArea != null) || (this.idPreferenciaArea != null && !this.idPreferenciaArea.equals(other.idPreferenciaArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.PreferenciaArea[ idPreferenciaArea=" + idPreferenciaArea + " ]";
    }
    
}
