package com.ec.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(AppFavorito.class)
public class AppFavorito_ { 

    public static volatile SingularAttribute<AppFavorito, String> puesto;
    public static volatile SingularAttribute<AppFavorito, Integer> idEstado;
    public static volatile SingularAttribute<AppFavorito, Integer> idCandidato;
    public static volatile SingularAttribute<AppFavorito, Integer> idPais;
    public static volatile SingularAttribute<AppFavorito, Integer> idArea;
    public static volatile SingularAttribute<AppFavorito, Integer> idFavorito;
    public static volatile SingularAttribute<AppFavorito, Date> fechaCreacion;
    public static volatile SingularAttribute<AppFavorito, Integer> publicadaDesde;
    public static volatile SingularAttribute<AppFavorito, String> nombre;
    public static volatile SingularAttribute<AppFavorito, Boolean> recibirNotificacion;

}