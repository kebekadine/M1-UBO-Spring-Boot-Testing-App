package com.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Login;
    private String motDePasse;
    private String nomUsuel;
    private String prenomUsuel;
    private String mail;

    public Long getId() {
        return Id;
    }

    public String getLogin() {
        return Login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getMail() {
        return mail;
    }

    public String getNomUsuel() {
        return nomUsuel;
    }

    public String getPrenomUsuel() {
        return prenomUsuel;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNomUsuel(String nomUsuel) {
        this.nomUsuel = nomUsuel;
    }

    public void setPrenomUsuel(String prenomUsuel) {
        this.prenomUsuel = prenomUsuel;
    }
}
