package com.itschool.ticket.network.response;

import com.itschool.ticket.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CustomerResponse {
    private Long id;
    private String email;
    private String name;
    private String phoneNumber;
    private Long point;
    private String grade;
    private LocalDateTime lastLoginAt;

    public static CustomerResponse of(Customer customer){
        return CustomerResponse.builder()
                .id(customer.getId())
                .email(customer.getEmail())
                .name(customer.getName())
                .phoneNumber(customer.getPhoneNumber())
                .point(customer.getPoint())
                .grade(customer.getGrade())
                .build();
    }
}
