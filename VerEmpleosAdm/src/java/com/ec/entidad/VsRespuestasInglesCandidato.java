/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "vs_RespuestasInglesCandidato")
@NamedQueries({
    @NamedQuery(name = "VsRespuestasInglesCandidato.findAll", query = "SELECT v FROM VsRespuestasInglesCandidato v")})
public class VsRespuestasInglesCandidato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "Registro")
    @Id
    private BigInteger registro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Pregunta")
    private String pregunta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nivel")
    private int nivel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCandidato")
    private int idCandidato;

    public VsRespuestasInglesCandidato() {
    }

    public BigInteger getRegistro() {
        return registro;
    }

    public void setRegistro(BigInteger registro) {
        this.registro = registro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }
    
}
