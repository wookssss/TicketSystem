package com.itschool.ticket.domain;

import com.itschool.ticket.domain.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity
public class BookingInformation extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(nullable = false, updatable = false, unique = true)
    private String bookingCode;

    @Column(nullable = false)
    private Integer totalNumber;

    @Column(nullable = false)
    private Integer totalAmount;

    @Column(nullable = false)
    private String receiveMethod;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
}
