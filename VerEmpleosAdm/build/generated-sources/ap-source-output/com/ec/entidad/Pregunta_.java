package com.ec.entidad;

import com.ec.entidad.ReferenciaPregunta;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(Pregunta.class)
public class Pregunta_ { 

    public static volatile CollectionAttribute<Pregunta, ReferenciaPregunta> referenciaPreguntaCollection;
    public static volatile SingularAttribute<Pregunta, Integer> idPregunta;
    public static volatile SingularAttribute<Pregunta, String> pregunta;

}