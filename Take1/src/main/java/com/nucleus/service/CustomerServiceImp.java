package com.nucleus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nucleus.dao.CustomerDao;
import com.nucleus.model.Customer;

import antlr.collections.List;
@Service
public class CustomerServiceImp implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.addUser(customer);
		
	}

	@Transactional
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.updateCustomer(customer);
		
	}

	@Transactional
	public void delete(String customercode) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(customercode);
		
	}

	@Transactional
	public Customer getCustomer(String customercode) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(customercode);
	}

	@Transactional
	public List getAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomer();
	}

}
