package com.ec.entidad;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(Preferencia.class)
public class Preferencia_ { 

    public static volatile SingularAttribute<Preferencia, Integer> idPreferencia;
    public static volatile SingularAttribute<Preferencia, BigDecimal> salarioDolar;
    public static volatile SingularAttribute<Preferencia, Boolean> otroPais;
    public static volatile SingularAttribute<Preferencia, Boolean> otraCiudad;
    public static volatile SingularAttribute<Preferencia, Integer> idCandidato;
    public static volatile SingularAttribute<Preferencia, Boolean> dispuestoViajar;
    public static volatile SingularAttribute<Preferencia, String> habilidad;
    public static volatile SingularAttribute<Preferencia, String> comentario;

}