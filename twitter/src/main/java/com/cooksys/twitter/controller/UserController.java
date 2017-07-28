package com.cooksys.twitter.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.twitter.dto.UserDto;
import com.cooksys.twitter.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public List<UserDto> getUsers() {
		return userService.getAll();
	}
	
	@GetMapping("{username}")
	public UserDto getUserByUsername(@PathVariable String username) {
		return userService.getByUsername(username);
	}

	@PostMapping
	public void addUser(@RequestBody UserDto userDto, HttpServletResponse response) {
		if(userService.create(userDto))
			response.setStatus(HttpServletResponse.SC_CREATED);
		else
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	
	
	}

