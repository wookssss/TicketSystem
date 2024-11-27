package com.itschool.ticket.repository;

import com.itschool.ticket.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
