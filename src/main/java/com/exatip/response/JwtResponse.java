package com.exatip.response;

public class JwtResponse {

	private String jwtToken;

	public JwtResponse(String jwtToken) {

		this.jwtToken = jwtToken;
	}

	public JwtResponse() {
	}

	public String getMessage() {
		return jwtToken;
	}

	public void setMessage(String jwtToken) {
		this.jwtToken = jwtToken;
	}

}
