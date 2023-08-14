package com.ec.entidad;

import com.ec.entidad.CandidatoPrograma;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(Programa.class)
public class Programa_ { 

    public static volatile SingularAttribute<Programa, Integer> idPrograma;
    public static volatile CollectionAttribute<Programa, CandidatoPrograma> candidatoProgramaCollection;
    public static volatile SingularAttribute<Programa, String> nombrePrograma;

}