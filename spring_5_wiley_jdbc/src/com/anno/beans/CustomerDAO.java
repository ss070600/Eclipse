package com.anno.beans;

public interface CustomerDAO {
	public int add(Customer customer);

	public int updateName(int id, String name);

	public int delete(int id);
}
