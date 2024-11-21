package com.itschool.ticket.network.request;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CustomerRequest {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private Integer point;
    private String grade;
    private LocalDateTime lastLoginAt;
}
