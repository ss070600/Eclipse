package Project1;

interface IOInterface {
	void getAllEmployees();

	void getEmployeeById(int id) throws InvalidEmployeeException;

	void addEmployee(Employee employee);

	void updateEmployee(int id, Employee employee) throws InvalidEmployeeException;

	void deleteEmployee(int id) throws InvalidEmployeeException;

}
