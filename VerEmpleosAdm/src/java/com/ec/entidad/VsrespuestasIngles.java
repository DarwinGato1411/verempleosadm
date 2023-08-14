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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "vs_respuestasIngles")
@NamedQueries({
    @NamedQuery(name = "VsrespuestasIngles.findAll", query = "SELECT v FROM VsrespuestasIngles v")})
public class VsrespuestasIngles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "TotalRespuestas")
    @Id
    private Integer totalRespuestas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nivel")
    private int nivel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Correcta")
    private boolean correcta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCandidato")
    private int idCandidato;

    public VsrespuestasIngles() {
    }

    public Integer getTotalRespuestas() {
        return totalRespuestas;
    }

    public void setTotalRespuestas(Integer totalRespuestas) {
        this.totalRespuestas = totalRespuestas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean getCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }
    
}
