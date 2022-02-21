package com.controllers;

import com.dtos.UtilisateurDto;
import com.services.impl.UserServiceImpl;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserServiceImpl user;
    public UserController(UserServiceImpl user){
        this.user = user;
    }
    @PostMapping
    public UtilisateurDto saveUsr(final @RequestBody @NotNull UtilisateurDto userDto){
        return user.saveUser(userDto);
    }

    @GetMapping
    public List<UtilisateurDto> getAll (){
        return user.getAllUser();
    }
    @GetMapping("/{id}")
    public UtilisateurDto getUser(@PathVariable  Long id){
        return user.getUserById(id);
    }
    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable  Long id){
        return user.deleteUser(id);
    }


}
