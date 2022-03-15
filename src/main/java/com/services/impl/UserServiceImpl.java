package com.services.impl;

import com.dtos.UtilisateurDto;

import com.entities.Utilisateur;
import com.repositories.UserRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
@Service("userService")
public class UserServiceImpl {
    private final UserRepository userRepo;
    public UserServiceImpl(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    public UtilisateurDto saveUser(UtilisateurDto userDto){
        //convertis l'utilisateur en une entite utilisateur
        Utilisateur user =  userDtoToEntity(userDto);
        //enregistre l'utilisateur
        user = userRepo.save(user);

        return userEntityToDto(user);
    }

    public UtilisateurDto getUserById(Long userId){
        Utilisateur user = userRepo.findById(userId).orElseThrow(()->new EntityNotFoundException("user not found"));
        return userEntityToDto(user);
    }
    public boolean  deleteUser(Long userId){
        userRepo.deleteById(userId);
        return true;
    }
    public List<UtilisateurDto> getAllUser(){
        List<UtilisateurDto> user = new ArrayList<>();
        List<Utilisateur> users = userRepo.findAll();
        users.forEach(usr ->{
            user.add(userEntityToDto(usr));
        });
        return user;
    }
    private UtilisateurDto userEntityToDto(Utilisateur user) {
        UtilisateurDto usr = new UtilisateurDto();
        usr.setId(user.getId());
        usr.setLogin(user.getLogin());
        usr.setMail(user.getMail());
        usr.setNomUsuel(user.getNomUsuel());
        usr.setMotDePasse(user.getMotDePasse());
        usr.setPrenomUsuel(user.getPrenomUsuel());
        return usr;
    }
    private Utilisateur userDtoToEntity(UtilisateurDto user){
        Utilisateur usr = new Utilisateur();
        usr.setId(user.getId());
        usr.setLogin(user.getLogin());
        usr.setMail(user.getMail());
        usr.setNomUsuel(user.getNomUsuel());
        usr.setMotDePasse(user.getMotDePasse());
        usr.setPrenomUsuel(user.getPrenomUsuel());
        return usr;

    }

}
