package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class FiliereLangue {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeFiliereLangue;
    private String nomFiliereLangue;
}
