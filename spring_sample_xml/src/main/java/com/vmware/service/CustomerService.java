package com.vmware.service;

import java.util.List;

import com.vmware.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}