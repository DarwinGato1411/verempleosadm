/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ec.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Darwin
 */
@Entity
@Table(name = "configurations")
@NamedQueries({
    @NamedQuery(name = "Configurations.findAll", query = "SELECT c FROM Configurations c")})
public class Configurations implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "configuration_id")
    @Id
    private int configurationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private Serializable value;
    @Column(name = "minimum")
    private Serializable minimum;
    @Column(name = "maximum")
    private Serializable maximum;
    @Column(name = "value_in_use")
    private Serializable valueInUse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_dynamic")
    private boolean isDynamic;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_advanced")
    private boolean isAdvanced;

    public Configurations() {
    }

    public int getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(int configurationId) {
        this.configurationId = configurationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serializable getValue() {
        return value;
    }

    public void setValue(Serializable value) {
        this.value = value;
    }

    public Serializable getMinimum() {
        return minimum;
    }

    public void setMinimum(Serializable minimum) {
        this.minimum = minimum;
    }

    public Serializable getMaximum() {
        return maximum;
    }

    public void setMaximum(Serializable maximum) {
        this.maximum = maximum;
    }

    public Serializable getValueInUse() {
        return valueInUse;
    }

    public void setValueInUse(Serializable valueInUse) {
        this.valueInUse = valueInUse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsDynamic() {
        return isDynamic;
    }

    public void setIsDynamic(boolean isDynamic) {
        this.isDynamic = isDynamic;
    }

    public boolean getIsAdvanced() {
        return isAdvanced;
    }

    public void setIsAdvanced(boolean isAdvanced) {
        this.isAdvanced = isAdvanced;
    }
    
}
