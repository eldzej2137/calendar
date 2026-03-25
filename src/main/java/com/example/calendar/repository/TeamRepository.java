package com.example.calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.calendar.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{
}
