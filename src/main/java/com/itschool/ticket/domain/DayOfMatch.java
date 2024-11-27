package com.itschool.ticket.domain;

import com.itschool.ticket.domain.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class DayOfMatch extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime matchStartAt;

    @Column(nullable = false)
    private LocalDateTime bookingStartAt;

    @Column(nullable = false)
    @ColumnDefault("false")
    private Boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "stadium_id", nullable = false)
    private Stadium stadium;

    @ManyToOne
    @JoinColumn(name = "away_team_id",nullable = false)
    private Team awayTeam;

    @Builder
    public DayOfMatch(LocalDateTime matchStartAt, LocalDateTime bookingStartAt,Stadium stadium, Team awayTeam){
        this.matchStartAt = matchStartAt;
        this.bookingStartAt = bookingStartAt;
        this.stadium = stadium;
        this.awayTeam = awayTeam;
    }
}
