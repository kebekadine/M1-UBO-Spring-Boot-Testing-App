package com.services.impl;
import com.dtos.FiliereLangueDto;
import com.dtos.UtilisateurDto;
import com.entities.FiliereLangue;
import com.entities.Utilisateur;
import com.repositories.FiliereLangueRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service("filiereService")
public class FiliereLangueImpl {
    public final FiliereLangueRepository filiereRepo;

    public FiliereLangueImpl(FiliereLangueRepository filiereRepo) {
        this.filiereRepo = filiereRepo;
    }


    public FiliereLangueDto saveFiliere(FiliereLangueDto filiereDto){
        //convertis la filiere en une entite filiere
        FiliereLangue filiere =  filiereLangueDtoToEntity(filiereDto);
        //enregistre l'utilisateur
        filiere = filiereRepo.save(filiere);

        return filiereLangueEntityToDto(filiere);
    }
    public FiliereLangueDto getFiliereByCode(Long id){
        FiliereLangue filiereLg = filiereRepo.findById(id).orElseThrow(()->new EntityNotFoundException("Not found"));
        return filiereLangueEntityToDto(filiereLg);
    }

    private FiliereLangueDto filiereLangueEntityToDto(FiliereLangue filiere) {
        FiliereLangueDto filiereLangue = new FiliereLangueDto();
        filiereLangue.setCodeFiliereLangue(filiere.getCodeFiliereLangue());
        filiereLangue.setNomFiliereLangue(filiereLangue.getNomFiliereLangue());
        return filiereLangue;
    }
    private FiliereLangue  filiereLangueDtoToEntity(FiliereLangueDto filiere){
        FiliereLangue filiereLangue = new FiliereLangue();
        filiereLangue.setCodeFiliereLangue(filiere.getCodeFiliereLangue());
        filiereLangue.setNomFiliereLangue(filiereLangue.getNomFiliereLangue());
        return filiereLangue;

    }

}
