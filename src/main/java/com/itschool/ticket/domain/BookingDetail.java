package com.itschool.ticket.domain;

import com.itschool.ticket.domain.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity
public class BookingDetail extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(nullable = false)
    private String bookingStatus;

    @Column(nullable = false)
    private LocalDateTime cancelDeadline;

    @ManyToOne
    @JoinColumn(name="booking_id",nullable = false)
    private BookingInformation bookingInformation;

    @ManyToOne
    @JoinColumn(name="seat_detail_id",nullable = false)
    private SeatDetail seatDetail;
}
