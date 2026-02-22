package com.eg.category_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eg.category_service.modal.Category;

import java.util.Set;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Set<Category> findSalonById(Long salonId);
}

