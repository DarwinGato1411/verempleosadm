/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * @author Darwin
 */
@Entity
@Table(name = "empresas_feria")
public class EmpresasFeria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdVacante")
    private int idVacante;
   
    @Size(min = 1, max = 60)
    @Column(name = "Puesto")
    private String puesto;
    //@Basic(optional = false)
    //@NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "DescripcionPuesto")
    private String descripcionPuesto;
    
    @Size(min = 1, max = 500)
    @Column(name = "DireccionDeTrabajo")
    private String direccionDeTrabajo;   
    @Size(min = 1, max = 100)
    @Column(name = "Pais")
    private String pais;

    public EmpresasFeria() {
    }

   

    public EmpresasFeria(int idUsuario, String puesto, String descripcionPuesto, String palabrasClave, String direccionDeTrabajo, boolean mostrarDireccion, boolean recibirCVEnPanel, int idArea, int idSubArea, int idPais, int idEstado, String reqExperienciaMinima, String reqEdadMinima, String reqEdadMaxima, int reqTipoEdad, int reqGenero, BigDecimal reqSalarioMinimo, BigDecimal reqSalarioMaximo, int reqSalarioTipoPago, int reqSalarioFormaPago, boolean reqMostrarEnAviso, boolean reqSolicitarSalarioPostulante, String reqTecnologia, Date fechaPublicacion, boolean notRecibirTodo, boolean notRecibirResumen, boolean notPrimerPostulante, boolean notDesactivarNotificaciones, int tipoPuesto, int idIdioma, int idNivelIdioma, int idEducacion, int idEstatusEducacion, boolean activa, int vistas, int actividad, String pais) {
      
        this.puesto = puesto;
        this.descripcionPuesto = descripcionPuesto;
      
        this.direccionDeTrabajo = direccionDeTrabajo;
      
        this.pais = pais;
    }

    public int getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(int idVacante) {
        this.idVacante = idVacante;
    }


    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcionPuesto() {
        return descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
    }

  

    public String getDireccionDeTrabajo() {
        return direccionDeTrabajo;
    }

    public void setDireccionDeTrabajo(String direccionDeTrabajo) {
        this.direccionDeTrabajo = direccionDeTrabajo;
    }

   
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

   
    
    @Override
    public String toString() {
        return "com.ec.entidad.EmpresasFeria[ idUsuario=" + idVacante + " ]";
    }

}
