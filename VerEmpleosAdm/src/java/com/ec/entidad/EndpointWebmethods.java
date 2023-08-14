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
@Table(name = "endpoint_webmethods")
@NamedQueries({
    @NamedQuery(name = "EndpointWebmethods.findAll", query = "SELECT e FROM EndpointWebmethods e")})
public class EndpointWebmethods implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "endpoint_id")
    @Id
    private int endpointId;
    @Size(max = 384)
    @Column(name = "namespace")
    private String namespace;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "method_alias")
    private String methodAlias;
    @Size(max = 776)
    @Column(name = "object_name")
    private String objectName;
    @Column(name = "result_schema")
    private Short resultSchema;
    @Size(max = 60)
    @Column(name = "result_schema_desc")
    private String resultSchemaDesc;
    @Column(name = "result_format")
    private Short resultFormat;
    @Size(max = 60)
    @Column(name = "result_format_desc")
    private String resultFormatDesc;

    public EndpointWebmethods() {
    }

    public int getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(int endpointId) {
        this.endpointId = endpointId;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getMethodAlias() {
        return methodAlias;
    }

    public void setMethodAlias(String methodAlias) {
        this.methodAlias = methodAlias;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Short getResultSchema() {
        return resultSchema;
    }

    public void setResultSchema(Short resultSchema) {
        this.resultSchema = resultSchema;
    }

    public String getResultSchemaDesc() {
        return resultSchemaDesc;
    }

    public void setResultSchemaDesc(String resultSchemaDesc) {
        this.resultSchemaDesc = resultSchemaDesc;
    }

    public Short getResultFormat() {
        return resultFormat;
    }

    public void setResultFormat(Short resultFormat) {
        this.resultFormat = resultFormat;
    }

    public String getResultFormatDesc() {
        return resultFormatDesc;
    }

    public void setResultFormatDesc(String resultFormatDesc) {
        this.resultFormatDesc = resultFormatDesc;
    }
    
}
