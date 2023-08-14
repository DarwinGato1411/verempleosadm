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
@Table(name = "vs_CandidatoProgramaAreaInformatica")
@NamedQueries({
    @NamedQuery(name = "VsCandidatoProgramaAreaInformatica.findAll", query = "SELECT v FROM VsCandidatoProgramaAreaInformatica v")})
public class VsCandidatoProgramaAreaInformatica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCandidato")
    private int idCandidato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdAreaInformatica")
    @Id
    private int idAreaInformatica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Area")
    private String area;
    @Column(name = "IdSubAreaInformatica")
    private Integer idSubAreaInformatica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "SubAreaInformatica")
    private String subAreaInformatica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdNivel")
    private int idNivel;

    public VsCandidatoProgramaAreaInformatica() {
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public int getIdAreaInformatica() {
        return idAreaInformatica;
    }

    public void setIdAreaInformatica(int idAreaInformatica) {
        this.idAreaInformatica = idAreaInformatica;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getIdSubAreaInformatica() {
        return idSubAreaInformatica;
    }

    public void setIdSubAreaInformatica(Integer idSubAreaInformatica) {
        this.idSubAreaInformatica = idSubAreaInformatica;
    }

    public String getSubAreaInformatica() {
        return subAreaInformatica;
    }

    public void setSubAreaInformatica(String subAreaInformatica) {
        this.subAreaInformatica = subAreaInformatica;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }
    
}
