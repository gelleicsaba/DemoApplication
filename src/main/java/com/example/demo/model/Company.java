package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nev", nullable = true)
    private String nev;

    @Column(name = "ceg_jegyz_szam", nullable = true)
    private String cegJegyzSzam;

    public Company() {
    }

    public Company(String nev, String cegJegyzSzam) {
        this.nev = nev;
        this.cegJegyzSzam = cegJegyzSzam;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getCegJegyzSzam() {
        return cegJegyzSzam;
    }

    public void setCegJegyzSzam(String cegJegyzSzam) {
        this.cegJegyzSzam = cegJegyzSzam;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", nev='" + nev + '\'' +
                ", cegJegyzSzam='" + cegJegyzSzam + '\'' +
                '}';
    }
}
