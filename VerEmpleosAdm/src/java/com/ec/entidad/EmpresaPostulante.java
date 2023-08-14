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

/**
 *
 * @author
 */
@Entity
@Table(name = "Postulante")
public class EmpresaPostulante implements Serializable {
  private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "IdViewPostulante")
    private String IdViewPostulante;

    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
//    @Basic(optional = false)
//    @Column(name = "IdUsuario")
//    private int idUsuario;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "IdVacante")
    private Integer IdVacante;
    @Column(name = "Apellido")
    private String apellido;
      @Column(name = "Puesto")
    private String puesto;
//    @Column(name = "NombreEmpresa")
//    private String nombreempresa;
//    @Column(name = "Perfil")
//    private String perfil;
    @Column(name = "CedulaIdentificacion")
    private String CedulaIdentificacion;
    @Column(name = "FechaActualizacionCurriculum")
    @Temporal(TemporalType.TIMESTAMP)
     private Date fechaactualizacioncurriculum;
    public EmpresaPostulante() {
    }

    public String getApellido() {
        return apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaactualizacioncurriculum() {
        return fechaactualizacioncurriculum;
    }

    public void setFechaactualizacioncurriculum(Date fechaactualizacioncurriculum) {
        this.fechaactualizacioncurriculum = fechaactualizacioncurriculum;
    }

   
   
  

   
    

    public Integer getIdVacante() {
        return IdVacante;
    }

    public void setIdVacante(Integer IdVacante) {
        this.IdVacante = IdVacante;
    }

   

    public String getIdViewPostulante() {
        return IdViewPostulante;
    }

    public void setIdViewPostulante(String IdViewPostulante) {
        this.IdViewPostulante = IdViewPostulante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedulaIdentificacion() {
        return CedulaIdentificacion;
    }

    public void setCedulaIdentificacion(String CedulaIdentificacion) {
        this.CedulaIdentificacion = CedulaIdentificacion;
    }
    
    
}
