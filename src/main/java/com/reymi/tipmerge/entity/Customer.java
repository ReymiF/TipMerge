package com.reymi.tipmerge.entity;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_generator")
    @SequenceGenerator(name = "customer_generator", sequenceName = "customer_SEQ", allocationSize = 1)
    private Long id;
    private String pseudo;
    private String firstname;
    private String lastname;
    private String email;

    public Customer(){}

    public Customer(Long id, String pseudo, String firstname, String lastname, String email) {
        this.id = id;
        this.pseudo = pseudo;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, pseudo='%s', fisrtname='%s', lastName='%s']",
                id, pseudo, firstname, lastname);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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
}
