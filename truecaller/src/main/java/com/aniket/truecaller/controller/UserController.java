package com.aniket.truecaller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.aniket.truecaller.userRepo;
import com.aniket.truecaller.model.users;

//@Controller
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
	@GetMapping("/users/phone/{phone}")
	public List<users> getuserbyphone(@PathVariable String phone) {
		
		return repo.findByphone(phone);
	}
	@GetMapping("/users/name/{name}")
	public List<users> getuserbyname(@PathVariable String name) {
		
		return repo.findByname(name);
	}
	@PutMapping("/users")
	public String updateUser(@RequestBody users s1) {
		repo.save(s1);
		return "Successfully added";
	}
}

