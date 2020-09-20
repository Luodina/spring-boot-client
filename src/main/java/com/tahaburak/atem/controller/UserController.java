package com.tahaburak.atem.controller;

import com.tahaburak.atem.model.User;
import com.tahaburak.atem.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by burak on 25.11.2019
 */
@RestController
@RequestMapping("/user")
public class UserController {
	private final IUserService userService;

	public UserController(IUserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "/id/{id}")
	@ResponseBody
	public User getUserById(@PathVariable Long id) {
		// TODO: 25.11.2019 going to implement security features later
		return userService.getUserById(id);
	}
}
