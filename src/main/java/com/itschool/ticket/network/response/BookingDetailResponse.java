package com.itschool.ticket.network.response;

import com.itschool.ticket.domain.BookingDetail;
import com.itschool.ticket.domain.BookingInformation;
import com.itschool.ticket.domain.SeatDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BookingDetailResponse {
    private Long id;
    private String bookingStatus;
    private LocalDateTime cancelDeadLine;
    private BookingInformationResponse bookingInformation;
    private SeatDetailResponse seatDetail;

    public static BookingDetailResponse of(BookingDetail bookingDetail){
        BookingInformation bookingInformation = bookingDetail.getBookingInformation();
        SeatDetail seatDetail = bookingDetail.getSeatDetail();

        return BookingDetailResponse.builder()
                .id(bookingDetail.getId())
                .bookingStatus(bookingDetail.getBookingStatus())
                .cancelDeadLine(bookingDetail.getCancelDeadline())
                .bookingInformation(BookingInformationResponse.builder()
                        .id(bookingDetail.getId())
                        .build())
                .seatDetail(SeatDetailResponse.builder()
                        .id(seatDetail.getId())
                        .build())
                .build();
    }
}
