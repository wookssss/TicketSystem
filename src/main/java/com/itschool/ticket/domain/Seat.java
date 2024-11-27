package com.itschool.ticket.domain;

import com.itschool.ticket.domain.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Seat extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(nullable = false)
    private String seatGrade;

    @Column(nullable = false)
    private Integer price;

    @ManyToOne
    @JoinColumn(name ="stadium_id",nullable = false)
    private Stadium stadium;

    @Builder
    public Seat(String seatGrade, Integer price, Stadium stadium){
        this.seatGrade = seatGrade;
        this.price = price;
        this.stadium = stadium;
    }
}
