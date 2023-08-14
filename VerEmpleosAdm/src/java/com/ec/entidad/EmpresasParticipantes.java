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
@Table(name = "EmpresasParticipantes")
public class EmpresasParticipantes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
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
    
    @Column(name = "FechaPublicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechapublicacion;
    @Column(name = "FechaFinPublicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinPublicacion;

//    @Size(min = 1, max = 500)
    

    public EmpresasParticipantes() {
    }

    public EmpresasParticipantes(int idusuario, String nombreempresa, String emailempresa, String pais) {
        this.idusuario = idusuario;
        this.nombreempresa = nombreempresa;
        this.emailempresa = emailempresa;
        this.pais = pais;
    }

    
    
    public EmpresasParticipantes(int idusuario, String nombreempresa, String emailempresa, String pais, Date fechapublicacion, Date fechafinPublicacion) {
        this.idusuario = idusuario;
        this.nombreempresa = nombreempresa;
        this.emailempresa = emailempresa;
        this.pais = pais;
        this.fechapublicacion = fechapublicacion;
        this.fechafinPublicacion = fechafinPublicacion;
    }

    public EmpresasParticipantes(String nombreempresa, String emailempresa, String pais,Date fechafinPublicacion,Date fechapublicacion) {

      
        this.nombreempresa = nombreempresa;

        this.emailempresa = emailempresa;

        this.pais = pais;

    }

//    public Date getFechapublicacion() {
//        return fechapublicacion;
//    }
//
//    public void setFechapublicacion(Date fechapublicacion) {
//        this.fechapublicacion = fechapublicacion;
//    }
//
//    public Date getFechafinPublicacion() {
//        return fechafinPublicacion;
//    }
//
//    public void setFechafinPublicacion(Date fechafinPublicacion) {
//        this.fechafinPublicacion = fechafinPublicacion;
//    }

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

    
    @Override
    public String toString() {
        return "com.ec.entidad.EmpresasFeria[ idUsuario=" + idusuario + " ]";
    }

}
