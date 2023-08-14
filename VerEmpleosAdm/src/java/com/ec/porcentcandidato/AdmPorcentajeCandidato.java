/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.porcentcandidato;

import com.ec.entidad.VsPorcentajeCandidato;
import com.ec.entidad.VsPorcentajeVacantePais;
import com.ec.seguridad.EnumSesion;
import com.ec.seguridad.UserCredential;
import com.ec.servicio.ServicioPorcentajeCandidatos;
import com.ec.servicio.ServicioPorcentajeVacantePais;
import java.util.ArrayList;
import java.util.List;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;

/**
 *
 * @author root
 */
public class AdmPorcentajeCandidato {

    ServicioPorcentajeCandidatos servicioPorcentajeCandidatos = new ServicioPorcentajeCandidatos();
    UserCredential credential = new UserCredential();
    private List<VsPorcentajeCandidato> listaDatos = new ArrayList<VsPorcentajeCandidato>();

//    para vacante 
    ServicioPorcentajeVacantePais servicioPorcentajeVacantePais = new ServicioPorcentajeVacantePais();
    private List<VsPorcentajeVacantePais> listaDatosVacante = new ArrayList<VsPorcentajeVacantePais>();
    private String buscar = "";
    private Integer totalcandidatos;
    private Integer totalvacantes;

    public AdmPorcentajeCandidato() {
        Session sess = Sessions.getCurrent();
        UserCredential cre = (UserCredential) sess.getAttribute(EnumSesion.userCredential.getNombre());
        credential = cre;
        buscar();

    }

    private void buscar() {

        listaDatos = servicioPorcentajeCandidatos.findALl();
        totalcandidatos = listaDatos.size();
        listaDatosVacante = servicioPorcentajeVacantePais.findALl();
        totalvacantes = listaDatosVacante.size();
    }

    public List<VsPorcentajeCandidato> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<VsPorcentajeCandidato> listaDatos) {
        this.listaDatos = listaDatos;
    }

    public List<VsPorcentajeVacantePais> getListaDatosVacante() {
        return listaDatosVacante;
    }

    public void setListaDatosVacante(List<VsPorcentajeVacantePais> listaDatosVacante) {
        this.listaDatosVacante = listaDatosVacante;
    }

    public Integer getTotalcandidatos() {
        return totalcandidatos;
    }

    public void setTotalcandidatos(Integer totalcandidatos) {
        this.totalcandidatos = totalcandidatos;
    }

    public Integer getTotalvacantes() {
        return totalvacantes;
    }

    public void setTotalvacantes(Integer totalvacantes) {
        this.totalvacantes = totalvacantes;
    }

}
