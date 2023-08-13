package com.tm.ticketmanagementservice.repositories;

import com.tm.ticketmanagementservice.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
