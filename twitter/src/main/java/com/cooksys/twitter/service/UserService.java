package com.cooksys.twitter.service;

import com.cooksys.twitter.dto.UserDto;
import com.cooksys.twitter.mapstruct.UserMapper;
import com.cooksys.twitter.repository.UserRepository;

public class UserService {
	
	private UserRepository userRepo;
	private UserMapper userMapper;
	
	public boolean create(UserDto userDto) {
		userRepo.save(userMapper.fromDto(userDto));
		return true;
	}

}
