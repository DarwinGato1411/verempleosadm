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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "MembresiaEmpresa")
@NamedQueries({
    @NamedQuery(name = "MembresiaEmpresa.findAll", query = "SELECT m FROM MembresiaEmpresa m")})
public class MembresiaEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaCompra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Comentarios")
    private String comentarios;
    @Column(name = "BusqCandIlimitada")
    private Boolean busqCandIlimitada;
    @Column(name = "NumBusqCand")
    private Integer numBusqCand;
    @Column(name = "VistasCV")
    private Integer vistasCV;
    @Column(name = "VacantesIlimitadas")
    private Boolean vacantesIlimitadas;
    @Column(name = "VacantesPublicadas")
    private Integer vacantesPublicadas;
    @Column(name = "NumVacantes")
    private Integer numVacantes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdTipoMembresia")
    private int idTipoMembresia;
    @JoinColumn(name = "IdEmpresa", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Empresa idEmpresa;

    public MembresiaEmpresa() {
    }

    public MembresiaEmpresa(Integer id) {
        this.id = id;
    }

    public MembresiaEmpresa(Integer id, Date fechaInicio, Date fechaCompra, Date fechaFin, String comentarios, int idTipoMembresia) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaCompra = fechaCompra;
        this.fechaFin = fechaFin;
        this.comentarios = comentarios;
        this.idTipoMembresia = idTipoMembresia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Boolean getBusqCandIlimitada() {
        return busqCandIlimitada;
    }

    public void setBusqCandIlimitada(Boolean busqCandIlimitada) {
        this.busqCandIlimitada = busqCandIlimitada;
    }

    public Integer getNumBusqCand() {
        return numBusqCand;
    }

    public void setNumBusqCand(Integer numBusqCand) {
        this.numBusqCand = numBusqCand;
    }

    public Integer getVistasCV() {
        return vistasCV;
    }

    public void setVistasCV(Integer vistasCV) {
        this.vistasCV = vistasCV;
    }

    public Boolean getVacantesIlimitadas() {
        return vacantesIlimitadas;
    }

    public void setVacantesIlimitadas(Boolean vacantesIlimitadas) {
        this.vacantesIlimitadas = vacantesIlimitadas;
    }

    public Integer getVacantesPublicadas() {
        return vacantesPublicadas;
    }

    public void setVacantesPublicadas(Integer vacantesPublicadas) {
        this.vacantesPublicadas = vacantesPublicadas;
    }

    public Integer getNumVacantes() {
        return numVacantes;
    }

    public void setNumVacantes(Integer numVacantes) {
        this.numVacantes = numVacantes;
    }

    public int getIdTipoMembresia() {
        return idTipoMembresia;
    }

    public void setIdTipoMembresia(int idTipoMembresia) {
        this.idTipoMembresia = idTipoMembresia;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
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
        if (!(object instanceof MembresiaEmpresa)) {
            return false;
        }
        MembresiaEmpresa other = (MembresiaEmpresa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.MembresiaEmpresa[ id=" + id + " ]";
    }

}
