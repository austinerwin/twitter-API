package com.cooksys.twitter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.twitter.entity.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Integer>{
	
	public Greeting getById(Integer id);
	
}
