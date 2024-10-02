package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "nev", nullable = true)
    private String nev;

    @Column(name = "company_id", nullable = true)
    private long companyId;

    public Employee() {}

    public Employee(final String nev) {
        this.nev = nev;
    }

    //getter/setter methods    
    public long getId() {
        return id;
    }    
    
    public String getNev() {
        return nev;
    }

    public void setId(final long id) {
        this.id = id;
    }
    
    public void setNev(final String nev) {
        this.nev = nev;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nev='" + nev + '\'' +
                ", companyId=" + companyId +
                '}';
    }
}
