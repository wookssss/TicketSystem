package com.itschool.ticket.repository;

import com.itschool.ticket.domain.BookingDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDetailRepository extends JpaRepository<BookingDetail, Long> {
}
