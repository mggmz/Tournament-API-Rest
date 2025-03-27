package com.api.tournament.repository;

import com.api.tournament.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository <Registration, Long> {
}
