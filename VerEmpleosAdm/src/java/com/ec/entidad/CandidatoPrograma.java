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
@Table(name = "candidatoPrograma")
@NamedQueries({
    @NamedQuery(name = "CandidatoPrograma.findAll", query = "SELECT c FROM CandidatoPrograma c")})
public class CandidatoPrograma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCandidatoPrograma")
    private Integer idCandidatoPrograma;
    @Column(name = "IdSubAreaInformatica")
    private Integer idSubAreaInformatica;
    @JoinColumn(name = "IdNivel", referencedColumnName = "idPrograma")
    @ManyToOne(optional = false)
    private Programa idNivel;
    @JoinColumn(name = "idCandidato", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Candidato idCandidato;

    public CandidatoPrograma() {
    }

    public CandidatoPrograma(Integer idCandidatoPrograma) {
        this.idCandidatoPrograma = idCandidatoPrograma;
    }

    public Integer getIdCandidatoPrograma() {
        return idCandidatoPrograma;
    }

    public void setIdCandidatoPrograma(Integer idCandidatoPrograma) {
        this.idCandidatoPrograma = idCandidatoPrograma;
    }

    public Integer getIdSubAreaInformatica() {
        return idSubAreaInformatica;
    }

    public void setIdSubAreaInformatica(Integer idSubAreaInformatica) {
        this.idSubAreaInformatica = idSubAreaInformatica;
    }

    public Programa getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Programa idNivel) {
        this.idNivel = idNivel;
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
        hash += (idCandidatoPrograma != null ? idCandidatoPrograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CandidatoPrograma)) {
            return false;
        }
        CandidatoPrograma other = (CandidatoPrograma) object;
        if ((this.idCandidatoPrograma == null && other.idCandidatoPrograma != null) || (this.idCandidatoPrograma != null && !this.idCandidatoPrograma.equals(other.idCandidatoPrograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CandidatoPrograma[ idCandidatoPrograma=" + idCandidatoPrograma + " ]";
    }
    
}
