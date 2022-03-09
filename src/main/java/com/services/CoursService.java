package com.services;

import com.dtos.CoursDto;

import java.util.List;

public interface CoursService {
    /**
     * Sauve a cours
     */
    CoursDto saveCours(CoursDto coursDto);

    /**
     * Get a cours by it's id
     */
    CoursDto getCoursById(Long coursId);

    /**
     * Delete a cours by it's id
     */
    boolean deleteCours(Long coursId);

    /**
     * Get all the cours
     */
    List<CoursDto> getAllCours();


}
