package com.services;
import com.dtos.DogDto;
import com.dtos.UtilisateurDto;
import java.util.List;
public interface UserService {
    /**
     * Save a user
     */
    UtilisateurDto saveUser(UtilisateurDto userDto);

    /**
     * Get a user by it's id
     */
    UtilisateurDto getUserById(Long userId);

    /**
     * Delete a user by it's id
     */
    boolean deleteUser(Long userId);

    /**
     * update a user by it's id
     */
    UtilisateurDto updateUserById(Long userId);

}
