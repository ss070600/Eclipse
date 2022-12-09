package com.anno.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImplNamedParameter implements CustomerDAO {

	@Autowired
	NamedParameterJdbcTemplate namedTemplate;

	@Override
	public int add(Customer customer) {
		int rows = 0;
		String insertQuery = "insert into customer values(:id,:name)";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", customer.getId());
		params.put("name", customer.getName());
		rows = namedTemplate.update(insertQuery, params);
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
