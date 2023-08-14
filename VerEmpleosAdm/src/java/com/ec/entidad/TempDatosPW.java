/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "TempDatosPW")
@NamedQueries({
    @NamedQuery(name = "TempDatosPW.findAll", query = "SELECT t FROM TempDatosPW t")})
public class TempDatosPW implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "Apellido")
    private String apellido;
    @Size(max = 50)
    @Column(name = "CedulaIdentificacion")
    private String cedulaIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Genero")
    private boolean genero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstadoCivil")
    private int estadoCivil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TelefonoFijo")
    private String telefonoFijo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TelefonoCelular")
    private String telefonoCelular;
    @Size(max = 70)
    @Column(name = "Apellido2")
    private String apellido2;
    @Column(name = "IdTitulo")
    private Integer idTitulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "tituloObtenidoT")
    private String tituloObtenidoT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAreaPA")
    private int idAreaPA;
    @Column(name = "idSubAreaPA")
    private Integer idSubAreaPA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEstadoU")
    private int idEstadoU;
    @Size(max = 100)
    @Column(name = "ciudadU")
    private String ciudadU;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "direccionU")
    private String direccionU;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "codigoPostalU")
    private String codigoPostalU;
    @Column(name = "IdUsuario")
    private Integer idUsuario;
    @Size(max = 100)
    @Column(name = "Token")
    private String token;
    @Column(name = "Estatus")
    private Boolean estatus;

    public TempDatosPW() {
    }

    public TempDatosPW(Integer id) {
        this.id = id;
    }

    public TempDatosPW(Integer id, String email, String nombre, String apellido, boolean genero, Date fechaNacimiento, int estadoCivil, String telefonoFijo, String telefonoCelular, String tituloObtenidoT, int idAreaPA, int idEstadoU, String direccionU, String codigoPostalU) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.tituloObtenidoT = tituloObtenidoT;
        this.idAreaPA = idAreaPA;
        this.idEstadoU = idEstadoU;
        this.direccionU = direccionU;
        this.codigoPostalU = codigoPostalU;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedulaIdentificacion() {
        return cedulaIdentificacion;
    }

    public void setCedulaIdentificacion(String cedulaIdentificacion) {
        this.cedulaIdentificacion = cedulaIdentificacion;
    }

    public boolean getGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Integer getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(Integer idTitulo) {
        this.idTitulo = idTitulo;
    }

    public String getTituloObtenidoT() {
        return tituloObtenidoT;
    }

    public void setTituloObtenidoT(String tituloObtenidoT) {
        this.tituloObtenidoT = tituloObtenidoT;
    }

    public int getIdAreaPA() {
        return idAreaPA;
    }

    public void setIdAreaPA(int idAreaPA) {
        this.idAreaPA = idAreaPA;
    }

    public Integer getIdSubAreaPA() {
        return idSubAreaPA;
    }

    public void setIdSubAreaPA(Integer idSubAreaPA) {
        this.idSubAreaPA = idSubAreaPA;
    }

    public int getIdEstadoU() {
        return idEstadoU;
    }

    public void setIdEstadoU(int idEstadoU) {
        this.idEstadoU = idEstadoU;
    }

    public String getCiudadU() {
        return ciudadU;
    }

    public void setCiudadU(String ciudadU) {
        this.ciudadU = ciudadU;
    }

    public String getDireccionU() {
        return direccionU;
    }

    public void setDireccionU(String direccionU) {
        this.direccionU = direccionU;
    }

    public String getCodigoPostalU() {
        return codigoPostalU;
    }

    public void setCodigoPostalU(String codigoPostalU) {
        this.codigoPostalU = codigoPostalU;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
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
        if (!(object instanceof TempDatosPW)) {
            return false;
        }
        TempDatosPW other = (TempDatosPW) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.TempDatosPW[ id=" + id + " ]";
    }
    
}
