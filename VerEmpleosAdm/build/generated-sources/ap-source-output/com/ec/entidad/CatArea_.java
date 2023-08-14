package com.ec.entidad;

import com.ec.entidad.CatSubArea;
import com.ec.entidad.ExperienciaLaboral;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(CatArea.class)
public class CatArea_ { 

    public static volatile SingularAttribute<CatArea, String> area;
    public static volatile CollectionAttribute<CatArea, ExperienciaLaboral> experienciaLaboralCollection;
    public static volatile SingularAttribute<CatArea, Integer> id;
    public static volatile CollectionAttribute<CatArea, CatSubArea> catSubAreaCollection;

}