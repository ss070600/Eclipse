package com.anno.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int add(Customer customer) {
		int rows = 0;
		String insertQuery = "insert into customer values(?,?)";
		rows = jdbcTemplate.update(insertQuery, customer.getId(), customer.getName());
		return rows;
	}

	@Override
	public int updateName(int id, String name) {
		int rows = 0;
		String insertQuery = "update customer set name =? where id = ?";
		rows = jdbcTemplate.update(insertQuery, name, id);
		return rows;
	}

	@Override
	public int delete(int id) {
		int rows = 0;
		String insertQuery = "delete from customer where id = ?";
		rows = jdbcTemplate.update(insertQuery, id);
		return rows;
	}

}
