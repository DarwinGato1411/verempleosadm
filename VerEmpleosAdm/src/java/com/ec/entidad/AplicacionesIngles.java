/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "AplicacionesIngles")
@NamedQueries({
    @NamedQuery(name = "AplicacionesIngles.findAll", query = "SELECT a FROM AplicacionesIngles a")})
public class AplicacionesIngles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nivel")
    private int nivel;
    @JoinColumn(name = "IdCandidato", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Usuario idCandidato;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAplicacion")
    private Collection<RespuestasIngles> respuestasInglesCollection;

    public AplicacionesIngles() {
    }

    public AplicacionesIngles(Integer id) {
        this.id = id;
    }

    public AplicacionesIngles(Integer id, Date fecha, int nivel) {
        this.id = id;
        this.fecha = fecha;
        this.nivel = nivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Usuario getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Usuario idCandidato) {
        this.idCandidato = idCandidato;
    }

    public Collection<RespuestasIngles> getRespuestasInglesCollection() {
        return respuestasInglesCollection;
    }

    public void setRespuestasInglesCollection(Collection<RespuestasIngles> respuestasInglesCollection) {
        this.respuestasInglesCollection = respuestasInglesCollection;
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
        if (!(object instanceof AplicacionesIngles)) {
            return false;
        }
        AplicacionesIngles other = (AplicacionesIngles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.AplicacionesIngles[ id=" + id + " ]";
    }
    
}
