package com.Blogging.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Blogging.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

	
}
