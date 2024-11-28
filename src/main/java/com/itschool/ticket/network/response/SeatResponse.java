package com.itschool.ticket.network.response;

import com.itschool.ticket.domain.Seat;
import com.itschool.ticket.domain.Stadium;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SeatResponse {
    private Long id;
    private String seatGrade;
    private Long price;
    private StadiumResponse stadium;

    public static SeatResponse of(Seat seat){
        Stadium stadium = seat.getStadium();

        return SeatResponse.builder()
                .id(seat.getId())
                .seatGrade(seat.getSeatGrade())
                .price(seat.getPrice())
                .stadium(StadiumResponse.builder()
                        .id(stadium.getId())
                        .build())
                .build();
    }
}
