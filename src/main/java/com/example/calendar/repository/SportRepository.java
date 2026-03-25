package com.example.calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.calendar.entity.Sport;

public interface SportRepository extends JpaRepository<Sport,Long> {
}
