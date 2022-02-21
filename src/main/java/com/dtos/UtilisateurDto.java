package com.dtos;

import lombok.Data;
@Data
public class UtilisateurDto {
    private Long Id;
    private String Login;
    private String motDePasse;
    private String nomUsuel;
    private String prenomUsuel;
    private String mail;
}
