package com.ec.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(PruebaCandidato.class)
public class PruebaCandidato_ { 

    public static volatile SingularAttribute<PruebaCandidato, Boolean> estatus;
    public static volatile SingularAttribute<PruebaCandidato, Integer> idPrueba;
    public static volatile SingularAttribute<PruebaCandidato, Date> fechaAplicacion;
    public static volatile SingularAttribute<PruebaCandidato, Integer> id;
    public static volatile SingularAttribute<PruebaCandidato, Integer> idHistorialEnvioPrue;

}