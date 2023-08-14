package com.ec.entidad;

import com.ec.entidad.CatEstado;
import com.ec.entidad.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(Ubicacion.class)
public class Ubicacion_ { 

    public static volatile SingularAttribute<Ubicacion, CatEstado> idEstado;
    public static volatile SingularAttribute<Ubicacion, String> codigoPostal;
    public static volatile SingularAttribute<Ubicacion, String> ciudad;
    public static volatile SingularAttribute<Ubicacion, Usuario> idUsuario;
    public static volatile SingularAttribute<Ubicacion, String> direccion;
    public static volatile SingularAttribute<Ubicacion, Integer> idUbicacion;

}