package proj.prac.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import proj.prac.api.entities.Users;
import proj.prac.api.in.dto.LoginInDto;
import proj.prac.api.services.UserService;

@RestController
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<Users> registerUser(final @RequestBody Users user){
		Users savedUser = this.userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(final @RequestBody LoginInDto loginInfo){
		Users user = this.userService.getUserByEmailAndPassword(loginInfo.getEmail(), loginInfo.getPassword());
		if(user != null) {			
			return ResponseEntity.status(HttpStatus.OK).body("User is logged in successfully");
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something went wrong");
		}
	}
}
