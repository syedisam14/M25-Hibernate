package org.tnsindia.service;

import org.tnsindia.dao.CustomerDao;
import org.tnsindia.dao.CustomerDaoImpl;
import org.tnsindia.entities.Customer;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDao dao;
	
	public CustomerServiceImpl() {
		super();
		dao=new CustomerDaoImpl();
		
	}
	
	@Override
	public void addCustomer(Customer customer) {
		dao.beginTransaction();
		dao.addCustomer(customer);
		dao.commitTransaction();
	}
	//deletion
	@Override
	public void updateCustomer(Customer customer) {
		dao.beginTransaction();
		dao.updateCustomer(customer);		
		dao.commitTransaction();
		
	}
	//Retrieve
	@Override
	public void deleteCustomer(Customer customer) {
		dao.beginTransaction();
		dao.deleteCustomer(customer);	
		dao.commitTransaction();
	}

	@Override
	public Customer getCustomerById(int cust_ID) {
			Customer customer=dao.getCustomerById(cust_ID);
				return customer;
	}
	
	}
