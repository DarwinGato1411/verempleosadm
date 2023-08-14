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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author
 */
@Entity
@Table(name = "EmpresasVacantes")
public class EmpresasVacante implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "IdVacante")
    private int idvacante;

    @Column(name = "IdUsuario")
    private int idusuario;

//    @Size(min = 1, max = 60)
    @Column(name = "NombreEmpresa")
    private String nombreempresa;
    //@Basic(optional = false)
    //@NotNull
//    @Size(min = 1, max = 2147483647)
    @Column(name = "EmailEmpresa")
    private String emailempresa;

//    @Size(min = 1, max = 100)
    @Column(name = "Pais")
    private String pais;

//    @Size(min = 1, max = 500)
    @Column(name = "Puesto")
    private String puesto;

    @Column(name = "FechaPublicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechapublicacion;

    @Column(name = "FechaFinPublicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinPublicacion;

    public EmpresasVacante() {
    }

    public EmpresasVacante(String nombreempresa, String emailempresa, String pais, Date fechapublicacion, Date fechafinPublicacion, String puesto) {

        this.puesto = puesto;
        this.nombreempresa = nombreempresa;

        this.emailempresa = emailempresa;

        this.pais = pais;

    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getEmailempresa() {
        return emailempresa;
    }

    public void setEmailempresa(String emailempresa) {
        this.emailempresa = emailempresa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Date getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(Date fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public Date getFechafinPublicacion() {
        return fechafinPublicacion;
    }

    public void setFechafinPublicacion(Date fechafinPublicacion) {
        this.fechafinPublicacion = fechafinPublicacion;
    }

    public int getIdvacante() {
        return idvacante;
    }

    public void setIdvacante(int idvacante) {
        this.idvacante = idvacante;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.EmpresasFeria[ idUsuario=" + idusuario + " ]";
    }

}
