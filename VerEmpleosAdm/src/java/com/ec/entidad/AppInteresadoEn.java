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
@Table(name = "app_InteresadoEn")
@NamedQueries({
    @NamedQuery(name = "AppInteresadoEn.findAll", query = "SELECT a FROM AppInteresadoEn a")})
public class AppInteresadoEn implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdInteresado")
    private Integer idInteresado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCandidato")
    private int idCandidato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdVacante")
    private int idVacante;

    public AppInteresadoEn() {
    }

    public AppInteresadoEn(Integer idInteresado) {
        this.idInteresado = idInteresado;
    }

    public AppInteresadoEn(Integer idInteresado, int idCandidato, int idVacante) {
        this.idInteresado = idInteresado;
        this.idCandidato = idCandidato;
        this.idVacante = idVacante;
    }

    public Integer getIdInteresado() {
        return idInteresado;
    }

    public void setIdInteresado(Integer idInteresado) {
        this.idInteresado = idInteresado;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public int getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(int idVacante) {
        this.idVacante = idVacante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInteresado != null ? idInteresado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AppInteresadoEn)) {
            return false;
        }
        AppInteresadoEn other = (AppInteresadoEn) object;
        if ((this.idInteresado == null && other.idInteresado != null) || (this.idInteresado != null && !this.idInteresado.equals(other.idInteresado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.AppInteresadoEn[ idInteresado=" + idInteresado + " ]";
    }
    
}
