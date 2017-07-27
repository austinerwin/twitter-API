package com.cooksys.twitter.dto;

public class GreetingDto {
	private String content;
	
	public GreetingDto(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
