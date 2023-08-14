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

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "CandidatoVisa")
@NamedQueries({
    @NamedQuery(name = "CandidatoVisa.findAll", query = "SELECT c FROM CandidatoVisa c")})
public class CandidatoVisa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCandidatoVisa")
    private Integer idCandidatoVisa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdVisaPais")
    private int idVisaPais;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCandidato")
    private int idCandidato;

    public CandidatoVisa() {
    }

    public CandidatoVisa(Integer idCandidatoVisa) {
        this.idCandidatoVisa = idCandidatoVisa;
    }

    public CandidatoVisa(Integer idCandidatoVisa, int idVisaPais, int idCandidato) {
        this.idCandidatoVisa = idCandidatoVisa;
        this.idVisaPais = idVisaPais;
        this.idCandidato = idCandidato;
    }

    public Integer getIdCandidatoVisa() {
        return idCandidatoVisa;
    }

    public void setIdCandidatoVisa(Integer idCandidatoVisa) {
        this.idCandidatoVisa = idCandidatoVisa;
    }

    public int getIdVisaPais() {
        return idVisaPais;
    }

    public void setIdVisaPais(int idVisaPais) {
        this.idVisaPais = idVisaPais;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCandidatoVisa != null ? idCandidatoVisa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CandidatoVisa)) {
            return false;
        }
        CandidatoVisa other = (CandidatoVisa) object;
        if ((this.idCandidatoVisa == null && other.idCandidatoVisa != null) || (this.idCandidatoVisa != null && !this.idCandidatoVisa.equals(other.idCandidatoVisa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CandidatoVisa[ idCandidatoVisa=" + idCandidatoVisa + " ]";
    }
    
}
