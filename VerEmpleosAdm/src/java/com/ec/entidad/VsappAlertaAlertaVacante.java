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
@Table(name = "vs_app_AlertaAlertaVacante")
@NamedQueries({
    @NamedQuery(name = "VsappAlertaAlertaVacante.findAll", query = "SELECT v FROM VsappAlertaAlertaVacante v")})
public class VsappAlertaAlertaVacante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdAlerta")
    @Id
    private int idAlerta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NoLeidos")
    private int noLeidos;
    @Column(name = "FechaAlertaCandidato")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlertaCandidato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdEmpresa")
    private int idEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCandidato")
    private int idCandidato;
    @Column(name = "IdVacante")
    private Integer idVacante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estatus")
    private boolean estatus;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NombreEmpresa")
    private String nombreEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "Puesto")
    private String puesto;

    public VsappAlertaAlertaVacante() {
    }

    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public int getNoLeidos() {
        return noLeidos;
    }

    public void setNoLeidos(int noLeidos) {
        this.noLeidos = noLeidos;
    }

    public Date getFechaAlertaCandidato() {
        return fechaAlertaCandidato;
    }

    public void setFechaAlertaCandidato(Date fechaAlertaCandidato) {
        this.fechaAlertaCandidato = fechaAlertaCandidato;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public Integer getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(Integer idVacante) {
        this.idVacante = idVacante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
}
