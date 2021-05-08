package com.aniket.truecaller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping("/users")
	public String addUser(@RequestBody users u1) {
		repo.save(u1);
		return "Successfully added";
	}
	@GetMapping("/users/id/{id}")
	public Optional<users> getuserbyID(@PathVariable int id) {
		
		return repo.findById(id);
	}
//	@GetMapping("/users/phone/{phone}")
//	public Optional<users> getuserbyphone(@PathVariable String phone) {
//		
////		return repo.findBy(phone);
//	}
}

