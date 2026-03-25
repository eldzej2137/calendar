package com.example.calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.calendar.entity.Venue;

public interface VenueRepository extends JpaRepository<Venue,Long> {
}
