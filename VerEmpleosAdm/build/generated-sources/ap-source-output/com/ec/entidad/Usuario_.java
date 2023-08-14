package com.ec.entidad;

import com.ec.entidad.AplicacionesIngles;
import com.ec.entidad.CatEstado;
import com.ec.entidad.Perfil;
import com.ec.entidad.TipoUsuario;
import com.ec.entidad.Ubicacion;
import com.ec.entidad.VsAplicacionIngles;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Boolean> tipo;
    public static volatile SingularAttribute<Usuario, String> usuTipo;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, TipoUsuario> idTipousuario;
    public static volatile CollectionAttribute<Usuario, AplicacionesIngles> aplicacionesInglesCollection;
    public static volatile SingularAttribute<Usuario, String> token;
    public static volatile CollectionAttribute<Usuario, VsAplicacionIngles> vsAplicacionInglesCollection;
    public static volatile SingularAttribute<Usuario, Boolean> edoConfirmacion;
    public static volatile SingularAttribute<Usuario, Perfil> idPerfil;
    public static volatile SingularAttribute<Usuario, CatEstado> idCatEstado;
    public static volatile CollectionAttribute<Usuario, Ubicacion> ubicacionCollection;
    public static volatile SingularAttribute<Usuario, String> contrasenia;
    public static volatile SingularAttribute<Usuario, Boolean> modAdministrativo;
    public static volatile SingularAttribute<Usuario, String> email;

}