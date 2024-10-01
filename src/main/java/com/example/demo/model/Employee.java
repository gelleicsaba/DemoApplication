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
    
}
