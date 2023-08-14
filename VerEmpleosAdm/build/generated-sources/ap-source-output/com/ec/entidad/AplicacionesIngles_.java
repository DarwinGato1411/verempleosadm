package com.ec.entidad;

import com.ec.entidad.RespuestasIngles;
import com.ec.entidad.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(AplicacionesIngles.class)
public class AplicacionesIngles_ { 

    public static volatile SingularAttribute<AplicacionesIngles, Date> fecha;
    public static volatile SingularAttribute<AplicacionesIngles, Usuario> idCandidato;
    public static volatile CollectionAttribute<AplicacionesIngles, RespuestasIngles> respuestasInglesCollection;
    public static volatile SingularAttribute<AplicacionesIngles, Integer> id;
    public static volatile SingularAttribute<AplicacionesIngles, Integer> nivel;

}