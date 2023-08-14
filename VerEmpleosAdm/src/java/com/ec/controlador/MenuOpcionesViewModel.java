/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.controlador;

import com.ec.seguridad.EnumSesion;
import com.ec.seguridad.UserCredential;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Menuitem;

/**
 *
 * @author gato
 */
public class MenuOpcionesViewModel extends SelectorComposer<Component> {

    @Wire("#menuEmrpesa")
    Menuitem menuEmrpesa;
    @Wire("#menuEstadistica")
    Menuitem menuEstadistica;
    @Wire("#menuUsuario")
    Menuitem menuUsuario;

    UserCredential credential = new UserCredential();
    private String acceso = "";

    public MenuOpcionesViewModel() {
        Session sess = Sessions.getCurrent();
        UserCredential cre = (UserCredential) sess.getAttribute(EnumSesion.userCredential.getNombre());
        credential = cre;

    }

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        if (credential != null) {
//            if (credential.getUsuarioSistema() != null) {
//                if (credential.getUsuarioSistema().getIdTipousuario().getTipuSigla().equals("SADM")) {
//
//                } else if (credential.getUsuarioSistema().getIdTipousuario().getTipuSigla().equals("ADMP")) {
//                    menuUsuario.setVisible(Boolean.FALSE);
//                }
//            }
        }
    }

    @Listen("onClick = #menuEmrpesa")
    public void menuEmrpesa() {
        Executions.sendRedirect("/empresa/admempresa.zul");
    }

    @Listen("onClick = #menuEstadistica")
    public void menuEstadistica() {
        Executions.sendRedirect("/estadistica/amdestadistica.zul");
    }

    @Listen("onClick = #menuUsuario")
    public void menuUsuario() {
        Executions.sendRedirect("/usuario/admusuario.zul");
    }

    @Listen("onClick = #menuUsuarioAbandonados")
    public void menuUsuarioAbandonados() {
        Executions.sendRedirect("/usuario/admusuarioaban.zul");
    }
    @Listen("onClick = #menuVacantesFeria")
    public void menuVacantesFeria() {
        Executions.sendRedirect("/feria/admferia.zul");
    }
    @Listen("onClick = #menuPorcentajePais")
    public void menuPorcentajePais() {
        Executions.sendRedirect("/porcencandidato/admporencandidato.zul");
    }
    @Listen("onClick = #menGiro")
    public void menGiro() {
        Executions.sendRedirect("/catalogo/catalogo.zul");
    }

}
