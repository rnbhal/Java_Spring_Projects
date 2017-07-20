package com.vmware.repository;

import java.util.List;

import com.vmware.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}