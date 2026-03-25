package com.example.calendar.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "_competition_id")
    private Competition competition;

    @ManyToOne
    @JoinColumn(name = "_home_team_id")
    private Team homeTeam;
    
    @ManyToOne
    @JoinColumn(name = "_away_team_id")
    private Team awayTeam;

    @ManyToOne
    @JoinColumn(name = "_sport_id")
    private Sport sport;

    @ManyToOne
    @JoinColumn(name = "_venue_id")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "_match_status_id")
    private MatchStatus match_status;

    private LocalDateTime kickoff_time;
    private int home_goals;
    private int away_goals;
    private String stage;
    private String season;
    private String notes;

    // getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Competition getCompetition() {
        return competition;
    }
    public void setCompetition(Competition competition) {
        this.competition = competition;
    }
    public Team getHomeTeam() {
        return homeTeam;
    }
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }
    public Team getAwayTeam() {
        return awayTeam;
    }
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
    public Sport getSport() {
        return sport;
    }
    public void setSport(Sport sport) {
        this.sport = sport;
    }
    public Venue getVenue() {
        return venue;
    }
    public void setVenue(Venue venue) {
        this.venue = venue;
    }
    public MatchStatus getMatchStatus() {
        return match_status;
    }
    public void setMatchStatus(MatchStatus match_status) {
        this.match_status = match_status;
    }
    public LocalDateTime getKickoffTime() {
        return kickoff_time;
    }
    public void setKickoffTime(LocalDateTime kickoff_time) {
        this.kickoff_time = kickoff_time;
    }
    public int getHomeGoals() {
        return home_goals;
    }
    public void setHomeGoals(int home_goals) {
        this.home_goals = home_goals;
    }
    public int getAwayGoals() {
        return away_goals;
    }
    public void setAwayGoals(int away_goals) {
        this.away_goals = away_goals;
    }
    public String getStage() {
        return stage;
    }
    public void setStage(String stage) {
        this.stage = stage;
    }
    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    
}
