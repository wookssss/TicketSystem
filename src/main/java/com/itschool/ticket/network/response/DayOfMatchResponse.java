package com.itschool.ticket.network.response;

import com.itschool.ticket.domain.DayOfMatch;
import com.itschool.ticket.domain.Team;
import com.itschool.ticket.domain.TeamStadium;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DayOfMatchResponse {
    private Long id;
    private LocalDateTime matchStartAt;
    private LocalDateTime bookingStartAt;
    private Boolean isAvailable;
    private TeamStadiumResponse teamStadium;
    private TeamResponse awayTeam;

    public static DayOfMatchResponse of(DayOfMatch dayOfMatch){
        TeamStadium teamStadium = dayOfMatch.getTeamStadium();
        Team awayTeam = dayOfMatch.getAwayTeam();

        return DayOfMatchResponse.builder()
                .id(dayOfMatch.getId())
                .matchStartAt(dayOfMatch.getMatchStartAt())
                .bookingStartAt(dayOfMatch.getBookingStartAt())
                .isAvailable(dayOfMatch.getIsAvailable())
                .teamStadium(TeamStadiumResponse.builder()
                        .id(teamStadium.getId())
                        .build())
                .awayTeam(TeamResponse.builder()
                        .id(awayTeam.getId())
                        .build())
                .build();
    }
}
