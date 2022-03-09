package com.controllers;

import com.dtos.FiliereLangueDto;
import com.services.impl.FiliereLangueImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filiere")
public class FiliereLangueController {
    private final FiliereLangueImpl filiere;

    public FiliereLangueController(FiliereLangueImpl filiere) {
        this.filiere = filiere;
    }
    @GetMapping("/{id}")
    public FiliereLangueDto getFiliereName(@PathVariable  Long codeFiliereLangue){
        return filiere.getFiliereByCode(codeFiliereLangue);
    }
}
