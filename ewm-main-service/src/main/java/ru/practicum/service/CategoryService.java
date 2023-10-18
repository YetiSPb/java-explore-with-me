package ru.practicum.service;

import ru.practicum.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto addCategory(CategoryDto dto);

    void deleteCategory(Integer catId);

    CategoryDto patchCategory(Integer catId, CategoryDto dto);

    List<CategoryDto> searchAllCategories(Integer from, Integer size);

    CategoryDto searchCategoryById(Integer catId);

}
