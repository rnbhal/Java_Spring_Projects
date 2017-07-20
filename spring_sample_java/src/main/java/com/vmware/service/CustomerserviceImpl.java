package com.vmware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.vmware.model.Customer;
import com.vmware.repository.CustomerRepository;

@Service("customerService")
@Scope("prototype")
public class CustomerserviceImpl implements CustomerService {

	// @Autowired
	private CustomerRepository customerRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vmware.service.CustomerService#findAll()
	 */

	// constructor injection using java configuartion

	public CustomerserviceImpl() {

	}

//	@Autowired
	public CustomerserviceImpl(CustomerRepository customerRepository) {
		System.out.println("Using constructor injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Using Setter Injection");
		this.customerRepository = customerRepository;
	}

}
