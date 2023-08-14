package com.ec.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(EmpresaPostulante.class)
public class EmpresaPostulante_ { 

    public static volatile SingularAttribute<EmpresaPostulante, String> puesto;
    public static volatile SingularAttribute<EmpresaPostulante, Integer> IdVacante;
    public static volatile SingularAttribute<EmpresaPostulante, String> IdViewPostulante;
    public static volatile SingularAttribute<EmpresaPostulante, String> apellido;
    public static volatile SingularAttribute<EmpresaPostulante, String> CedulaIdentificacion;
    public static volatile SingularAttribute<EmpresaPostulante, String> nombre;
    public static volatile SingularAttribute<EmpresaPostulante, String> email;
    public static volatile SingularAttribute<EmpresaPostulante, Date> fechaactualizacioncurriculum;

}