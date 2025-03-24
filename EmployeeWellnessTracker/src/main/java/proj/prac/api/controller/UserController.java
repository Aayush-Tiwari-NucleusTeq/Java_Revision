package proj.prac.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proj.prac.api.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	public UserService userService;

	@GetMapping("/manager/{managerId}")
	public ResponseEntity<?> getUsersByManagerId(@PathVariable("managerId") int managerId){
		return ResponseEntity.ok(this.userService.getAllUsersByManagerId(managerId));
	}
	
	@GetMapping
	public ResponseEntity<?> getAllUsers(){
		return ResponseEntity.ok(this.userService.getAllUsers());
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<?> getSingleUser(@PathVariable("userId") int userId){
		return ResponseEntity.ok(this.userService.getSingleUser(userId));
	}
}
