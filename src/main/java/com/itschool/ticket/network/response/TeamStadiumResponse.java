package com.itschool.ticket.network.response;

import com.itschool.ticket.domain.Stadium;
import com.itschool.ticket.domain.Team;
import com.itschool.ticket.domain.TeamStadium;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TeamStadiumResponse {
    private Long id;
    private TeamResponse team;
    private StadiumResponse stadium;

    public static TeamStadiumResponse of(TeamStadium teamStadium){
        Team team = teamStadium.getTeam();
        Stadium stadium = teamStadium.getStadium();

        return TeamStadiumResponse.builder()
                .id(teamStadium.getId())
                .team(TeamResponse.builder()
                        .id(team.getId())
                        .build())
                .stadium(StadiumResponse.builder()
                        .id(stadium.getId())
                        .build())
                .build();
    }
}
