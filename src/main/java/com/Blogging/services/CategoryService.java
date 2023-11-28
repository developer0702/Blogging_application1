package com.Blogging.services;

import java.util.List;

import com.Blogging.payload.CategoryDto;

public interface CategoryService {
	
	//public modifier is optional to use in interface

	 CategoryDto createCategory(CategoryDto categoryDto);

	 CategoryDto updatecategory(CategoryDto categoryDto, Integer categoryId);

	 CategoryDto getCategory(Integer categoryId);

	 void deleteCategory(Integer categoryId);
	 
	 List<CategoryDto> getAllCategories();

	
	
}
