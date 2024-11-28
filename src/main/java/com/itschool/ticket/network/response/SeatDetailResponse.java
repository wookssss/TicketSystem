package com.itschool.ticket.network.response;

import com.itschool.ticket.domain.Seat;
import com.itschool.ticket.domain.SeatDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SeatDetailResponse {
    private Long id;
    private String seatZone;
    private Integer seatRow;
    private Integer seatNumber;
    private Boolean isEmpty;
    private SeatResponse seat;

    public static SeatDetailResponse of(SeatDetail seatDetail){
        Seat seat = seatDetail.getSeat();

        return SeatDetailResponse.builder()
                .id(seatDetail.getId())
                .seatZone(seatDetail.getSeatZone())
                .seatRow(seatDetail.getSeatRow())
                .seatNumber(seatDetail.getSeatNumber())
                .isEmpty(seatDetail.getIsEmpty())
                .seat(SeatResponse.builder()
                        .id(seat.getId())
                        .build())
                .build();
    }
}
