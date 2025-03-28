package com.api.tournament.service;

import com.api.tournament.model.Competitor;
import com.api.tournament.repository.CompetitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitorService {

    @Autowired

    private CompetitorRepository competitorRepository;
    public List<Competitor> getAllCompetitors(){

        return competitorRepository.findAll();

    }
    //Crear Competidor
    public Competitor createCompetitor(Competitor competitor){
        return competitorRepository.save(competitor);
    }
}
