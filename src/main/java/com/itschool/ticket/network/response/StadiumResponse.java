package com.itschool.ticket.network.response;

import com.itschool.ticket.domain.Stadium;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class StadiumResponse {
    private Long id;
    private String name;

    public static StadiumResponse of(Stadium stadium){
        return StadiumResponse.builder()
                .id(stadium.getId())
                .name(stadium.getName())
                .build();
    }
}
