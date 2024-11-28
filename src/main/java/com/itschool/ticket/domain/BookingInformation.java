package com.itschool.ticket.domain;

import com.itschool.ticket.domain.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.*;

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
    private Long totalNumber;

    @Column(nullable = false)
    private Long totalAmount;

    @Column(nullable = false)
    private String receiveMethod;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="day_of_match_id", nullable = false)
    private DayOfMatch dayOfMatch;
}
