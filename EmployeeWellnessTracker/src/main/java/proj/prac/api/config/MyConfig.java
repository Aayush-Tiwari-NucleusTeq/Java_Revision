package proj.prac.api.config;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MyConfig {

	@PostConstruct
	public void postTest() {
		System.out.println("This is just only for the testing the post construct annotation");
	}
}
