package project1Copy;

import java.io.FileNotFoundException;
import java.io.IOException;

interface IOInterface {

	void getAll() throws IOException, ClassNotFoundException;

	void getById(int id) throws IOException, ClassNotFoundException, InvalidEmployeeException;

	void add(Object employee);

	void update(int id, Object employee) throws IOException, ClassNotFoundException, InvalidEmployeeException;

	void delete(int id) throws IOException, ClassNotFoundException, InvalidEmployeeException;

}
