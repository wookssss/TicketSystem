package com.itschool.ticket.repository;

import com.itschool.ticket.domain.BookingInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingInformationRepository extends JpaRepository<BookingInformation, Long> {
}
