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
@Table(name = "opcion")
@NamedQueries({
    @NamedQuery(name = "Opcion.findAll", query = "SELECT o FROM Opcion o")})
public class Opcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_opcion")
    private Integer idOpcion;
    @Size(max = 200)
    @Column(name = "opc_menu")
    private String opcMenu;
    @Column(name = "opc_inserta")
    private Boolean opcInserta;
    @Column(name = "opc_actualiza")
    private Boolean opcActualiza;
    @Column(name = "opc_elimina")
    private Boolean opcElimina;
    @Column(name = "opc_consulta")
    private Boolean opcConsulta;
    @JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil")
    @ManyToOne
    private Perfil idPerfil;

    public Opcion() {
    }

    public Opcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    public Integer getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    public String getOpcMenu() {
        return opcMenu;
    }

    public void setOpcMenu(String opcMenu) {
        this.opcMenu = opcMenu;
    }

    public Boolean getOpcInserta() {
        return opcInserta;
    }

    public void setOpcInserta(Boolean opcInserta) {
        this.opcInserta = opcInserta;
    }

    public Boolean getOpcActualiza() {
        return opcActualiza;
    }

    public void setOpcActualiza(Boolean opcActualiza) {
        this.opcActualiza = opcActualiza;
    }

    public Boolean getOpcElimina() {
        return opcElimina;
    }

    public void setOpcElimina(Boolean opcElimina) {
        this.opcElimina = opcElimina;
    }

    public Boolean getOpcConsulta() {
        return opcConsulta;
    }

    public void setOpcConsulta(Boolean opcConsulta) {
        this.opcConsulta = opcConsulta;
    }

    public Perfil getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Perfil idPerfil) {
        this.idPerfil = idPerfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOpcion != null ? idOpcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Opcion)) {
            return false;
        }
        Opcion other = (Opcion) object;
        if ((this.idOpcion == null && other.idOpcion != null) || (this.idOpcion != null && !this.idOpcion.equals(other.idOpcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.Opcion[ idOpcion=" + idOpcion + " ]";
    }
    
}
