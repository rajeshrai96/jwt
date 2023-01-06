package com.exatip.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exatip.constenum.AuthoritiesConstant;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}

	@GetMapping("/user")
	@Secured({ AuthoritiesConstant.ADMIN, AuthoritiesConstant.MODERATOR, AuthoritiesConstant.USER })
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/mod")
	@Secured({ AuthoritiesConstant.MODERATOR })
	public String moderatorAccess() {
		return "Moderator Board.";
	}

	@GetMapping("/admin")
	@Secured({ AuthoritiesConstant.ADMIN })
	public String adminAccess() {
		return "Admin Board.";
	}
}
