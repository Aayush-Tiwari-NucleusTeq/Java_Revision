package proj.prac.api.in.dto;

import org.springframework.stereotype.Service;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Service
@NoArgsConstructor
@AllArgsConstructor
public class LoginInDto {
	
	@Email
	private String email;
	private String password;
}
