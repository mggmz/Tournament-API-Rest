package com.api.tournament.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idRegistration;
    private String fechaTorneo;
    private String horaToreno;
    private String cinta;
    private String formaPago;

}
