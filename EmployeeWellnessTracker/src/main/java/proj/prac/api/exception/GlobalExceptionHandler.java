package proj.prac.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InvalidCredentialException.class)
	public ResponseEntity<?> invalidCredentialsException(final InvalidCredentialException obj){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(obj.getMessage());
	}
}
