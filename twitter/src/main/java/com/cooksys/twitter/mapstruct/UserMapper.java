package com.cooksys.twitter.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.cooksys.twitter.dto.UserDto;
import com.cooksys.twitter.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
	@Mappings({ @Mapping(source = "username", target = "username") })
	User fromDto(UserDto dto);
	
	@Mappings({ @Mapping(source = "username", target = "username") })
	UserDto toDto(User user);	
	
	/*@Mappings({})
	User fromDto(UserDto dto);
	
	@Mappings({})
	UserDto toDto(User user);	
*/
}