package com.nucleus.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nucleus.model.Customer;
import com.nucleus.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map) {
		Customer customer = new Customer();
		map.put("customer", customer);
		map.put("customerList", customerService.getAllCustomer());
		return "customer";
	}

	@RequestMapping(value = "/customer.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute Customer customer, BindingResult result, @RequestParam String action,
			Map<String, Object> map) {
		Customer customerResult = new Customer();
		switch (action.toLowerCase()) {
		case "add":
			customerService.add(customer);
			customerResult = customer;
			break;

		case "update":
			customerService.update(customer);
			customerResult = customer;
			break;

		case "delete":
			customerService.delete(customer.getCustomerCode());
			customerResult = new Customer();
			break;
		
		case "search":
			Customer searchedCustomer = customerService.getCustomer(customer.getCustomerCode());
			customerResult = searchedCustomer != null ? searchedCustomer : new Customer();
			break;

		}
		map.put("customer", customerResult);
		map.put("customerList", customerService.getAllCustomer());
		return "customer";
	}
}
