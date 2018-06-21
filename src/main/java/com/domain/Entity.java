/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mbuti.Buthelezi
 */
@javax.persistence.Entity
@Table(name = "ENTITY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entity.findAll", query = "SELECT e FROM Entity e")
    , @NamedQuery(name = "Entity.findByEntityid", query = "SELECT e FROM Entity e WHERE e.entityid = :entityid")
    , @NamedQuery(name = "Entity.findByEntityname", query = "SELECT e FROM Entity e WHERE e.entityname = :entityname")
    , @NamedQuery(name = "Entity.findByEmailaddress", query = "SELECT e FROM Entity e WHERE e.emailaddress = :emailaddress")})
public class Entity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ENTITYID")
    private Long entityid;
    @Size(max = 50)
    @Column(name = "ENTITYNAME")
    private String entityname;
    @Size(max = 50)
    @Column(name = "EMAILADDRESS")
    private String emailaddress;

    public Entity() {
    }

    public Entity(Long entityid) {
        this.entityid = entityid;
    }

    public Long getEntityid() {
        return entityid;
    }

    public void setEntityid(Long entityid) {
        this.entityid = entityid;
    }

    public String getEntityname() {
        return entityname;
    }

    public void setEntityname(String entityname) {
        this.entityname = entityname;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityid != null ? entityid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entity)) {
            return false;
        }
        Entity other = (Entity) object;
        if ((this.entityid == null && other.entityid != null) || (this.entityid != null && !this.entityid.equals(other.entityid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domain.Entity[ entityid=" + entityid + " ]";
    }
    
}
