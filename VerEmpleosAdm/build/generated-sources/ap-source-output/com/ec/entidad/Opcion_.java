package com.ec.entidad;

import com.ec.entidad.Perfil;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(Opcion.class)
public class Opcion_ { 

    public static volatile SingularAttribute<Opcion, Integer> idOpcion;
    public static volatile SingularAttribute<Opcion, Boolean> opcActualiza;
    public static volatile SingularAttribute<Opcion, Boolean> opcConsulta;
    public static volatile SingularAttribute<Opcion, Perfil> idPerfil;
    public static volatile SingularAttribute<Opcion, String> opcMenu;
    public static volatile SingularAttribute<Opcion, Boolean> opcInserta;
    public static volatile SingularAttribute<Opcion, Boolean> opcElimina;

}