package com.ec.entidad;

import com.ec.entidad.PreferenciaPuesto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(Puesto.class)
public class Puesto_ { 

    public static volatile SingularAttribute<Puesto, String> puesto;
    public static volatile CollectionAttribute<Puesto, PreferenciaPuesto> preferenciaPuestoCollection;
    public static volatile SingularAttribute<Puesto, Integer> idPuesto;

}