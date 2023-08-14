package com.ec.entidad;

import com.ec.entidad.Empresa;
import com.ec.entidad.ExperienciaLaboral;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(CatGiroEmpresa.class)
public class CatGiroEmpresa_ { 

    public static volatile CollectionAttribute<CatGiroEmpresa, ExperienciaLaboral> experienciaLaboralCollection;
    public static volatile CollectionAttribute<CatGiroEmpresa, Empresa> empresaCollection;
    public static volatile SingularAttribute<CatGiroEmpresa, Integer> id;
    public static volatile SingularAttribute<CatGiroEmpresa, String> giro;

}