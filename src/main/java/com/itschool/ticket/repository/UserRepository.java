package com.itschool.ticket.repository;

import com.itschool.ticket.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
