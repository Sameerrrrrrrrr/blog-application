package com.project.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.blog.payloads.ApiResponse;
import com.project.blog.payloads.UserDto;
import com.project.blog.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/add")
	public ResponseEntity<UserDto> addUser(@Valid @RequestBody UserDto userDto){
		UserDto addedUserDto=this.userService.createUser(userDto);
		return new ResponseEntity<>(addedUserDto,HttpStatus.CREATED);
	}
	@PutMapping("/update/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,@PathVariable Integer userId){
		UserDto updatedUser=this.userService.updateUser(userDto, userId);
		return ResponseEntity.ok(updatedUser);
	}
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer userId) {
		this.userService.deleteUser(userId);
		return new ResponseEntity(new ApiResponse("User deleted successfully",true),HttpStatus.OK );
	}
	@GetMapping("/get/{userId}")
	public ResponseEntity<UserDto> getUser(@PathVariable Integer userId){
		UserDto user=this.userService.getUserById(userId);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<UserDto>> getAllUsers(){
		List<UserDto> users=this.userService.getAllUsers();
		return ResponseEntity.status(HttpStatus.OK).body(users);
	}
}

