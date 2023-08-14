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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "usuariosEmpresasCandidatosRegistrados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuariosEmpresasCandidatosRegistrados.findAll", query = "SELECT u FROM UsuariosEmpresasCandidatosRegistrados u"),
    @NamedQuery(name = "UsuariosEmpresasCandidatosRegistrados.findByIdUsuario", query = "SELECT u FROM UsuariosEmpresasCandidatosRegistrados u WHERE u.idUsuario = :idUsuario")})
public class UsuariosEmpresasCandidatosRegistrados implements Serializable {
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
    @Column(name = "mod_administrativo")
    private Boolean modAdministrativo;

    public UsuariosEmpresasCandidatosRegistrados() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
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

    public boolean isEdoConfirmacion() {
        return edoConfirmacion;
    }

    public void setEdoConfirmacion(boolean edoConfirmacion) {
        this.edoConfirmacion = edoConfirmacion;
    }

    public boolean isTipo() {
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

    public Boolean getModAdministrativo() {
        return modAdministrativo;
    }

    public void setModAdministrativo(Boolean modAdministrativo) {
        this.modAdministrativo = modAdministrativo;
    }
    
}
