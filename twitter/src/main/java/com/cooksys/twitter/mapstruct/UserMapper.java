package com.cooksys.twitter.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.cooksys.twitter.dto.UserDto;
import com.cooksys.twitter.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	User fromDto(UserDto dto);
	
	UserDto toDto(User user);	
	
}