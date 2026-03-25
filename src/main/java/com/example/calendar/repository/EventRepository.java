package com.example.calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.calendar.entity.Event;

public interface EventRepository extends JpaRepository<Event,Long> {
}
