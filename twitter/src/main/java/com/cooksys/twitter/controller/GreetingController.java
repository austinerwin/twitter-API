package com.cooksys.twitter.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.cooksys.soduku.dto.ChairDto;
import com.cooksys.soduku.dto.ChairDtoWithId;
import com.cooksys.twitter.dto.GreetingDto;
import com.cooksys.twitter.entity.*;
import com.cooksys.twitter.service.GreetingService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting")
public class GreetingController {
	
	public GreetingController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	private GreetingService greetingService;
	
	@GetMapping("{id}")
	public GreetingDto getChairById(@PathVariable Integer id) {
		return greetingService.findById(id);
	}

	@PostMapping
	public void buildAChair(@RequestBody ChairDto buildIt, HttpServletResponse response) {
		
		if(greetingService.create(buildIt))
			response.setStatus(HttpServletResponse.SC_CREATED);
		else
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	}
	
}