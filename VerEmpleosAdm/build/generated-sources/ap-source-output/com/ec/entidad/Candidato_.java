package com.ec.entidad;

import com.ec.entidad.CandidatoConocimientoAdicional;
import com.ec.entidad.CandidatoIdioma;
import com.ec.entidad.CandidatoLicencia;
import com.ec.entidad.CandidatoPrograma;
import com.ec.entidad.CandidatoTitulo;
import com.ec.entidad.CandidatoVacante;
import com.ec.entidad.Configuracion;
import com.ec.entidad.ExperienciaLaboral;
import com.ec.entidad.PreferenciaArea;
import com.ec.entidad.PreferenciaHorario;
import com.ec.entidad.PreferenciaPuesto;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(Candidato.class)
public class Candidato_ { 

    public static volatile SingularAttribute<Candidato, byte[]> fotografiaMiniatura;
    public static volatile CollectionAttribute<Candidato, ExperienciaLaboral> experienciaLaboralCollection;
    public static volatile CollectionAttribute<Candidato, PreferenciaPuesto> preferenciaPuestoCollection;
    public static volatile SingularAttribute<Candidato, Integer> nivelComputo;
    public static volatile CollectionAttribute<Candidato, CandidatoPrograma> candidatoProgramaCollection;
    public static volatile SingularAttribute<Candidato, Date> fechaNacimiento;
    public static volatile SingularAttribute<Candidato, Integer> idUsuario;
    public static volatile SingularAttribute<Candidato, Integer> idTipoMoneda;
    public static volatile SingularAttribute<Candidato, String> nombre;
    public static volatile SingularAttribute<Candidato, BigDecimal> salarioMinimo;
    public static volatile CollectionAttribute<Candidato, CandidatoLicencia> candidatoLicenciaCollection;
    public static volatile CollectionAttribute<Candidato, CandidatoTitulo> candidatoTituloCollection;
    public static volatile CollectionAttribute<Candidato, CandidatoConocimientoAdicional> candidatoConocimientoAdicionalCollection;
    public static volatile SingularAttribute<Candidato, Date> fechaCurriculum;
    public static volatile SingularAttribute<Candidato, String> apellido;
    public static volatile SingularAttribute<Candidato, Boolean> genero;
    public static volatile CollectionAttribute<Candidato, PreferenciaArea> preferenciaAreaCollection;
    public static volatile SingularAttribute<Candidato, String> referido;
    public static volatile SingularAttribute<Candidato, Date> fechaActualizacionCurriculum;
    public static volatile SingularAttribute<Candidato, String> apellido2;
    public static volatile CollectionAttribute<Candidato, Configuracion> configuracionCollection;
    public static volatile SingularAttribute<Candidato, Boolean> edoCurriculum;
    public static volatile SingularAttribute<Candidato, Integer> estadoCivil;
    public static volatile SingularAttribute<Candidato, Boolean> vehiculo;
    public static volatile SingularAttribute<Candidato, BigDecimal> salarioMaximo;
    public static volatile SingularAttribute<Candidato, Integer> idTitulo;
    public static volatile CollectionAttribute<Candidato, CandidatoVacante> candidatoVacanteCollection;
    public static volatile SingularAttribute<Candidato, String> fotografia;
    public static volatile SingularAttribute<Candidato, String> telefonoFijo;
    public static volatile SingularAttribute<Candidato, String> perfil;
    public static volatile SingularAttribute<Candidato, String> telefonoCelular;
    public static volatile SingularAttribute<Candidato, String> cedulaIdentificacion;
    public static volatile SingularAttribute<Candidato, Boolean> licencia;
    public static volatile SingularAttribute<Candidato, Boolean> pasaporte;
    public static volatile SingularAttribute<Candidato, Boolean> visa;
    public static volatile CollectionAttribute<Candidato, PreferenciaHorario> preferenciaHorarioCollection;
    public static volatile CollectionAttribute<Candidato, CandidatoIdioma> candidatoIdiomaCollection;

}