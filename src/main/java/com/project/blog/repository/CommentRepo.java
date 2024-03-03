package com.project.blog.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.blog.model.Comment;

public interface CommentRepo extends JpaRepository<Comment,Integer>{
	
}
