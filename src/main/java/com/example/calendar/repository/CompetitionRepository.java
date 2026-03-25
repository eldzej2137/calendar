package com.example.calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.calendar.entity.Competition;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {
}
