package com.ec.entidad;

import com.ec.entidad.CatGiroEmpresa;
import com.ec.entidad.MembresiaEmpresa;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile SingularAttribute<Empresa, String> descripcion;
    public static volatile SingularAttribute<Empresa, String> telefonoSecundario;
    public static volatile SingularAttribute<Empresa, String> paginaweb;
    public static volatile SingularAttribute<Empresa, String> emailEmpresa;
    public static volatile SingularAttribute<Empresa, Integer> idPais;
    public static volatile SingularAttribute<Empresa, String> telefonoPrimario;
    public static volatile SingularAttribute<Empresa, String> empLinkedIn;
    public static volatile SingularAttribute<Empresa, Integer> idUsuario;
    public static volatile CollectionAttribute<Empresa, MembresiaEmpresa> membresiaEmpresaCollection;
    public static volatile SingularAttribute<Empresa, Integer> empTipoStand;
    public static volatile SingularAttribute<Empresa, String> nombreEmpresa;
    public static volatile SingularAttribute<Empresa, String> razonSocial;
    public static volatile SingularAttribute<Empresa, String> productoServicio;
    public static volatile SingularAttribute<Empresa, CatGiroEmpresa> idGiro;
    public static volatile SingularAttribute<Empresa, String> logoFeria;
    public static volatile SingularAttribute<Empresa, byte[]> logo;
    public static volatile SingularAttribute<Empresa, String> referido;
    public static volatile SingularAttribute<Empresa, String> videoFeria;
    public static volatile SingularAttribute<Empresa, String> fax;
    public static volatile SingularAttribute<Empresa, String> nombreEncargado;
    public static volatile SingularAttribute<Empresa, Integer> idGeolocalizacion;
    public static volatile SingularAttribute<Empresa, String> codigoPostal;
    public static volatile SingularAttribute<Empresa, String> empWhatsapp;
    public static volatile SingularAttribute<Empresa, String> apellidoEncargado;
    public static volatile SingularAttribute<Empresa, String> direccion;
    public static volatile SingularAttribute<Empresa, Boolean> empParticipaFeria;
    public static volatile SingularAttribute<Empresa, String> rfc;
    public static volatile SingularAttribute<Empresa, byte[]> logoMiniatura;
    public static volatile SingularAttribute<Empresa, Integer> idEstado;
    public static volatile SingularAttribute<Empresa, String> ciudad;
    public static volatile SingularAttribute<Empresa, Integer> cantidadEmpleado;

}