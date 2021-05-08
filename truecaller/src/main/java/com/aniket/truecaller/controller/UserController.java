package com.aniket.truecaller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniket.truecaller.userRepo;
import com.aniket.truecaller.model.users;

@RestController
public class UserController {
	@Autowired
	private userRepo repo;
	
	@GetMapping("/users")
	public List<users> getusers() {
		return repo.findAll();
	}
}

