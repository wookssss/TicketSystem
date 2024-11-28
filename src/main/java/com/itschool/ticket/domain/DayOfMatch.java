package com.itschool.ticket.domain;

import com.itschool.ticket.domain.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
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
    @JoinColumn(name = "team_stadium_id", nullable = false)
    private TeamStadium teamStadium;

    @ManyToOne
    @JoinColumn(name = "away_team_id",nullable = false)
    private Team awayTeam;
}
