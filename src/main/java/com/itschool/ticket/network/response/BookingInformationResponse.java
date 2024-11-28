package com.itschool.ticket.network.response;

import com.itschool.ticket.domain.BookingInformation;
import com.itschool.ticket.domain.Customer;
import com.itschool.ticket.domain.DayOfMatch;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BookingInformationResponse {
    private Long id;
    private String bookingCode;
    private Long totalNumber;
    private Long totalAmount;
    private Long receiveMethod;
    private CustomerResponse customer;
    private DayOfMatchResponse dayOfMatch;

    public static BookingInformationResponse of(BookingInformation bookingInformation){
        Customer customer = bookingInformation.getCustomer();
        DayOfMatch dayOfMatch = bookingInformation.getDayOfMatch();

        return BookingInformationResponse.builder()
                .id(bookingInformation.getId())
                .bookingCode(bookingInformation.getBookingCode())
                .totalNumber(bookingInformation.getTotalNumber())
                .totalAmount(bookingInformation.getTotalAmount())
                .customer(CustomerResponse.builder()
                        .id(customer.getId())
                        .build())
                .dayOfMatch(DayOfMatchResponse.builder()
                        .id(dayOfMatch.getId())
                        .build())
                .build();
    }
}
