package com.ec.entidad;

import com.ec.entidad.Opcion;
import com.ec.entidad.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(Perfil.class)
public class Perfil_ { 

    public static volatile SingularAttribute<Perfil, String> perfDescripcion;
    public static volatile SingularAttribute<Perfil, String> perfSigla;
    public static volatile SingularAttribute<Perfil, Boolean> perfEstado;
    public static volatile SingularAttribute<Perfil, Integer> idPerfil;
    public static volatile CollectionAttribute<Perfil, Opcion> opcionCollection;
    public static volatile CollectionAttribute<Perfil, Usuario> usuarioCollection;

}