package com.services;

import com.dtos.FiliereLangueDto;

public interface FiliereLangueService {
    /**
     * Save a filiere
     */
    FiliereLangueDto saveFiliere (FiliereLangueDto filiereLangue);

    /**
     * Get filiere by it's code
     */
    FiliereLangueDto getFiliereByCode (Long codeFiliereLangue);

    /**
     * Delete a filiere by it's code
     */
    boolean deleteFiliere(Long codeFiliereLangue);
}
