package com.itschool.ticket.domain;

import com.itschool.ticket.domain.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Team extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;
}
