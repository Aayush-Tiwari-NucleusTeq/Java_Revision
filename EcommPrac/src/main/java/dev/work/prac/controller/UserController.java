package dev.work.prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.work.prac.entities.User;
import dev.work.prac.services.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<?> getUsers(){
		return ResponseEntity.ok(this.userService.getUsers());
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<?> getUser(@PathVariable("userId") int userId){
		return ResponseEntity.ok(this.userService.getUser(userId));
	}
	
	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody User user){
		return ResponseEntity.ok(this.userService.saveUser(user));
	}
	
	@PostMapping
	public ResponseEntity<?> updateUser(@RequestBody User user){
		return ResponseEntity.ok(this.userService.saveUser(user));
	}
	
}
