package com.cooksys.twitter.service;

import org.springframework.stereotype.Service;

import com.cooksys.twitter.dto.UserDto;
import com.cooksys.twitter.entity.User;
import com.cooksys.twitter.mapstruct.UserMapper;
import com.cooksys.twitter.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepo;
	private UserMapper userMapper;
	
	public UserService(UserRepository userRepo, UserMapper userMapper) {
		super();
		this.userRepo = userRepo;
		this.userMapper = userMapper;
	}

	public boolean create(UserDto userDto) {
		User user = userMapper.fromDto(userDto);
		userRepo.save(user);
		return true;
	}

}
