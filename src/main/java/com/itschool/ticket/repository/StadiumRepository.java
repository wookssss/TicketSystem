package com.itschool.ticket.repository;

import com.itschool.ticket.domain.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StadiumRepository extends JpaRepository<Stadium, Long> {
}
