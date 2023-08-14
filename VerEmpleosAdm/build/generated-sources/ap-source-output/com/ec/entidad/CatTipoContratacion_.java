package com.ec.entidad;

import com.ec.entidad.PreferenciaHorario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(CatTipoContratacion.class)
public class CatTipoContratacion_ { 

    public static volatile SingularAttribute<CatTipoContratacion, String> jornada;
    public static volatile SingularAttribute<CatTipoContratacion, Integer> id;
    public static volatile CollectionAttribute<CatTipoContratacion, PreferenciaHorario> preferenciaHorarioCollection;

}