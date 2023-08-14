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
@Table(name = "Cat_PreguntasOpcionesIngles")
@NamedQueries({
    @NamedQuery(name = "CatPreguntasOpcionesIngles.findAll", query = "SELECT c FROM CatPreguntasOpcionesIngles c")})
public class CatPreguntasOpcionesIngles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Opcion")
    private String opcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Correcta")
    private boolean correcta;
    @JoinColumn(name = "IdPregunta", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private CatPreguntasIngles idPregunta;

    public CatPreguntasOpcionesIngles() {
    }

    public CatPreguntasOpcionesIngles(Integer id) {
        this.id = id;
    }

    public CatPreguntasOpcionesIngles(Integer id, String opcion, boolean correcta) {
        this.id = id;
        this.opcion = opcion;
        this.correcta = correcta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public boolean getCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }

    public CatPreguntasIngles getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(CatPreguntasIngles idPregunta) {
        this.idPregunta = idPregunta;
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
        if (!(object instanceof CatPreguntasOpcionesIngles)) {
            return false;
        }
        CatPreguntasOpcionesIngles other = (CatPreguntasOpcionesIngles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CatPreguntasOpcionesIngles[ id=" + id + " ]";
    }
    
}
