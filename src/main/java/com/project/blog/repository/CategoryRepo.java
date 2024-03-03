package com.project.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.blog.model.Category;
@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
}
