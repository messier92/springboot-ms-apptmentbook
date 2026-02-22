package com.eg.category_service.service;

import com.eg.category_service.modal.Category;
import com.eg.category_service.payload.dto.SalonDTO;

import java.util.Set;

public interface CategoryService {

    Category saveCategory(Category category, SalonDTO salonDTO);
    Set<Category> getAllCategoriesBySalon(Long id);
    Category getCategoryById(Long id) throws Exception;
    Category deleteCategoryById(Long id, Long salonId) throws Exception;
}
