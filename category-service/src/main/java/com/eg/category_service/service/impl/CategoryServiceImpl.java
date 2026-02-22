package com.eg.category_service.service.impl;

import com.eg.category_service.modal.Category;
import com.eg.category_service.payload.dto.SalonDTO;
import com.eg.category_service.repository.CategoryRepository;
import com.eg.category_service.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    @Override
    public Category saveCategory(Category category, SalonDTO salonDTO) {
        Category newCategory = new Category();
        newCategory.setName(category.getName());
        newCategory.setSalonId(salonDTO.getId());
        newCategory.setImage(category.getImage());
        return categoryRepository.save(newCategory);
    }

    @Override
    public Set<Category> getAllCategoriesBySalon(Long id) {
        return categoryRepository.findSalonById(id);
    }

    @Override
    public Category getCategoryById(Long id) throws Exception {
        Category category = categoryRepository.findById(id).orElse(null);

        if (category == null) {
            throw new Exception("category not exist with ID");
        }
        return category;
    }

    @Override
    public Category deleteCategoryById(Long id, Long salonId) throws Exception {
        Category category = getCategoryById(id);
        if (!category.getSalonId().equals(salonId)) {
            throw new Exception("no permission to delete");
        }
        categoryRepository.deleteById(id);
        return category;
    }
}
