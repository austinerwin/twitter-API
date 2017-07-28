package com.cooksys.twitter.dto;

public class UserDto {
	
	private Integer id;
	private String username;
	private Long joined;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public UserDto() {
		
	}

	public UserDto(Integer id, String username, Long joined, String firstName, String lastName, String email,
			String phone) {
		super();
		this.id = id;
		this.username = username;
		this.joined = joined;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getJoined() {
		return joined;
	}

	public void setJoined(Long joined) {
		this.joined = joined;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
