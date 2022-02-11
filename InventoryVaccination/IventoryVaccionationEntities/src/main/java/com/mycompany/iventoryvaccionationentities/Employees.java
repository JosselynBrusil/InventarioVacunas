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
@Table(name = "employees", catalog = "postgres", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Employees.findAll", query = "SELECT e FROM Employees e"),
    @NamedQuery(name = "Employees.findByEmployeId", query = "SELECT e FROM Employees e WHERE e.employeId = :employeId"),
    @NamedQuery(name = "Employees.findByIdentify", query = "SELECT e FROM Employees e WHERE e.identify = :identify"),
    @NamedQuery(name = "Employees.findByName", query = "SELECT e FROM Employees e WHERE e.name = :name"),
    @NamedQuery(name = "Employees.findByLastname", query = "SELECT e FROM Employees e WHERE e.lastname = :lastname"),
    @NamedQuery(name = "Employees.findByEmail", query = "SELECT e FROM Employees e WHERE e.email = :email"),
    @NamedQuery(name = "Employees.findByBirthday", query = "SELECT e FROM Employees e WHERE e.birthday = :birthday"),
    @NamedQuery(name = "Employees.findByAddress", query = "SELECT e FROM Employees e WHERE e.address = :address"),
    @NamedQuery(name = "Employees.findByCellphone", query = "SELECT e FROM Employees e WHERE e.cellphone = :cellphone"),
    @NamedQuery(name = "Employees.findByStatusVaccination", query = "SELECT e FROM Employees e WHERE e.statusVaccination = :statusVaccination")})
public class Employees implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "employeId")
    private BigDecimal employeId;
    @Basic(optional = false)
    @Column(name = "identify")
    private String identify;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "cellphone")
    private String cellphone;
    @Basic(optional = false)
    @Column(name = "statusVaccination")
    private String statusVaccination;

    public Employees() {
    }

    public Employees(BigDecimal employeId) {
        this.employeId = employeId;
    }

    public Employees(BigDecimal employeId, String identify, String name, String lastname, String email, Date birthday, String address, String cellphone, String statusVaccination) {
        this.employeId = employeId;
        this.identify = identify;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.birthday = birthday;
        this.address = address;
        this.cellphone = cellphone;
        this.statusVaccination = statusVaccination;
    }

    public BigDecimal getEmployeId() {
        return employeId;
    }

    public void setEmployeId(BigDecimal employeId) {
        this.employeId = employeId;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getStatusVaccination() {
        return statusVaccination;
    }

    public void setStatusVaccination(String statusVaccination) {
        this.statusVaccination = statusVaccination;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeId != null ? employeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employees)) {
            return false;
        }
        Employees other = (Employees) object;
        if ((this.employeId == null && other.employeId != null) || (this.employeId != null && !this.employeId.equals(other.employeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.iventoryvaccionationentities.Employees[ employeId=" + employeId + " ]";
    }
    
}
