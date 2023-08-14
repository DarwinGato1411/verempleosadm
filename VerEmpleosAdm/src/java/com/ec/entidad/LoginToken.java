/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "login_token")
@NamedQueries({
    @NamedQuery(name = "LoginToken.findAll", query = "SELECT l FROM LoginToken l")})
public class LoginToken implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "principal_id")
    @Id
    private Integer principalId;
    @Lob
    @Column(name = "sid")
    private byte[] sid;
    @Size(max = 128)
    @Column(name = "name")
    private String name;
    @Size(max = 128)
    @Column(name = "type")
    private String type;
    @Size(max = 128)
    @Column(name = "usage")
    private String usage;

    public LoginToken() {
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
    
}
