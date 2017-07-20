package com.vmware.repository;

import java.util.ArrayList;
import java.util.List;
import com.vmware.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see com.vmware.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List <Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setFirstname("Rohit");
		
		customer.setLastname("Bhal");
		
		customers.add(customer);
		
		return customers;
		
	}

}
