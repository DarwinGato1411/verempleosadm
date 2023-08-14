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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "configuracion")
@NamedQueries({
    @NamedQuery(name = "Configuracion.findAll", query = "SELECT c FROM Configuracion c")})
public class Configuracion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VerReferencia")
    private boolean verReferencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CorreoInformativo")
    private boolean correoInformativo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstadoCurriculum")
    private boolean estadoCurriculum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VerPruebaPsicometrica")
    private boolean verPruebaPsicometrica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VerEntrevistaOnLine")
    private boolean verEntrevistaOnLine;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VerPruebaCompetencia")
    private boolean verPruebaCompetencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VerPruebaIngles")
    private boolean verPruebaIngles;
    @JoinColumn(name = "IdCandidato", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Candidato idCandidato;

    public Configuracion() {
    }

    public Configuracion(Integer id) {
        this.id = id;
    }

    public Configuracion(Integer id, boolean verReferencia, boolean correoInformativo, boolean estadoCurriculum, boolean verPruebaPsicometrica, boolean verEntrevistaOnLine, boolean verPruebaCompetencia, boolean verPruebaIngles) {
        this.id = id;
        this.verReferencia = verReferencia;
        this.correoInformativo = correoInformativo;
        this.estadoCurriculum = estadoCurriculum;
        this.verPruebaPsicometrica = verPruebaPsicometrica;
        this.verEntrevistaOnLine = verEntrevistaOnLine;
        this.verPruebaCompetencia = verPruebaCompetencia;
        this.verPruebaIngles = verPruebaIngles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getVerReferencia() {
        return verReferencia;
    }

    public void setVerReferencia(boolean verReferencia) {
        this.verReferencia = verReferencia;
    }

    public boolean getCorreoInformativo() {
        return correoInformativo;
    }

    public void setCorreoInformativo(boolean correoInformativo) {
        this.correoInformativo = correoInformativo;
    }

    public boolean getEstadoCurriculum() {
        return estadoCurriculum;
    }

    public void setEstadoCurriculum(boolean estadoCurriculum) {
        this.estadoCurriculum = estadoCurriculum;
    }

    public boolean getVerPruebaPsicometrica() {
        return verPruebaPsicometrica;
    }

    public void setVerPruebaPsicometrica(boolean verPruebaPsicometrica) {
        this.verPruebaPsicometrica = verPruebaPsicometrica;
    }

    public boolean getVerEntrevistaOnLine() {
        return verEntrevistaOnLine;
    }

    public void setVerEntrevistaOnLine(boolean verEntrevistaOnLine) {
        this.verEntrevistaOnLine = verEntrevistaOnLine;
    }

    public boolean getVerPruebaCompetencia() {
        return verPruebaCompetencia;
    }

    public void setVerPruebaCompetencia(boolean verPruebaCompetencia) {
        this.verPruebaCompetencia = verPruebaCompetencia;
    }

    public boolean getVerPruebaIngles() {
        return verPruebaIngles;
    }

    public void setVerPruebaIngles(boolean verPruebaIngles) {
        this.verPruebaIngles = verPruebaIngles;
    }

    public Candidato getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Candidato idCandidato) {
        this.idCandidato = idCandidato;
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
        if (!(object instanceof Configuracion)) {
            return false;
        }
        Configuracion other = (Configuracion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.Configuracion[ id=" + id + " ]";
    }
    
}
