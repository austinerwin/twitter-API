package com.cooksys.twitter.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.cooksys.twitter.dto.GreetingDto;
import com.cooksys.twitter.entity.Greeting;

@Mapper(componentModel = "spring")
public interface GreetingMapper {
	@Mappings({ @Mapping(source = "content", target = "content") })
	Greeting fromDto(GreetingDto dto);
	
	@Mappings({ @Mapping(source = "content", target = "content") })
	GreetingDto toDto(Greeting dto);

}
