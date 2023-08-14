package com.ec.entidad;

import com.ec.entidad.Pregunta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(ReferenciaPregunta.class)
public class ReferenciaPregunta_ { 

    public static volatile SingularAttribute<ReferenciaPregunta, String> respuesta;
    public static volatile SingularAttribute<ReferenciaPregunta, Integer> id;
    public static volatile SingularAttribute<ReferenciaPregunta, Integer> idReferencia;
    public static volatile SingularAttribute<ReferenciaPregunta, Pregunta> idPregunta;

}