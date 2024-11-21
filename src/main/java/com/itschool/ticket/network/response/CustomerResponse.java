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
    private String password;
    private String name;
    private String phoneNumber;
    private Integer point;
    private String grade;
    private LocalDateTime lastLoginAt;

    public CustomerResponse(Customer customer){
        this.id = customer.getId();
        this.email = customer.getEmail();
        this.password = customer.getPassword();
        this.name = customer.getName();
        this.phoneNumber = customer.getPhoneNumber();
        this.point = customer.getPoint();
        this.grade = customer.getGrade();
        this.lastLoginAt = customer.getLastLoginAt();
    }
}
