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
@Table(name = "tipo_usuario")
@NamedQueries({
    @NamedQuery(name = "TipoUsuario.findAll", query = "SELECT t FROM TipoUsuario t")})
public class TipoUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipousuario")
    private Integer idTipousuario;
    @Size(max = 50)
    @Column(name = "tipu_descripcion")
    private String tipuDescripcion;
    @Size(max = 10)
    @Column(name = "tipu_sigla")
    private String tipuSigla;
    @Column(name = "tipu_estado")
    private Boolean tipuEstado;
    @OneToMany(mappedBy = "idTipousuario")
    private Collection<Usuario> usuarioCollection;

    public TipoUsuario() {
    }

    public TipoUsuario(Integer idTipousuario) {
        this.idTipousuario = idTipousuario;
    }

    public Integer getIdTipousuario() {
        return idTipousuario;
    }

    public void setIdTipousuario(Integer idTipousuario) {
        this.idTipousuario = idTipousuario;
    }

    public String getTipuDescripcion() {
        return tipuDescripcion;
    }

    public void setTipuDescripcion(String tipuDescripcion) {
        this.tipuDescripcion = tipuDescripcion;
    }

    public String getTipuSigla() {
        return tipuSigla;
    }

    public void setTipuSigla(String tipuSigla) {
        this.tipuSigla = tipuSigla;
    }

    public Boolean getTipuEstado() {
        return tipuEstado;
    }

    public void setTipuEstado(Boolean tipuEstado) {
        this.tipuEstado = tipuEstado;
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
        hash += (idTipousuario != null ? idTipousuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoUsuario)) {
            return false;
        }
        TipoUsuario other = (TipoUsuario) object;
        if ((this.idTipousuario == null && other.idTipousuario != null) || (this.idTipousuario != null && !this.idTipousuario.equals(other.idTipousuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.TipoUsuario[ idTipousuario=" + idTipousuario + " ]";
    }
    
}
