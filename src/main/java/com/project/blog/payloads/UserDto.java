package com.project.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private Integer id;
	@NotEmpty
	private String name;
	@Email(message = "Enter a valid email address")
	private String email;
	@NotEmpty
	@Size(min = 8,max = 15,message = "Password must contain 8 to 15 characters")
	private String password;
	@NotEmpty
	private String about;
}
