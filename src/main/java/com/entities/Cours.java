package com.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="user")
public class Cours {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String intitule;

    @ManyToMany(mappedBy = "coursListe", fetch = FetchType.LAZY)
    private List<FiliereLangue> filiereListe;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public List<FiliereLangue> getFiliereListe() {
        return filiereListe;
    }

    public void setFiliereListe(List<FiliereLangue> filiereListe) {
        this.filiereListe = filiereListe;
    }
}
