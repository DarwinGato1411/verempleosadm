/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "perfil")
@NamedQueries({
    @NamedQuery(name = "Perfil.findAll", query = "SELECT p FROM Perfil p")})
public class Perfil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_perfil")
    private Integer idPerfil;
    @Size(max = 50)
    @Column(name = "perf_descripcion")
    private String perfDescripcion;
    @Size(max = 10)
    @Column(name = "perf_sigla")
    private String perfSigla;
    @Column(name = "perf_estado")
    private Boolean perfEstado;
    @OneToMany(mappedBy = "idPerfil")
    private Collection<Opcion> opcionCollection;
    @OneToMany(mappedBy = "idPerfil")
    private Collection<Usuario> usuarioCollection;

    public Perfil() {
    }

    public Perfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getPerfDescripcion() {
        return perfDescripcion;
    }

    public void setPerfDescripcion(String perfDescripcion) {
        this.perfDescripcion = perfDescripcion;
    }

    public String getPerfSigla() {
        return perfSigla;
    }

    public void setPerfSigla(String perfSigla) {
        this.perfSigla = perfSigla;
    }

    public Boolean getPerfEstado() {
        return perfEstado;
    }

    public void setPerfEstado(Boolean perfEstado) {
        this.perfEstado = perfEstado;
    }

    public Collection<Opcion> getOpcionCollection() {
        return opcionCollection;
    }

    public void setOpcionCollection(Collection<Opcion> opcionCollection) {
        this.opcionCollection = opcionCollection;
    }

    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfil != null ? idPerfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perfil)) {
            return false;
        }
        Perfil other = (Perfil) object;
        if ((this.idPerfil == null && other.idPerfil != null) || (this.idPerfil != null && !this.idPerfil.equals(other.idPerfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.Perfil[ idPerfil=" + idPerfil + " ]";
    }
    
}
