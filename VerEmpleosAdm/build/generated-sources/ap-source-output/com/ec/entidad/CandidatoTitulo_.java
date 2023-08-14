package com.ec.entidad;

import com.ec.entidad.Candidato;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(CandidatoTitulo.class)
public class CandidatoTitulo_ { 

    public static volatile SingularAttribute<CandidatoTitulo, Integer> idCandidatoTitulo;
    public static volatile SingularAttribute<CandidatoTitulo, Candidato> idCandidato;
    public static volatile SingularAttribute<CandidatoTitulo, Date> fechaInicio;
    public static volatile SingularAttribute<CandidatoTitulo, String> institucion;
    public static volatile SingularAttribute<CandidatoTitulo, String> tituloObtenido;
    public static volatile SingularAttribute<CandidatoTitulo, Date> fechaFin;

}