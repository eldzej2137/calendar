package com.example.calendar.projection;

import java.time.LocalDateTime;

public interface EventProjection {
    public String getSportName();
    public String getCompetitionName();
    public String getStage();
    public LocalDateTime getKickoffTime();
    public String getHomeTeamName();
    public int getHomeGoals();
    public int getAwayGoals();
    public String getAwayTeamName();
    public String getVenueName();
}
