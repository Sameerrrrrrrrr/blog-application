package com.project.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.blog.model.Category;
import com.project.blog.model.Post;
import com.project.blog.model.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	List<Post> findByTitleContaining(String title);
}
