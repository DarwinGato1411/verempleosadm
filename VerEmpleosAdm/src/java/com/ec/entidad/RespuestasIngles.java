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
@Table(name = "RespuestasIngles")
@NamedQueries({
    @NamedQuery(name = "RespuestasIngles.findAll", query = "SELECT r FROM RespuestasIngles r")})
public class RespuestasIngles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPregunta")
    private int idPregunta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Respuesta")
    private int respuesta;
    @JoinColumn(name = "IdAplicacion", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private AplicacionesIngles idAplicacion;

    public RespuestasIngles() {
    }

    public RespuestasIngles(Integer id) {
        this.id = id;
    }

    public RespuestasIngles(Integer id, int idPregunta, int respuesta) {
        this.id = id;
        this.idPregunta = idPregunta;
        this.respuesta = respuesta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public AplicacionesIngles getIdAplicacion() {
        return idAplicacion;
    }

    public void setIdAplicacion(AplicacionesIngles idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RespuestasIngles)) {
            return false;
        }
        RespuestasIngles other = (RespuestasIngles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.RespuestasIngles[ id=" + id + " ]";
    }
    
}
