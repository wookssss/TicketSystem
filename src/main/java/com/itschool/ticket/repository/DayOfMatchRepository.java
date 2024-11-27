package com.itschool.ticket.repository;

import com.itschool.ticket.domain.DayOfMatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayOfMatchRepository extends JpaRepository<DayOfMatch, Long> {
}
