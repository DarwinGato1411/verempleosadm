package com.ec.entidad;

import com.ec.entidad.Candidato;
import com.ec.entidad.CatArea;
import com.ec.entidad.CatGiroEmpresa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(ExperienciaLaboral.class)
public class ExperienciaLaboral_ { 

    public static volatile SingularAttribute<ExperienciaLaboral, Integer> idExperienciaLaboral;
    public static volatile SingularAttribute<ExperienciaLaboral, String> logro;
    public static volatile SingularAttribute<ExperienciaLaboral, CatArea> idArea;
    public static volatile SingularAttribute<ExperienciaLaboral, String> jefe;
    public static volatile SingularAttribute<ExperienciaLaboral, String> puestoDesempeniado;
    public static volatile SingularAttribute<ExperienciaLaboral, String> telefonoEmpresa;
    public static volatile SingularAttribute<ExperienciaLaboral, String> nombreEmpresa;
    public static volatile SingularAttribute<ExperienciaLaboral, Candidato> idCandidato;
    public static volatile SingularAttribute<ExperienciaLaboral, CatGiroEmpresa> idGiro;
    public static volatile SingularAttribute<ExperienciaLaboral, String> razonSalida;
    public static volatile SingularAttribute<ExperienciaLaboral, Date> fechaSalida;
    public static volatile SingularAttribute<ExperienciaLaboral, Date> fechaEntrada;
    public static volatile SingularAttribute<ExperienciaLaboral, String> funcion;

}