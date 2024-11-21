package com.itschool.ticket.service;

import com.itschool.ticket.domain.Customer;
import com.itschool.ticket.network.Header;
import com.itschool.ticket.network.request.CustomerRequest;
import com.itschool.ticket.network.response.CustomerResponse;
import com.itschool.ticket.service.base.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerService extends BaseService<CustomerRequest, CustomerResponse, Customer> {
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public Header<List<CustomerResponse>> getPaginationedList(Pageable pageable) {
        return null;
    }

    @Override
    protected CustomerResponse response(Customer customer) {
        return null;
    }

    @Override
    public Header<CustomerResponse> create(Header<CustomerRequest> request){
        CustomerRequest customerRequest = request.getData();

        Customer customer = Customer.builder()
                .email(customerRequest.getEmail())
                .password(bCryptPasswordEncoder.encode(customerRequest.getPassword()))
                .name(customerRequest.getName())
                .phoneNumber(customerRequest.getPhoneNumber())
                .build();

        baseRepository.save(customer);
        return Header.OK(response(customer));
    }

    @Override
    public Header<CustomerResponse> read(Header<CustomerRequest> request) {
        return null;
    }

    @Override
    public Header<CustomerResponse> update(Long id, Header<CustomerRequest> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }
}
