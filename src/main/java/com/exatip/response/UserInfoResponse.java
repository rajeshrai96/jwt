package com.exatip.response;

import java.util.List;

public class UserInfoResponse {
	private Long id;
	private String username;
	private String email;
	private List<String> roles;

	public UserInfoResponse() {

	}

	public UserInfoResponse(Long id, String username, String email, List<String> role) {

		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "UserInfoResponse [id=" + id + ", username=" + username + ", email=" + email + ", role=" + roles + "]";
	}

}
