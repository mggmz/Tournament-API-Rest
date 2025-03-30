package com.api.tournament.service;

import com.api.tournament.model.Competitor;
import com.api.tournament.repository.CompetitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    @Autowired

    private CompetitorRepository registationRepository;
    public List<Competitor> getAllCompetitors(){

        return registationRepository.findAll();

    }
    //Crear Competidor
    public Competitor createCompetitor(Competitor competitor){
        return registationRepository.save(competitor);
    }

    //Editar Competidor
    public Competitor updateCompetitor(Competitor competitor){
        return registationRepository.save(competitor);
    }

    //Eliminar Competidor
    public void deleteCompetitorById(Long id){
        registationRepository.deleteById(id);
    }
}
