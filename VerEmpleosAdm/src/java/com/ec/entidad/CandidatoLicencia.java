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
@Table(name = "candidatoLicencia")
@NamedQueries({
    @NamedQuery(name = "CandidatoLicencia.findAll", query = "SELECT c FROM CandidatoLicencia c")})
public class CandidatoLicencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCandidatoLicencia")
    private Integer idCandidatoLicencia;
//    @JoinColumn(name = "idLicencia", referencedColumnName = "Id")
//    @ManyToOne(optional = false)
//    private CatTipoLicencia idLicencia;
    @JoinColumn(name = "idCandidato", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Candidato idCandidato;

    public CandidatoLicencia() {
    }

    public CandidatoLicencia(Integer idCandidatoLicencia) {
        this.idCandidatoLicencia = idCandidatoLicencia;
    }

    public Integer getIdCandidatoLicencia() {
        return idCandidatoLicencia;
    }

    public void setIdCandidatoLicencia(Integer idCandidatoLicencia) {
        this.idCandidatoLicencia = idCandidatoLicencia;
    }

//    public CatTipoLicencia getIdLicencia() {
//        return idLicencia;
//    }
//
//    public void setIdLicencia(CatTipoLicencia idLicencia) {
//        this.idLicencia = idLicencia;
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
        hash += (idCandidatoLicencia != null ? idCandidatoLicencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CandidatoLicencia)) {
            return false;
        }
        CandidatoLicencia other = (CandidatoLicencia) object;
        if ((this.idCandidatoLicencia == null && other.idCandidatoLicencia != null) || (this.idCandidatoLicencia != null && !this.idCandidatoLicencia.equals(other.idCandidatoLicencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CandidatoLicencia[ idCandidatoLicencia=" + idCandidatoLicencia + " ]";
    }
    
}
