package com.nucleus.service;

import com.nucleus.model.Customer;

import antlr.collections.List;

public interface CustomerService {
	public void add(Customer customer);
	public void update(Customer customer);
	public void delete(String customercode);
	public Customer getCustomer(String customercode);
	public List getAllCustomer();

}
