package com.api.tournament.repository;

import com.api.tournament.model.Competitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitorRepository extends JpaRepository<Competitor, Long> {
}
