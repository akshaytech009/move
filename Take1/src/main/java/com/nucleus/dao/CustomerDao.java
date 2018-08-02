package com.nucleus.dao;

import com.nucleus.model.Customer;
import com.nucleus.model.User;

import antlr.collections.List;

public interface CustomerDao {

	public void insert(User user);

	public void validate(String userid, String userpass, String role);

	public void addUser(Customer customer);

	Customer getCustomer(String customercode);

	public List getAllCustomer();

	public void updateCustomer(Customer customer);

	public void deleteCustomer(String customercode);
}
