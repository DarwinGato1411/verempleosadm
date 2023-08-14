package com.ec.entidad;

import com.ec.entidad.Candidato;
import com.ec.entidad.Programa;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(CandidatoPrograma.class)
public class CandidatoPrograma_ { 

    public static volatile SingularAttribute<CandidatoPrograma, Integer> idCandidatoPrograma;
    public static volatile SingularAttribute<CandidatoPrograma, Candidato> idCandidato;
    public static volatile SingularAttribute<CandidatoPrograma, Integer> idSubAreaInformatica;
    public static volatile SingularAttribute<CandidatoPrograma, Programa> idNivel;

}