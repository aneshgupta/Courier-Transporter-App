package com.goodstransporter.dao;

import com.goodstransporter.dto.Customer;

public interface CustomerDao {
	void addCustomer(Customer customer);
	boolean login(Customer customer);
	void updateProfile(Customer customer);
}
