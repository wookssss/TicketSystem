package com.itschool.ticket.domain;

import jakarta.persistence.*;
import lombok.Builder;

public class Stadium {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    @Builder
    public Stadium(String name, Team team){
        this.name = name;
        this.team = team;
    }
}
