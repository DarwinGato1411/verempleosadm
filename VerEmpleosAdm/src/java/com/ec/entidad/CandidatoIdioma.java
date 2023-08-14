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
import javax.validation.constraints.Size;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "candidatoIdioma")
@NamedQueries({
    @NamedQuery(name = "CandidatoIdioma.findAll", query = "SELECT c FROM CandidatoIdioma c")})
public class CandidatoIdioma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCandidatoIdioma")
    private Integer idCandidatoIdioma;
    @Size(max = 10)
    @Column(name = "nivel")
    private String nivel;
    @JoinColumn(name = "idIdioma", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private CatIdioma idIdioma;
    @JoinColumn(name = "idCandidato", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Candidato idCandidato;

    public CandidatoIdioma() {
    }

    public CandidatoIdioma(Integer idCandidatoIdioma) {
        this.idCandidatoIdioma = idCandidatoIdioma;
    }

    public Integer getIdCandidatoIdioma() {
        return idCandidatoIdioma;
    }

    public void setIdCandidatoIdioma(Integer idCandidatoIdioma) {
        this.idCandidatoIdioma = idCandidatoIdioma;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public CatIdioma getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(CatIdioma idIdioma) {
        this.idIdioma = idIdioma;
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
        hash += (idCandidatoIdioma != null ? idCandidatoIdioma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CandidatoIdioma)) {
            return false;
        }
        CandidatoIdioma other = (CandidatoIdioma) object;
        if ((this.idCandidatoIdioma == null && other.idCandidatoIdioma != null) || (this.idCandidatoIdioma != null && !this.idCandidatoIdioma.equals(other.idCandidatoIdioma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CandidatoIdioma[ idCandidatoIdioma=" + idCandidatoIdioma + " ]";
    }
    
}
