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
import javax.validation.constraints.Size;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "CandidatoConocimientoAdicional")
@NamedQueries({
    @NamedQuery(name = "CandidatoConocimientoAdicional.findAll", query = "SELECT c FROM CandidatoConocimientoAdicional c")})
public class CandidatoConocimientoAdicional implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Conocimiento")
    private String conocimiento;
    @Size(max = 500)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdNivel")
    private int idNivel;
    @JoinColumn(name = "IdUsuario", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Candidato idUsuario;

    public CandidatoConocimientoAdicional() {
    }

    public CandidatoConocimientoAdicional(Integer id) {
        this.id = id;
    }

    public CandidatoConocimientoAdicional(Integer id, String conocimiento, int idNivel) {
        this.id = id;
        this.conocimiento = conocimiento;
        this.idNivel = idNivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(String conocimiento) {
        this.conocimiento = conocimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public Candidato getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Candidato idUsuario) {
        this.idUsuario = idUsuario;
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
        if (!(object instanceof CandidatoConocimientoAdicional)) {
            return false;
        }
        CandidatoConocimientoAdicional other = (CandidatoConocimientoAdicional) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.CandidatoConocimientoAdicional[ id=" + id + " ]";
    }
    
}
