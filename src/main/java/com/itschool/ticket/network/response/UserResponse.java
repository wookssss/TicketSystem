package com.itschool.ticket.network.response;

import com.itschool.ticket.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserResponse {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private LocalDateTime lastLoginAt;

    public UserResponse(User user){
        this.id = user.getId();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.name = user.getName();
        this.phoneNumber = user.getPhoneNumber();
        this.lastLoginAt = user.getLastLoginAt();
    }
}
