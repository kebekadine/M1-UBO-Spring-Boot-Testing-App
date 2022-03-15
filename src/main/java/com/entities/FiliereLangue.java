package com.entities;

import javax.persistence.*;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data

public class FiliereLangue {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long codeFiliereLangue;
    private String nomFiliereLangue;
    /**
     * association avec la table cours
     */
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "filiereListe",
            joinColumns = {
                    @JoinColumn(name = "filiere_langue_id", referencedColumnName = "Id", updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "cours_id", referencedColumnName = "Id", updatable = false)})
    private List<Cours> coursListe;

    public Long getCodeFiliereLangue() {
        return codeFiliereLangue;
    }

    public void setCodeFiliereLangue(Long codeFiliereLangue) {
        this.codeFiliereLangue = codeFiliereLangue;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<Cours> getCoursListe() {
        return coursListe;
    }

    public void setCoursListe(List<Cours> coursListe) {
        this.coursListe = coursListe;
    }
}
