package com.vmware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vmware.model.Customer;
import com.vmware.repository.CustomerRepository;

@Service("customerService")
public class CustomerserviceImpl implements CustomerService {

//	 @Autowired Member Injection
	private CustomerRepository customerRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vmware.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	
//	@Autowired //setter Injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection instead of member injection");
		this.customerRepository = customerRepository;
	}
	
	@Autowired // Constructor Injection
	public CustomerserviceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println("We are using constructor injection");
	}

}
