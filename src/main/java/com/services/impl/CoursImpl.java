package com.services.impl;

import com.dtos.CoursDto;
import com.entities.Cours;
import com.repositories.CoursRepository;
import com.services.CoursService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service("coursService")

public class CoursImpl implements CoursService {

    private final CoursRepository coursRepository;



    public CoursImpl(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    @Override
    public CoursDto saveCours(CoursDto coursDto) {
        // Converts the dto to the cours entity
        Cours cours = coursDtoToEntity(coursDto);
        // Save the cours entity
        cours = coursRepository.save(cours);
        // Return the new dto
        return coursEntityToDto(cours);
    }

    @Override
    public CoursDto getCoursById(Long coursId) {
        Cours cours = coursRepository.findById(coursId).orElseThrow(() -> new EntityNotFoundException("cours not found"));
        return coursEntityToDto(cours);
    }

    @Override
    public boolean deleteCours(Long coursId) {
        coursRepository.deleteById(coursId);
        return true;
    }

    @Override
    public List<CoursDto> getAllCours() {
        List<CoursDto> coursDtos = new ArrayList<>();
        List<Cours> cours = coursRepository.findAll();
        cours.forEach(cour -> {
            coursDtos.add(coursEntityToDto(cour));
        });
        return coursDtos;
    }

    /**
     * Map cours dto to cours entity
     */
    private CoursDto coursEntityToDto(Cours cours){
        CoursDto coursDto = new CoursDto();
        coursDto.setId(cours.getId());
        coursDto.setIntitule(cours.getIntitule());

        return coursDto;
    }

    /**
     * Map cours entity to cours dto
     */
    private Cours coursDtoToEntity(CoursDto coursDto){
        Cours cours = new Cours();
        cours.setIntitule(coursDto.getIntitule());
        cours.setId(coursDto.getId());

        return cours;
    }
}
