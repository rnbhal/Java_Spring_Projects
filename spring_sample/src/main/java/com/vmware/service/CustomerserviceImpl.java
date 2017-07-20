package com.vmware.service;

import java.util.List;

import com.vmware.model.Customer;
import com.vmware.repository.CustomerRepository;
import com.vmware.repository.HibernateCustomerRepositoryImpl;

public class CustomerserviceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.vmware.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
