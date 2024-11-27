package com.itschool.ticket.repository;

import com.itschool.ticket.domain.SeatDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatDetailRepository extends JpaRepository<SeatDetail, Long> {
}
