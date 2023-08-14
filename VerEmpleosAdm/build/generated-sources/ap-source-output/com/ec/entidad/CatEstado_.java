package com.ec.entidad;

import com.ec.entidad.CatCiudad;
import com.ec.entidad.CatPais;
import com.ec.entidad.Ubicacion;
import com.ec.entidad.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(CatEstado.class)
public class CatEstado_ { 

    public static volatile SingularAttribute<CatEstado, String> estado;
    public static volatile SingularAttribute<CatEstado, CatPais> idPais;
    public static volatile CollectionAttribute<CatEstado, Usuario> catEstadoCollection;
    public static volatile CollectionAttribute<CatEstado, Ubicacion> ubicacionCollection;
    public static volatile SingularAttribute<CatEstado, Integer> id;
    public static volatile CollectionAttribute<CatEstado, CatCiudad> catCiudadCollection;

}