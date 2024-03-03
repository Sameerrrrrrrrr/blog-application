package com.project.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.project.blog.model.Category;
import com.project.blog.model.Comment;
import com.project.blog.model.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	private Integer postId;
	private String title;
	private String content;
	private String image;
	private Date postedDate;
	private CategoryDto category;
	private UserDto user;
	private Set<CommentDto> comments=new HashSet<>();
}
