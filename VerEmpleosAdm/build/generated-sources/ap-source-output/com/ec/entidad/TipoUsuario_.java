package com.ec.entidad;

import com.ec.entidad.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(TipoUsuario.class)
public class TipoUsuario_ { 

    public static volatile SingularAttribute<TipoUsuario, Integer> idTipousuario;
    public static volatile CollectionAttribute<TipoUsuario, Usuario> usuarioCollection;
    public static volatile SingularAttribute<TipoUsuario, String> tipuDescripcion;
    public static volatile SingularAttribute<TipoUsuario, String> tipuSigla;
    public static volatile SingularAttribute<TipoUsuario, Boolean> tipuEstado;

}