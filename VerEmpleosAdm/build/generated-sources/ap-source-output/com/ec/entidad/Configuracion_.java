package com.ec.entidad;

import com.ec.entidad.Candidato;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(Configuracion.class)
public class Configuracion_ { 

    public static volatile SingularAttribute<Configuracion, Boolean> correoInformativo;
    public static volatile SingularAttribute<Configuracion, Boolean> estadoCurriculum;
    public static volatile SingularAttribute<Configuracion, Candidato> idCandidato;
    public static volatile SingularAttribute<Configuracion, Boolean> verReferencia;
    public static volatile SingularAttribute<Configuracion, Boolean> verPruebaIngles;
    public static volatile SingularAttribute<Configuracion, Boolean> verEntrevistaOnLine;
    public static volatile SingularAttribute<Configuracion, Boolean> verPruebaCompetencia;
    public static volatile SingularAttribute<Configuracion, Integer> id;
    public static volatile SingularAttribute<Configuracion, Boolean> verPruebaPsicometrica;

}