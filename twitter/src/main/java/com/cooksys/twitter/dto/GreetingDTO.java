package com.cooksys.twitter.dto;

public class GreetingDTO {
	private String content;
	
	public GreetingDTO(String content) {
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
