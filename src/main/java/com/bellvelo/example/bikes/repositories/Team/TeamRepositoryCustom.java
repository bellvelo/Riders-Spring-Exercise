package com.bellvelo.example.bikes.repositories.Team;

import com.bellvelo.example.bikes.models.Rider;
import com.bellvelo.example.bikes.models.Team;

import java.util.List;

public interface TeamRepositoryCustom {
    List<Team> getTeamsByNation(String nationality);

    List<Rider> findAllRiderOnTeam(Team team);
}
