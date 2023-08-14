package com.ec.entidad;

import com.ec.entidad.CandidatoIdioma;
import com.ec.entidad.VacanteIdioma;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(CatIdioma.class)
public class CatIdioma_ { 

    public static volatile CollectionAttribute<CatIdioma, VacanteIdioma> vacanteIdiomaCollection;
    public static volatile SingularAttribute<CatIdioma, String> idioma;
    public static volatile SingularAttribute<CatIdioma, Integer> id;
    public static volatile CollectionAttribute<CatIdioma, CandidatoIdioma> candidatoIdiomaCollection;

}