package com.example.calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.calendar.entity.MatchStatus;

public interface MatchStatusRepository extends JpaRepository<MatchStatus, Long>{
}
