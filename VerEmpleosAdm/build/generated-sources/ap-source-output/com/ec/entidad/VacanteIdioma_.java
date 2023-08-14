package com.ec.entidad;

import com.ec.entidad.CatIdioma;
import com.ec.entidad.VacanteNivelIdioma;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(VacanteIdioma.class)
public class VacanteIdioma_ { 

    public static volatile SingularAttribute<VacanteIdioma, Integer> id;
    public static volatile SingularAttribute<VacanteIdioma, VacanteNivelIdioma> idVacanteNivelIdioma;
    public static volatile SingularAttribute<VacanteIdioma, CatIdioma> idIdioma;

}