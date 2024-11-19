package com.itschool.ticket.service;

import com.itschool.ticket.domain.User;
import com.itschool.ticket.network.Header;
import com.itschool.ticket.network.request.UserRequest;
import com.itschool.ticket.network.response.UserResponse;
import com.itschool.ticket.service.base.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService extends BaseService<UserRequest, UserResponse, User> {
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public Header<List<UserResponse>> getPaginationedList(Pageable pageable) {
        return null;
    }

    @Override
    protected UserResponse response(User user) {
        return null;
    }

    @Override
    public Header<UserResponse> create(Header<UserRequest> request){
        UserRequest userRequest = request.getData();

        User user = User.builder()
                .email(userRequest.getEmail())
                .password(bCryptPasswordEncoder.encode(userRequest.getPassword()))
                .name(userRequest.getName())
                .phoneNumber(userRequest.getPhoneNumber())
                .build();

        baseRepository.save(user);
        return Header.OK(response(user));
    }

    @Override
    public Header<UserResponse> read(Header<UserRequest> request) {
        return null;
    }

    @Override
    public Header<UserResponse> update(Long id, Header<UserRequest> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }
}
