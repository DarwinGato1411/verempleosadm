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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "usuariosSinEmpresaCandidato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuariosSinEmpresaCandidato.findAll", query = "SELECT u FROM UsuariosSinEmpresaCandidato u"),
    @NamedQuery(name = "UsuariosSinEmpresaCandidato.findByIdUsuario", query = "SELECT u FROM UsuariosSinEmpresaCandidato u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "UsuariosSinEmpresaCandidato.findByContrasenia", query = "SELECT u FROM UsuariosSinEmpresaCandidato u WHERE u.contrasenia = :contrasenia"),
    @NamedQuery(name = "UsuariosSinEmpresaCandidato.findByEmail", query = "SELECT u FROM UsuariosSinEmpresaCandidato u WHERE u.email = :email"),
    @NamedQuery(name = "UsuariosSinEmpresaCandidato.findByEdoConfirmacion", query = "SELECT u FROM UsuariosSinEmpresaCandidato u WHERE u.edoConfirmacion = :edoConfirmacion"),
    @NamedQuery(name = "UsuariosSinEmpresaCandidato.findByTipo", query = "SELECT u FROM UsuariosSinEmpresaCandidato u WHERE u.tipo = :tipo"),
    @NamedQuery(name = "UsuariosSinEmpresaCandidato.findByToken", query = "SELECT u FROM UsuariosSinEmpresaCandidato u WHERE u.token = :token"),
    @NamedQuery(name = "UsuariosSinEmpresaCandidato.findByUsuTipo", query = "SELECT u FROM UsuariosSinEmpresaCandidato u WHERE u.usuTipo = :usuTipo"),
    @NamedQuery(name = "UsuariosSinEmpresaCandidato.findByIdCatEstado", query = "SELECT u FROM UsuariosSinEmpresaCandidato u WHERE u.idCatEstado = :idCatEstado"),
    @NamedQuery(name = "UsuariosSinEmpresaCandidato.findByModAdministrativo", query = "SELECT u FROM UsuariosSinEmpresaCandidato u WHERE u.modAdministrativo = :modAdministrativo")})
public class UsuariosSinEmpresaCandidato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdUsuario")
    private Integer idUsuario;
    @Size(max = 50)
    @Column(name = "Contrasenia")
    private String contrasenia;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EdoConfirmacion")
    private boolean edoConfirmacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tipo")
    private boolean tipo;
    @Size(max = 200)
    @Column(name = "Token")
    private String token;
    @Size(max = 20)
    @Column(name = "usu_tipo")
    private String usuTipo;
    @Column(name = "id_cat_estado")
    private Integer idCatEstado;
    @Column(name = "mod_administrativo")
    private Boolean modAdministrativo;

    public UsuariosSinEmpresaCandidato() {
    }

    public UsuariosSinEmpresaCandidato(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuariosSinEmpresaCandidato(Integer idUsuario, String email, boolean edoConfirmacion, boolean tipo) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.edoConfirmacion = edoConfirmacion;
        this.tipo = tipo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getEdoConfirmacion() {
        return edoConfirmacion;
    }

    public void setEdoConfirmacion(boolean edoConfirmacion) {
        this.edoConfirmacion = edoConfirmacion;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsuTipo() {
        return usuTipo;
    }

    public void setUsuTipo(String usuTipo) {
        this.usuTipo = usuTipo;
    }

    public Integer getIdCatEstado() {
        return idCatEstado;
    }

    public void setIdCatEstado(Integer idCatEstado) {
        this.idCatEstado = idCatEstado;
    }

    public Boolean getModAdministrativo() {
        return modAdministrativo;
    }

    public void setModAdministrativo(Boolean modAdministrativo) {
        this.modAdministrativo = modAdministrativo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuariosSinEmpresaCandidato)) {
            return false;
        }
        UsuariosSinEmpresaCandidato other = (UsuariosSinEmpresaCandidato) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.UsuariosSinEmpresaCandidato[ idUsuario=" + idUsuario + " ]";
    }
    
}
