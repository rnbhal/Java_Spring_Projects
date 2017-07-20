package com.vmware.service;

import java.util.List;

import com.vmware.model.Customer;
import com.vmware.repository.CustomerRepository;

public class CustomerserviceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	/* (non-Javadoc)
	 * @see com.vmware.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void CustomerserviceImpl() {
		
	}

	public CustomerserviceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
