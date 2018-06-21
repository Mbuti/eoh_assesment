/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mbuti.Buthelezi
 */
@Entity
@Table(name = "CIC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cic.findAll", query = "SELECT c FROM Cic c")
    , @NamedQuery(name = "Cic.findByCicid", query = "SELECT c FROM Cic c WHERE c.cicid = :cicid")
    , @NamedQuery(name = "Cic.findByCictimestamp", query = "SELECT c FROM Cic c WHERE c.cictimestamp = :cictimestamp")})
public class Cic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CICID")
    private Long cicid;
    @Lob
    @Size(max = 32700)
    @Column(name = "CICTYPE")
    private String cictype;
    @Lob
    @Size(max = 32700)
    @Column(name = "SUBJECT")
    private String subject;
    @Lob
    @Size(max = 32700)
    @Column(name = "BODY")
    private String body;
    @Lob
    @Size(max = 32700)
    @Column(name = "SOURCESYSTEM")
    private String sourcesystem;
    @Column(name = "CICTIMESTAMP")
    @Temporal(TemporalType.DATE)
    private Date cictimestamp;

    public Cic() {
    }

    public Cic(Long cicid) {
        this.cicid = cicid;
    }

    public Long getCicid() {
        return cicid;
    }

    public void setCicid(Long cicid) {
        this.cicid = cicid;
    }

    public String getCictype() {
        return cictype;
    }

    public void setCictype(String cictype) {
        this.cictype = cictype;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSourcesystem() {
        return sourcesystem;
    }

    public void setSourcesystem(String sourcesystem) {
        this.sourcesystem = sourcesystem;
    }

    public Date getCictimestamp() {
        return cictimestamp;
    }

    public void setCictimestamp(Date cictimestamp) {
        this.cictimestamp = cictimestamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cicid != null ? cicid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cic)) {
            return false;
        }
        Cic other = (Cic) object;
        if ((this.cicid == null && other.cicid != null) || (this.cicid != null && !this.cicid.equals(other.cicid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domain.Cic[ cicid=" + cicid + " ]";
    }
    
}
