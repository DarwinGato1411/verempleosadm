package com.ec.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(VsCandidatoReporte.class)
public class VsCandidatoReporte_ { 

    public static volatile SingularAttribute<VsCandidatoReporte, Integer> idCandidato;
    public static volatile SingularAttribute<VsCandidatoReporte, Date> fechaNacimiento;
    public static volatile SingularAttribute<VsCandidatoReporte, Boolean> genero;
    public static volatile SingularAttribute<VsCandidatoReporte, Integer> estadoCivil;
    public static volatile SingularAttribute<VsCandidatoReporte, String> nombre;
    public static volatile SingularAttribute<VsCandidatoReporte, String> tituloObtenido;

}