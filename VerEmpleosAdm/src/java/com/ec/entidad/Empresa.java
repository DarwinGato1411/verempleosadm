/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.entidad;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.zkoss.image.AImage;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "empresa")
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdUsuario")
    private Integer idUsuario;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 50)
    @Column(name = "NombreEmpresa")
    private String nombreEmpresa;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 200)
    @Column(name = "Descripcion")
    private String descripcion;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 50)
    @Column(name = "TelefonoPrimario")
    private String telefonoPrimario;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 50)
    @Column(name = "TelefonoSecundario")
    private String telefonoSecundario;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 50)
    @Column(name = "Fax")
    private String fax;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 200)
    @Column(name = "ProductoServicio")
    private String productoServicio;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 50)
    @Column(name = "NombreEncargado")
    private String nombreEncargado;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 70)
    @Column(name = "ApellidoEncargado")
    private String apellidoEncargado;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 50)
    @Column(name = "Referido")
    private String referido;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 50)
    @Column(name = "RazonSocial")
    private String razonSocial;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 50)
    @Column(name = "Rfc")
    private String rfc;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 50)
    @Column(name = "EmailEmpresa")
    private String emailEmpresa;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 50)
    @Column(name = "Paginaweb")
    private String paginaweb;
//    @Basic(optional = false)
//    @NotNull
    @Column(name = "CantidadEmpleado")
    private int cantidadEmpleado;
    @Lob
    @Column(name = "Logo")
    private byte[] logo;
//    @Basic(optional = false)
//    @NotNull

//    @Basic(optional = false)
//    @NotNull
    @Column(name = "IdEstado")
    private int idEstado;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 50)
    @Column(name = "Ciudad")
    private String ciudad;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 500)
    @Column(name = "Direccion")
    private String direccion;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 50)
    @Column(name = "CodigoPostal")
    private String codigoPostal;
    @Column(name = "emp_linkedIn")
    private String empLinkedIn;
    @Column(name = "emp_whatsapp")
    private String empWhatsapp;
//    @Basic(optional = false)
//    @NotNull
    @Column(name = "IdGeolocalizacion")
    private int idGeolocalizacion;
    @Column(name = "emp_participa_feria")
    private Boolean empParticipaFeria;
    @Lob
    @Column(name = "LogoMiniatura")
    private byte[] logoMiniatura;
    @JoinColumn(name = "IdGiro", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private CatGiroEmpresa idGiro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private Collection<MembresiaEmpresa> membresiaEmpresaCollection;

    @Transient
    private AImage fotoGeneral = null;
    @Transient
    private String paistext = "";

    @Column(name = "emp_path_logo_feria")
    private String logoFeria;

    @Column(name = "emp_video_feria")
    private String videoFeria;
    @Column(name = "IdPais")
    private Integer idPais;
    @Column(name = "emp_tipo_stand")
    private Integer empTipoStand;
//    @Column(name = "Pais")
//    private String pais;

    public String getLogoFeria() {
        return logoFeria;
    }

    public void setLogoFeria(String logoFeria) {
        this.logoFeria = logoFeria;
    }

    public String getVideoFeria() {
        return videoFeria;
    }

    public void setVideoFeria(String videoFeria) {
        this.videoFeria = videoFeria;
    }

//	public String getPais() {
//		return pais;
//	}
//
//	public void setPais(String pais) {
//		this.pais = pais;
//	}
    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public Empresa() {
    }

    public Empresa(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Empresa(Integer idUsuario, String nombreEmpresa, String descripcion, String telefonoPrimario, String telefonoSecundario, String fax, String productoServicio, String nombreEncargado, String apellidoEncargado, String referido, String razonSocial, String rfc, String emailEmpresa, String paginaweb, int cantidadEmpleado, int idPais, int idEstado, String ciudad, String direccion, String codigoPostal, int idGeolocalizacion) {
        this.idUsuario = idUsuario;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcion = descripcion;
        this.telefonoPrimario = telefonoPrimario;
        this.telefonoSecundario = telefonoSecundario;
        this.fax = fax;
        this.productoServicio = productoServicio;
        this.nombreEncargado = nombreEncargado;
        this.apellidoEncargado = apellidoEncargado;
        this.referido = referido;
        this.razonSocial = razonSocial;
        this.rfc = rfc;
        this.emailEmpresa = emailEmpresa;
        this.paginaweb = paginaweb;
        this.cantidadEmpleado = cantidadEmpleado;
        this.idPais = idPais;
        this.idEstado = idEstado;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.idGeolocalizacion = idGeolocalizacion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefonoPrimario() {
        return telefonoPrimario;
    }

    public void setTelefonoPrimario(String telefonoPrimario) {
        this.telefonoPrimario = telefonoPrimario;
    }

    public String getTelefonoSecundario() {
        return telefonoSecundario;
    }

    public void setTelefonoSecundario(String telefonoSecundario) {
        this.telefonoSecundario = telefonoSecundario;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getProductoServicio() {
        return productoServicio;
    }

    public void setProductoServicio(String productoServicio) {
        this.productoServicio = productoServicio;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getApellidoEncargado() {
        return apellidoEncargado;
    }

    public void setApellidoEncargado(String apellidoEncargado) {
        this.apellidoEncargado = apellidoEncargado;
    }

    public String getReferido() {
        return referido;
    }

    public void setReferido(String referido) {
        this.referido = referido;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getPaginaweb() {
        return paginaweb;
    }

    public void setPaginaweb(String paginaweb) {
        this.paginaweb = paginaweb;
    }

    public int getCantidadEmpleado() {
        return cantidadEmpleado;
    }

    public void setCantidadEmpleado(int cantidadEmpleado) {
        this.cantidadEmpleado = cantidadEmpleado;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getIdGeolocalizacion() {
        return idGeolocalizacion;
    }

    public void setIdGeolocalizacion(int idGeolocalizacion) {
        this.idGeolocalizacion = idGeolocalizacion;
    }

    public byte[] getLogoMiniatura() {
        return logoMiniatura;
    }

    public void setLogoMiniatura(byte[] logoMiniatura) {
        this.logoMiniatura = logoMiniatura;
    }

    public CatGiroEmpresa getIdGiro() {
        return idGiro;
    }

    public void setIdGiro(CatGiroEmpresa idGiro) {
        this.idGiro = idGiro;
    }

    public Boolean getEmpParticipaFeria() {
        return empParticipaFeria;
    }

    public void setEmpParticipaFeria(Boolean empParticipaFeria) {
        this.empParticipaFeria = empParticipaFeria;
    }

    public Collection<MembresiaEmpresa> getMembresiaEmpresaCollection() {
        return membresiaEmpresaCollection;
    }

    public void setMembresiaEmpresaCollection(Collection<MembresiaEmpresa> membresiaEmpresaCollection) {
        this.membresiaEmpresaCollection = membresiaEmpresaCollection;
    }

    public AImage getFotoGeneral() throws IOException {
        if (getLogo() != null) {
            fotoGeneral = new AImage("fotoGeneral", getLogo());
        }
        return fotoGeneral;
    }

    public void setFotoGeneral(AImage fotoGeneral) {
        this.fotoGeneral = fotoGeneral;
    }

    public String getEmpLinkedIn() {
        return empLinkedIn;
    }

    public void setEmpLinkedIn(String empLinkedIn) {
        this.empLinkedIn = empLinkedIn;
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
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empresa{" + "idUsuario=" + idUsuario + ", nombreEmpresa=" + nombreEmpresa + ", descripcion=" + descripcion + ", telefonoPrimario=" + telefonoPrimario + ", telefonoSecundario=" + telefonoSecundario + ", fax=" + fax + ", productoServicio=" + productoServicio + ", nombreEncargado=" + nombreEncargado + ", apellidoEncargado=" + apellidoEncargado + ", referido=" + referido + ", razonSocial=" + razonSocial + ", rfc=" + rfc + ", emailEmpresa=" + emailEmpresa + ", paginaweb=" + paginaweb + ", cantidadEmpleado=" + cantidadEmpleado + '}';
    }

    public Integer getEmpTipoStand() {
        return empTipoStand == null ? 1 : empTipoStand;
    }

    public void setEmpTipoStand(Integer empTipoStand) {
        this.empTipoStand = empTipoStand;
    }

    public String getPaistext() {

        if (idPais == 1) {
            paistext = "Estados Unidos";
        } else if (idPais == 28) {
            paistext = "Bolivia";
        } else if (idPais == 46) {
            paistext = "Chile";
        } else if (idPais == 49) {
            paistext = "Colombia";
        } else if (idPais == 54) {
            paistext = "Costa Rica";
        } else if (idPais == 62) {
            paistext = "Ecuador";
        } else if (idPais == 64) {
            paistext = "El Salvador";
        } else if (idPais == 91) {
            paistext = "Guatemala";
        } else if (idPais == 99) {
            paistext = "Honduras";
        } else if (idPais == 156) {
            paistext = "México";
        } else if (idPais == 161) {
            paistext = "Nicaragua";
        } else if (idPais == 174) {
            paistext = "Panamá";
        } else if (idPais == 177) {
            paistext = "Perú";
        } else if (idPais == 233) {
            paistext = "Venezuela";
        } else if (idPais == 595) {
            paistext = "Paraguay";
        } else if (idPais == 596) {
            paistext = "Republica Dominicana";
        }
        return paistext;
    }

    public void setPaistext(String paistext) {
        this.paistext = paistext;
    }

    public String getEmpWhatsapp() {
        return empWhatsapp;
    }

    public void setEmpWhatsapp(String empWhatsapp) {
        this.empWhatsapp = empWhatsapp;
    }

}
