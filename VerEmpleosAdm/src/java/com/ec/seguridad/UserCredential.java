/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.seguridad;

//import com.ec.entidad.Cliente;
//import com.ec.entidad.Usuario;
import com.ec.entidad.Usuario;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserCredential implements Serializable {

    private static final long serialVersionUID = 1L;
    String account;
    String name;
    String nombreUsuario;
    private Integer nivelUsuario;
     Usuario usuarioSistema;
    private Boolean administrador;
    private Boolean activaComercial = Boolean.FALSE;
    private Boolean activaBodega = Boolean.FALSE;
    private Boolean activaArea = Boolean.FALSE;
    private Boolean activaBusquedaSeguimiento = Boolean.FALSE;
    Set<String> roles = new HashSet<String>();

    public UserCredential(Usuario usuario, String account, String name, Integer nivelUsuario, String nombreUsuario) {
        this.usuarioSistema = usuario;
        this.name = name;
        this.account = account;
        this.nivelUsuario = nivelUsuario;
        this.nombreUsuario = nombreUsuario;
    }

    public UserCredential(Usuario usuario, String account, String name, Integer nivelUsuario, String nombreUsuario, Boolean administrador) {
        this.usuarioSistema = usuario;
        this.name = name;
        this.account = account;
        this.nivelUsuario = nivelUsuario;
        this.nombreUsuario = nombreUsuario;
        this.administrador = administrador;
    }

    public UserCredential() {
        this.account = "anonymous";
        this.name = "Anonymous";
        roles.add("anonymous");
    }

    public boolean isAnonymous() {
        return hasRole("anonymous") || "anonymous".equals(account);
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasRole(String role) {
        return roles.contains(role);
    }

    public void addRole(String role) {
        roles.add(role);
    }

    public Integer getNivelUsuario() {
        return nivelUsuario;
    }

    public void setNivelUsuario(Integer nivelUsuario) {
        this.nivelUsuario = nivelUsuario;
    }

    public Usuario getUsuarioSistema() {
        return usuarioSistema;
    }

    public void setUsuarioSistema(Usuario usuarioSistema) {
        this.usuarioSistema = usuarioSistema;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public Boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        
        this.administrador = administrador;
    }

    public Boolean getActivaComercial() {
        
        return activaComercial;
    }

    public void setActivaComercial(Boolean activaComercial) {
        this.activaComercial = activaComercial;
    }

    public Boolean getActivaBodega() {
        
        return activaBodega;
    }

    public void setActivaBodega(Boolean activaBodega) {
        this.activaBodega = activaBodega;
    }

    public Boolean getActivaArea() {
        
        return activaArea;
    }

    public void setActivaArea(Boolean activaArea) {
        this.activaArea = activaArea;
    }

    public Boolean getActivaBusquedaSeguimiento() {
        
        return activaBusquedaSeguimiento;
    }

    public void setActivaBusquedaSeguimiento(Boolean activaBusquedaSeguimiento) {
        this.activaBusquedaSeguimiento = activaBusquedaSeguimiento;
    }

}
