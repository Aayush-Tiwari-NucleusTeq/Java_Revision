package dev.work.prac.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecomm")
public class HomeController {

	@GetMapping
	public String index() {
		return "I am first index method";
	}
	
	@PostMapping
	public ResponseEntity<?> postMethod() {
		return ResponseEntity.ok("The work is done");
	}
}
