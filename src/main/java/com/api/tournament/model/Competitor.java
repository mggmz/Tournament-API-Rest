package com.api.tournament.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.ArrayList;
import java.util.List;

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


    @OneToMany(cascade = CascadeType.ALL) //Para que en JPA y Persistence se encargue de la relación
    private List<Registration> registrations = new ArrayList<>();
}
