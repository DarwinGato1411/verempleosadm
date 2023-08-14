package com.ec.entidad;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-14T06:04:40")
@StaticMetamodel(Vacante.class)
public class Vacante_ { 

    public static volatile SingularAttribute<Vacante, String> reqEdadMinima;
    public static volatile SingularAttribute<Vacante, Boolean> notRecibirTodo;
    public static volatile SingularAttribute<Vacante, String> reqExperienciaMinima;
    public static volatile SingularAttribute<Vacante, Integer> idArea;
    public static volatile SingularAttribute<Vacante, Integer> idSubArea;
    public static volatile SingularAttribute<Vacante, Integer> idPais;
    public static volatile SingularAttribute<Vacante, String> direccionDeTrabajo;
    public static volatile SingularAttribute<Vacante, Integer> idUsuario;
    public static volatile SingularAttribute<Vacante, Integer> reqGenero;
    public static volatile SingularAttribute<Vacante, Integer> idTipoMoneda;
    public static volatile SingularAttribute<Vacante, String> nombreImagen;
    public static volatile SingularAttribute<Vacante, Integer> actividad;
    public static volatile SingularAttribute<Vacante, Boolean> reqMostrarEnAviso;
    public static volatile SingularAttribute<Vacante, String> puesto;
    public static volatile SingularAttribute<Vacante, Boolean> mostrarDireccion;
    public static volatile SingularAttribute<Vacante, String> descripcionPuesto;
    public static volatile SingularAttribute<Vacante, Integer> tipoPuesto;
    public static volatile SingularAttribute<Vacante, BigDecimal> reqSalarioMaximo;
    public static volatile SingularAttribute<Vacante, Integer> idVacante;
    public static volatile SingularAttribute<Vacante, BigDecimal> reqSalarioMinimo;
    public static volatile SingularAttribute<Vacante, Integer> idIdioma;
    public static volatile SingularAttribute<Vacante, Boolean> notRecibirResumen;
    public static volatile SingularAttribute<Vacante, Integer> vistas;
    public static volatile SingularAttribute<Vacante, Integer> idGeolocalizacion;
    public static volatile SingularAttribute<Vacante, Boolean> notDesactivarNotificaciones;
    public static volatile SingularAttribute<Vacante, Boolean> recibirCVEnPanel;
    public static volatile SingularAttribute<Vacante, String> reqEdadMaxima;
    public static volatile SingularAttribute<Vacante, Integer> reqTipoEdad;
    public static volatile SingularAttribute<Vacante, String> pathImagen;
    public static volatile SingularAttribute<Vacante, String> reqTecnologia;
    public static volatile SingularAttribute<Vacante, Integer> idNivelIdioma;
    public static volatile SingularAttribute<Vacante, Integer> idEducacion;
    public static volatile SingularAttribute<Vacante, Boolean> activa;
    public static volatile SingularAttribute<Vacante, Integer> idEstado;
    public static volatile SingularAttribute<Vacante, Integer> reqSalarioTipoPago;
    public static volatile SingularAttribute<Vacante, Boolean> notPrimerPostulante;
    public static volatile SingularAttribute<Vacante, Integer> idEstatusEducacion;
    public static volatile SingularAttribute<Vacante, Date> fechaFinPublicacion;
    public static volatile SingularAttribute<Vacante, Integer> reqSalarioFormaPago;
    public static volatile SingularAttribute<Vacante, String> palabrasClave;
    public static volatile SingularAttribute<Vacante, Boolean> reqSolicitarSalarioPostulante;
    public static volatile SingularAttribute<Vacante, Date> fechaPublicacion;

}