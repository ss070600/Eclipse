package com.anno.beans;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImplJdbcDaoSupport extends JdbcDaoSupport implements CustomerDAO {

	public CustomerDAOImplJdbcDaoSupport(JdbcTemplate jdbcTemplate) {
		setJdbcTemplate(jdbcTemplate);
	}

	@Override
	public int add(Customer customer) {
		int rows = 0;
		String insertQuery = "insert into customer values(?,?)";
		rows = getJdbcTemplate().update(insertQuery, customer.getId(), customer.getName());
		return rows;
	}

	@Override
	public int updateName(int id, String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
