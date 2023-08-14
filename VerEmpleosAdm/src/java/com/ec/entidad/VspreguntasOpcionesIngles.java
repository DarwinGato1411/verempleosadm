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
import javax.validation.constraints.Size;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "vs_preguntasOpcionesIngles")
@NamedQueries({
    @NamedQuery(name = "VspreguntasOpcionesIngles.findAll", query = "SELECT v FROM VspreguntasOpcionesIngles v")})
public class VspreguntasOpcionesIngles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    @Id
    private int id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Pregunta")
    private String pregunta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdOpcionPregunta")
    private int idOpcionPregunta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Opcion")
    private String opcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nivel")
    private int nivel;

    public VspreguntasOpcionesIngles() {
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

    public int getIdOpcionPregunta() {
        return idOpcionPregunta;
    }

    public void setIdOpcionPregunta(int idOpcionPregunta) {
        this.idOpcionPregunta = idOpcionPregunta;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
