package com.example.calendar.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.calendar.entity.Event;
import com.example.calendar.projection.EventProjection;

public interface EventRepository extends JpaRepository<Event,Long> {

    @Query(value = "SELECT s.name AS sportName, c.name AS competitionName, "+
                "e.stage AS stage, e.kickoff_time AS kickoffTime, t1.name AS homeTeamName, " +
                "e.home_goals AS homeGoals, e.away_goals AS awayGoals, " +
                "t2.name AS awayTeamName, v.name AS venueName "+
                "FROM event e INNER JOIN sport s ON e._sport_id = s.id " +
                "INNER JOIN competition c ON e._competition_id = c.id " +
                "INNER JOIN team t1 ON e._home_team_id = t1.id " +
                "INNER JOIN team t2 ON e._away_team_id = t2.id " +
                "INNER JOIN venue v ON e._venue_id = v.id;",
                nativeQuery = true)
    public List<EventProjection> getEventsDisplay();

    @Query(value = "SELECT s.name AS sportName, c.name AS competitionName, "+
                "e.stage AS stage, e.kickoff_time AS kickoffTime, t1.name AS homeTeamName, " +
                "e.home_goals AS homeGoals, e.away_goals AS awayGoals, " +
                "t2.name AS awayTeamName, v.name AS venueName "+
                "FROM event e INNER JOIN sport s ON e._sport_id = s.id " +
                "INNER JOIN competition c ON e._competition_id = c.id " +
                "INNER JOIN team t1 ON e._home_team_id = t1.id " +
                "INNER JOIN team t2 ON e._away_team_id = t2.id " +
                "INNER JOIN venue v ON e._venue_id = v.id "+
                "WHERE e.id = :id;",
                nativeQuery = true)
    public Optional<EventProjection> getEventsDisplayById(@Param("id") Long id);
}