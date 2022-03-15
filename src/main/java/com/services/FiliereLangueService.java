package com.services;

import com.dtos.FiliereLangueDto;

public interface FiliereLangueService {
    /**
     * Save a filiere
     */
    FiliereLangueDto saveFiliere (FiliereLangueDto filiereLangue);

    /**
     * Get filiere by it's id
     */
    FiliereLangueDto getFiliereByCode (Long filiereId);

    /**
     * Delete a filiere by it's ID
     */
    boolean deleteFiliereById(Long filiereId);
}
