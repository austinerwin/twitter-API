package com.cooksys.twitter.controller;

import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletResponse;

import com.cooksys.twitter.entity.*;
import com.cooksys.twitter.service.GreetingService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private GreetingService greetingService;

    private static final String template = "Heeello, %s!";
    private Integer id;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(id,
                            String.format(template, name));
    }
    
    @PostMapping("/greeting")
	public void create(@RequestBody Greeting greeting, HttpServletResponse response) {
		if(greetingService.create(greeting))
			response.setStatus(HttpServletResponse.SC_CREATED);
		else
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	}
}