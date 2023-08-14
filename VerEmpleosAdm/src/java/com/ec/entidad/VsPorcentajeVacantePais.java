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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "porcentajevacantespais")
public class VsPorcentajeVacantePais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVacante")
    @Id
    private int idVacante;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "porcentaje")
    private Integer porcentaje;
    @Column(name = "pais")
    private String pais;

    public VsPorcentajeVacantePais() {
    }

    public int getIdUsuario() {
        return idVacante;
    }

    public void setIdUsuario(int idUsuario) {
        this.idVacante = idUsuario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
