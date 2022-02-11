/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iventoryvaccionationentities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "vaccines", catalog = "postgres", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Vaccines.findAll", query = "SELECT v FROM Vaccines v"),
    @NamedQuery(name = "Vaccines.findByVaccineType", query = "SELECT v FROM Vaccines v WHERE v.vaccineType = :vaccineType"),
    @NamedQuery(name = "Vaccines.findByVaccinationDate", query = "SELECT v FROM Vaccines v WHERE v.vaccinationDate = :vaccinationDate"),
    @NamedQuery(name = "Vaccines.findByDosis", query = "SELECT v FROM Vaccines v WHERE v.dosis = :dosis"),
    @NamedQuery(name = "Vaccines.findByVaccineId", query = "SELECT v FROM Vaccines v WHERE v.vaccineId = :vaccineId")})
public class Vaccines implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "vaccineType")
    private String vaccineType;
    @Basic(optional = false)
    @Column(name = "vaccinationDate")
    @Temporal(TemporalType.DATE)
    private Date vaccinationDate;
    @Basic(optional = false)
    @Column(name = "dosis")
    private String dosis;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "vaccineId")
    private BigDecimal vaccineId;

    public Vaccines() {
    }

    public Vaccines(BigDecimal vaccineId) {
        this.vaccineId = vaccineId;
    }

    public Vaccines(BigDecimal vaccineId, String vaccineType, Date vaccinationDate, String dosis) {
        this.vaccineId = vaccineId;
        this.vaccineType = vaccineType;
        this.vaccinationDate = vaccinationDate;
        this.dosis = dosis;
    }

    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public Date getVaccinationDate() {
        return vaccinationDate;
    }

    public void setVaccinationDate(Date vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public BigDecimal getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(BigDecimal vaccineId) {
        this.vaccineId = vaccineId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vaccineId != null ? vaccineId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vaccines)) {
            return false;
        }
        Vaccines other = (Vaccines) object;
        if ((this.vaccineId == null && other.vaccineId != null) || (this.vaccineId != null && !this.vaccineId.equals(other.vaccineId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.iventoryvaccionationentities.Vaccines[ vaccineId=" + vaccineId + " ]";
    }
    
}
