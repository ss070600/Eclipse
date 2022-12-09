package project1Copy;

class InvalidEmployeeException extends Exception{

	public InvalidEmployeeException() {
		super("ID not found...");
	}
}
