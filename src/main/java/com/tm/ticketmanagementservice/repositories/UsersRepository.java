package com.tm.ticketmanagementservice.repositories;

import com.tm.ticketmanagementservice.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,Long> {
    Optional<Users> findByUsername(String username);
}
