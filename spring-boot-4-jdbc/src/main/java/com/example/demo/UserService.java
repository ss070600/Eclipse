package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private JdbcTemplate jdbcTemplate;

	public UserService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(User u) {
		String sqlInsert = "insert into users values(?,?,?)";
		int rows = jdbcTemplate.update(sqlInsert, u.getId(), u.getFirstName(), u.getLastName());
		if (rows > 0)
			System.out.println("Data inserted successfully");

	}

	public void delete(int id) {
		String sqlInsert = "delete from users where id = ?";
		int rows = jdbcTemplate.update(sqlInsert, id);
		if (rows > 0)
			System.out.println("Deleted successfully");
	}

	public void updateNameById(int id, User u) {
		String sqlInsert = "update users set firstName = ? , lastName=? where id = ?";
		int rows = jdbcTemplate.update(sqlInsert, u.getFirstName(), u.getLastName(), id);
		if (rows > 0)
			System.out.println("updated successfully");
	}

}
