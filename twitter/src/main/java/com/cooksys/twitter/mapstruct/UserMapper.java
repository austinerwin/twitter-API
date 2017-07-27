package com.cooksys.twitter.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.cooksys.twitter.dto.UserDto;
import com.cooksys.twitter.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
	@Mappings({})
	User fromDto(UserDto dto);
	
	@Mappings({})
	UserDto toDto(User user);	

}