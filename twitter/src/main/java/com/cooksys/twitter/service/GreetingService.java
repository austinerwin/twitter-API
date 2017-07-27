package com.cooksys.twitter.service;

import com.cooksys.twitter.entity.Greeting;
import com.cooksys.twitter.repository.GreetingRepository;

public class GreetingService {
	
	private GreetingRepository greetingRepo;
	
	public boolean create(Greeting greeting) {
		greetingRepo.save(greeting);
		return true;
	}
}
