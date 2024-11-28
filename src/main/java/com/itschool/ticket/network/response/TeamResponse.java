package com.itschool.ticket.network.response;

import com.itschool.ticket.domain.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TeamResponse {
    private Long id;
    private String name;

    public static TeamResponse of(Team team){
        return TeamResponse.builder()
                .id(team.getId())
                .name(team.getName())
                .build();
    }
}
