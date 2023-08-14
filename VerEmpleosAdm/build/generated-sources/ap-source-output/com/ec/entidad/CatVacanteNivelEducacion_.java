package com.ec.entidad;

import com.ec.entidad.VacanteEducacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(CatVacanteNivelEducacion.class)
public class CatVacanteNivelEducacion_ { 

    public static volatile SingularAttribute<CatVacanteNivelEducacion, String> eduNivel;
    public static volatile SingularAttribute<CatVacanteNivelEducacion, Integer> id;
    public static volatile CollectionAttribute<CatVacanteNivelEducacion, VacanteEducacion> vacanteEducacionCollection;

}