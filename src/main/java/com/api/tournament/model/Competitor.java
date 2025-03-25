package com.api.tournament.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Entity //Le dice a la persistencia de java que será una entidad, asegurando que toda la clase sea entidad
@Data //Define nuestra clase como un flujo de información ayudandonos a crear campos de forma más sencilla

public class Competitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompetitor;

    private String name;
    private String secondName;
    private String birthDate;
    private String nationality;

}
