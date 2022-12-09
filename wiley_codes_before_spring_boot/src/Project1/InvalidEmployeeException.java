package Project1;

class InvalidEmployeeException extends Exception{

	public InvalidEmployeeException() {
		super("ID not found...");
	}
}
