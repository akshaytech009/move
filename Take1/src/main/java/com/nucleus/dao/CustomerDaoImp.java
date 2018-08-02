package com.nucleus.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nucleus.model.Customer;
import com.nucleus.model.User;

import antlr.collections.List;

@Repository
public class CustomerDaoImp implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;

	public void insert(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}

	public void validate(String userid, String userpass, String role) {
		// TODO Auto-generated method stub
		// user login validation

	}

	public void addUser(Customer customer) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(customer);

	}

	public Customer getCustomer(String customercode) {
		// TODO Auto-generated method stub
		return (Customer) sessionFactory.getCurrentSession().get(Customer.class, customercode);
	}

	public List getAllCustomer() {
		// TODO Auto-generated method stub
		return (List) sessionFactory.getCurrentSession().createQuery("from Customer").list();
	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(customer);

	}

	public void deleteCustomer(String customercode) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(customercode);

	}

}
