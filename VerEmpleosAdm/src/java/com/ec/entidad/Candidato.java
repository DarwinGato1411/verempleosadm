/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "candidato")
@NamedQueries({
    @NamedQuery(name = "Candidato.findAll", query = "SELECT c FROM Candidato c")})
public class Candidato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdUsuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "Apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CedulaIdentificacion")
    private String cedulaIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Pasaporte")
    private boolean pasaporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Genero")
    private boolean genero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstadoCivil")
    private int estadoCivil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TelefonoFijo")
    private String telefonoFijo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TelefonoCelular")
    private String telefonoCelular;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Licencia")
    private boolean licencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Vehiculo")
    private boolean vehiculo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NivelComputo")
    private int nivelComputo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "Referido")
    private String referido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaCurriculum")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCurriculum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EdoCurriculum")
    private boolean edoCurriculum;
    @Size(max = 2147483647)
    @Column(name = "Fotografia")
    private String fotografia;
    @Size(max = 2147483647)
    @Column(name = "Perfil")
    private String perfil;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SalarioMinimo")
    private BigDecimal salarioMinimo;
    @Column(name = "SalarioMaximo")
    private BigDecimal salarioMaximo;
    @Column(name = "FechaActualizacionCurriculum")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacionCurriculum;
    @Size(max = 70)
    @Column(name = "Apellido2")
    private String apellido2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdTipoMoneda")
    private int idTipoMoneda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Visa")
    private boolean visa;
    @Lob
    @Column(name = "FotografiaMiniatura")
    private byte[] fotografiaMiniatura;
    @Column(name = "IdTitulo")
    private Integer idTitulo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCandidato")
    private Collection<PreferenciaArea> preferenciaAreaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCandidato")
    private Collection<CandidatoTitulo> candidatoTituloCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCandidato")
    private Collection<CandidatoIdioma> candidatoIdiomaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCandidato")
    private Collection<CandidatoPrograma> candidatoProgramaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCandidato")
    private Collection<ExperienciaLaboral> experienciaLaboralCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCandidato")
    private Collection<PreferenciaHorario> preferenciaHorarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCandidato")
    private Collection<Configuracion> configuracionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCandidato")
    private Collection<PreferenciaPuesto> preferenciaPuestoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCandidato")
    private Collection<CandidatoVacante> candidatoVacanteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private Collection<CandidatoConocimientoAdicional> candidatoConocimientoAdicionalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCandidato")
    private Collection<CandidatoLicencia> candidatoLicenciaCollection;

    public Candidato() {
    }

    public Candidato(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Candidato(Integer idUsuario, String nombre, String apellido, String cedulaIdentificacion, boolean pasaporte, boolean genero, Date fechaNacimiento, int estadoCivil, String telefonoFijo, String telefonoCelular, boolean licencia, boolean vehiculo, int nivelComputo, String referido, Date fechaCurriculum, boolean edoCurriculum, int idTipoMoneda, boolean visa) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedulaIdentificacion = cedulaIdentificacion;
        this.pasaporte = pasaporte;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.licencia = licencia;
        this.vehiculo = vehiculo;
        this.nivelComputo = nivelComputo;
        this.referido = referido;
        this.fechaCurriculum = fechaCurriculum;
        this.edoCurriculum = edoCurriculum;
        this.idTipoMoneda = idTipoMoneda;
        this.visa = visa;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedulaIdentificacion() {
        return cedulaIdentificacion;
    }

    public void setCedulaIdentificacion(String cedulaIdentificacion) {
        this.cedulaIdentificacion = cedulaIdentificacion;
    }

    public boolean getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(boolean pasaporte) {
        this.pasaporte = pasaporte;
    }

    public boolean getGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public boolean getLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }

    public boolean getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(boolean vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNivelComputo() {
        return nivelComputo;
    }

    public void setNivelComputo(int nivelComputo) {
        this.nivelComputo = nivelComputo;
    }

    public String getReferido() {
        return referido;
    }

    public void setReferido(String referido) {
        this.referido = referido;
    }

    public Date getFechaCurriculum() {
        return fechaCurriculum;
    }

    public void setFechaCurriculum(Date fechaCurriculum) {
        this.fechaCurriculum = fechaCurriculum;
    }

    public boolean getEdoCurriculum() {
        return edoCurriculum;
    }

    public void setEdoCurriculum(boolean edoCurriculum) {
        this.edoCurriculum = edoCurriculum;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public BigDecimal getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(BigDecimal salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public BigDecimal getSalarioMaximo() {
        return salarioMaximo;
    }

    public void setSalarioMaximo(BigDecimal salarioMaximo) {
        this.salarioMaximo = salarioMaximo;
    }

    public Date getFechaActualizacionCurriculum() {
        return fechaActualizacionCurriculum;
    }

    public void setFechaActualizacionCurriculum(Date fechaActualizacionCurriculum) {
        this.fechaActualizacionCurriculum = fechaActualizacionCurriculum;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getIdTipoMoneda() {
        return idTipoMoneda;
    }

    public void setIdTipoMoneda(int idTipoMoneda) {
        this.idTipoMoneda = idTipoMoneda;
    }

    public boolean getVisa() {
        return visa;
    }

    public void setVisa(boolean visa) {
        this.visa = visa;
    }

    public byte[] getFotografiaMiniatura() {
        return fotografiaMiniatura;
    }

    public void setFotografiaMiniatura(byte[] fotografiaMiniatura) {
        this.fotografiaMiniatura = fotografiaMiniatura;
    }

    public Integer getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(Integer idTitulo) {
        this.idTitulo = idTitulo;
    }

    public Collection<PreferenciaArea> getPreferenciaAreaCollection() {
        return preferenciaAreaCollection;
    }

    public void setPreferenciaAreaCollection(Collection<PreferenciaArea> preferenciaAreaCollection) {
        this.preferenciaAreaCollection = preferenciaAreaCollection;
    }

    public Collection<CandidatoTitulo> getCandidatoTituloCollection() {
        return candidatoTituloCollection;
    }

    public void setCandidatoTituloCollection(Collection<CandidatoTitulo> candidatoTituloCollection) {
        this.candidatoTituloCollection = candidatoTituloCollection;
    }

    public Collection<CandidatoIdioma> getCandidatoIdiomaCollection() {
        return candidatoIdiomaCollection;
    }

    public void setCandidatoIdiomaCollection(Collection<CandidatoIdioma> candidatoIdiomaCollection) {
        this.candidatoIdiomaCollection = candidatoIdiomaCollection;
    }

    public Collection<CandidatoPrograma> getCandidatoProgramaCollection() {
        return candidatoProgramaCollection;
    }

    public void setCandidatoProgramaCollection(Collection<CandidatoPrograma> candidatoProgramaCollection) {
        this.candidatoProgramaCollection = candidatoProgramaCollection;
    }

    public Collection<ExperienciaLaboral> getExperienciaLaboralCollection() {
        return experienciaLaboralCollection;
    }

    public void setExperienciaLaboralCollection(Collection<ExperienciaLaboral> experienciaLaboralCollection) {
        this.experienciaLaboralCollection = experienciaLaboralCollection;
    }

    public Collection<PreferenciaHorario> getPreferenciaHorarioCollection() {
        return preferenciaHorarioCollection;
    }

    public void setPreferenciaHorarioCollection(Collection<PreferenciaHorario> preferenciaHorarioCollection) {
        this.preferenciaHorarioCollection = preferenciaHorarioCollection;
    }

    public Collection<Configuracion> getConfiguracionCollection() {
        return configuracionCollection;
    }

    public void setConfiguracionCollection(Collection<Configuracion> configuracionCollection) {
        this.configuracionCollection = configuracionCollection;
    }

    public Collection<PreferenciaPuesto> getPreferenciaPuestoCollection() {
        return preferenciaPuestoCollection;
    }

    public void setPreferenciaPuestoCollection(Collection<PreferenciaPuesto> preferenciaPuestoCollection) {
        this.preferenciaPuestoCollection = preferenciaPuestoCollection;
    }

    public Collection<CandidatoVacante> getCandidatoVacanteCollection() {
        return candidatoVacanteCollection;
    }

    public void setCandidatoVacanteCollection(Collection<CandidatoVacante> candidatoVacanteCollection) {
        this.candidatoVacanteCollection = candidatoVacanteCollection;
    }

    public Collection<CandidatoConocimientoAdicional> getCandidatoConocimientoAdicionalCollection() {
        return candidatoConocimientoAdicionalCollection;
    }

    public void setCandidatoConocimientoAdicionalCollection(Collection<CandidatoConocimientoAdicional> candidatoConocimientoAdicionalCollection) {
        this.candidatoConocimientoAdicionalCollection = candidatoConocimientoAdicionalCollection;
    }

    public Collection<CandidatoLicencia> getCandidatoLicenciaCollection() {
        return candidatoLicenciaCollection;
    }

    public void setCandidatoLicenciaCollection(Collection<CandidatoLicencia> candidatoLicenciaCollection) {
        this.candidatoLicenciaCollection = candidatoLicenciaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Candidato)) {
            return false;
        }
        Candidato other = (Candidato) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidad.Candidato[ idUsuario=" + idUsuario + " ]";
    }
    
}
