package com.ec.entidad;

import com.ec.entidad.Candidato;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(CandidatoVacante.class)
public class CandidatoVacante_ { 

    public static volatile SingularAttribute<CandidatoVacante, String> experienciaPuestoSimilar;
    public static volatile SingularAttribute<CandidatoVacante, Candidato> idCandidato;
    public static volatile SingularAttribute<CandidatoVacante, String> fechaPosibleIncorporacion;
    public static volatile SingularAttribute<CandidatoVacante, Date> fechaAplicacion;
    public static volatile SingularAttribute<CandidatoVacante, Integer> id;
    public static volatile SingularAttribute<CandidatoVacante, String> expectativaSalarial;
    public static volatile SingularAttribute<CandidatoVacante, Integer> idVacante;

}