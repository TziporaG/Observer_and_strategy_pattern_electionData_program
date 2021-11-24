package assignment5_electionStats_GutmannNierman;

public class InvalidStateException extends RuntimeException {
	
	public InvalidStateException() {
		
		super("Invalid U.S State name.");
	}
	
	public InvalidStateException(String message) {
		
		super(message);
	}
}