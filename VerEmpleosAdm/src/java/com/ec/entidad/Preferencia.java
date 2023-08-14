/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "preferencia")
@NamedQueries({
    @NamedQuery(name = "Preferencia.findAll", query = "SELECT p FROM Preferencia p")})
public class Preferencia implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "salarioDolar")
    private BigDecimal salarioDolar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dispuestoViajar")
    private boolean dispuestoViajar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "otraCiudad")
    private boolean otraCiudad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "otroPais")
    private boolean otroPais;
    @Size(max = 200)
    @Column(name = "habilidad")
    private String habilidad;
    @Size(max = 200)
    @Column(name = "comentario")
    private String comentario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCandidato")
    private int idCandidato;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPreferencia")
    private Integer idPreferencia;

    public Preferencia() {
    }

    public Preferencia(Integer idPreferencia) {
        this.idPreferencia = idPreferencia;
    }

    public Preferencia(Integer idPreferencia, boolean dispuestoViajar, boolean otraCiudad, boolean otroPais, int idCandidato) {
        this.idPreferencia = idPreferencia;
        this.dispuestoViajar = dispuestoViajar;
        this.otraCiudad = otraCiudad;
        this.otroPais = otroPais;
        this.idCandidato = idCandidato;
    }

    public BigDecimal getSalarioDolar() {
        return salarioDolar;
    }

    public void setSalarioDolar(BigDecimal salarioDolar) {
        this.salarioDolar = salarioDolar;
    }

    public boolean getDispuestoViajar() {
        return dispuestoViajar;
    }

    public void setDispuestoViajar(boolean dispuestoViajar) {
        this.dispuestoViajar = dispuestoViajar;
    }

    public boolean getOtraCiudad() {
        return otraCiudad;
    }

    public void setOtraCiudad(boolean otraCiudad) {
        this.otraCiudad = otraCiudad;
    }

    public boolean getOtroPais() {
        return otroPais;
    }

    public void setOtroPais(boolean otroPais) {
        this.otroPais = otroPais;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public Integer getIdPreferencia() {
        return idPreferencia;
    }

    public void setIdPreferencia(Integer idPreferencia) {
        this.idPreferencia = idPreferencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPreferencia != null ? idPreferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Preferencia)) {
            return false;
        }
        Preferencia other = (Preferencia) object;
        if ((this.idPreferencia == null && other.idPreferencia != null) || (this.idPreferencia != null && !this.idPreferencia.equals(other.idPreferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.Preferencia[ idPreferencia=" + idPreferencia + " ]";
    }
    
}
