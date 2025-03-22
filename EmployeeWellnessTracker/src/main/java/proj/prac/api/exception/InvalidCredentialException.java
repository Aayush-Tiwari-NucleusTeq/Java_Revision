package proj.prac.api.exception;

@SuppressWarnings("serial")
public class InvalidCredentialException extends RuntimeException {

	public InvalidCredentialException() {
		super();
	}
	
	public InvalidCredentialException(String message) {
		super(message);
	}
}
