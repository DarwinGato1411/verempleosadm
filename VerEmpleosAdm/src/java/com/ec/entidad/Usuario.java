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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCandidato")
    private Collection<AplicacionesIngles> aplicacionesInglesCollection;
    @JoinColumn(name = "id_tipousuario", referencedColumnName = "id_tipousuario")
    @ManyToOne
    private TipoUsuario idTipousuario;
       
    @JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil")
    @ManyToOne
    private Perfil idPerfil;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private Collection<Ubicacion> ubicacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCandidato")
    private Collection<VsAplicacionIngles> vsAplicacionInglesCollection;
    @JoinColumn(name = "id_cat_estado", referencedColumnName = "Id")
    @ManyToOne
    private CatEstado idCatEstado;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Integer idUsuario, String email, boolean edoConfirmacion, boolean tipo) {
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

    public Collection<AplicacionesIngles> getAplicacionesInglesCollection() {
        return aplicacionesInglesCollection;
    }

    public void setAplicacionesInglesCollection(Collection<AplicacionesIngles> aplicacionesInglesCollection) {
        this.aplicacionesInglesCollection = aplicacionesInglesCollection;
    }

    public TipoUsuario getIdTipousuario() {
        return idTipousuario;
    }

    public void setIdTipousuario(TipoUsuario idTipousuario) {
        this.idTipousuario = idTipousuario;
    }

    public Perfil getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Perfil idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Collection<Ubicacion> getUbicacionCollection() {
        return ubicacionCollection;
    }

    public void setUbicacionCollection(Collection<Ubicacion> ubicacionCollection) {
        this.ubicacionCollection = ubicacionCollection;
    }

    public Collection<VsAplicacionIngles> getVsAplicacionInglesCollection() {
        return vsAplicacionInglesCollection;
    }

    public void setVsAplicacionInglesCollection(Collection<VsAplicacionIngles> vsAplicacionInglesCollection) {
        this.vsAplicacionInglesCollection = vsAplicacionInglesCollection;
    }

    public CatEstado getIdCatEstado() {
        return idCatEstado;
    }

    public void setIdCatEstado(CatEstado idCatEstado) {
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", contrasenia=" + contrasenia + ", email=" + email + ", edoConfirmacion=" + edoConfirmacion + ", tipo=" + tipo + ", token=" + token + ", usuTipo=" + usuTipo + ", idTipousuario=" + idTipousuario + ", idPerfil=" + idPerfil + '}';
    }

}
