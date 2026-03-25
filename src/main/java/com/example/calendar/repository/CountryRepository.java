package com.example.calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.calendar.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
