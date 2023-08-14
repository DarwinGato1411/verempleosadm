package com.ec.entidad;

import com.ec.entidad.CatEstado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(CatPais.class)
public class CatPais_ { 

    public static volatile CollectionAttribute<CatPais, CatEstado> catEstadoCollection;
    public static volatile SingularAttribute<CatPais, Integer> id;
    public static volatile SingularAttribute<CatPais, String> pais;

}