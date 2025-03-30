package com.api.tournament.controller;


import com.api.tournament.model.Competitor;
import com.api.tournament.service.CompetitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CompetitorController {
   @Autowired
   private CompetitorService competitorService;

   //GET
    @GetMapping
    public List<Competitor> listarTodo(){
        return competitorService.getAllCompetitors();
    }
    //POST
    @PostMapping
    public Competitor crear(@RequestBody Competitor competitor){
        return competitorService.createCompetitor(competitor);

    }
    //PUT
    @PostMapping("editar/{id}")
    public Competitor actualizar(@RequestBody Competitor competitor, @PathVariable Long id){
        competitor.setIdCompetitor(id);
        return competitorService.updateCompetitor(competitor);
    }
    //Ya tenemos seteado el competidor pero en el modelo no aparece ningun getter o setter, esto gracias a Lombok.

    //DELETE
    @DeleteMapping("eliminar/{id}")
        public void eliminar(@PathVariable Long id) {
        competitorService.deleteCompetitorById(id);
    }
}
