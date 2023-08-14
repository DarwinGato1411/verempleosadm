package com.ec.entidad;

import com.ec.entidad.Empresa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(MembresiaEmpresa.class)
public class MembresiaEmpresa_ { 

    public static volatile SingularAttribute<MembresiaEmpresa, Boolean> busqCandIlimitada;
    public static volatile SingularAttribute<MembresiaEmpresa, Date> fechaFin;
    public static volatile SingularAttribute<MembresiaEmpresa, Date> fechaCompra;
    public static volatile SingularAttribute<MembresiaEmpresa, Boolean> vacantesIlimitadas;
    public static volatile SingularAttribute<MembresiaEmpresa, Date> fechaInicio;
    public static volatile SingularAttribute<MembresiaEmpresa, Integer> numVacantes;
    public static volatile SingularAttribute<MembresiaEmpresa, Integer> vacantesPublicadas;
    public static volatile SingularAttribute<MembresiaEmpresa, Integer> idTipoMembresia;
    public static volatile SingularAttribute<MembresiaEmpresa, Empresa> idEmpresa;
    public static volatile SingularAttribute<MembresiaEmpresa, Integer> id;
    public static volatile SingularAttribute<MembresiaEmpresa, String> comentarios;
    public static volatile SingularAttribute<MembresiaEmpresa, Integer> numBusqCand;
    public static volatile SingularAttribute<MembresiaEmpresa, Integer> vistasCV;

}