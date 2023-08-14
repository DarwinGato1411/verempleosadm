/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "Cat_PreguntasIngles")
@NamedQueries({
    @NamedQuery(name = "CatPreguntasIngles.findAll", query = "SELECT c FROM CatPreguntasIngles c")})
public class CatPreguntasIngles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Pregunta")
    private String pregunta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nivel")
    private int nivel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPregunta")
    private Collection<CatPreguntasOpcionesIngles> catPreguntasOpcionesInglesCollection;

    public CatPreguntasIngles() {
    }

    public CatPreguntasIngles(Integer id) {
        this.id = id;
    }

    public CatPreguntasIngles(Integer id, String pregunta, int nivel) {
        this.id = id;
        this.pregunta = pregunta;
        this.nivel = nivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Collection<CatPreguntasOpcionesIngles> getCatPreguntasOpcionesInglesCollection() {
        return catPreguntasOpcionesInglesCollection;
    }

    public void setCatPreguntasOpcionesInglesCollection(Collection<CatPreguntasOpcionesIngles> catPreguntasOpcionesInglesCollection) {
        this.catPreguntasOpcionesInglesCollection = catPreguntasOpcionesInglesCollection;
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
        if (!(object instanceof CatPreguntasIngles)) {
            return false;
        }
        CatPreguntasIngles other = (CatPreguntasIngles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CatPreguntasIngles[ id=" + id + " ]";
    }
    
}
