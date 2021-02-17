package com.goodstransporter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.goodstransporter.conn.MyConn;
import com.goodstransporter.dto.Customer;

public class CustomerDaoImple implements CustomerDao {
	private MyConn myConn;

	@Override
	public void addCustomer(Customer customer) {
		myConn = new MyConn();
		try {
			Connection con = myConn.getConn();
			String query = "insert into customer(email,mobileNo,password) values(?, ?, ?)";
			PreparedStatement s = con.prepareStatement(query);
			s.setString(1, customer.getEmail());
			s.setString(2, customer.getMobileNo());
			s.setString(3, customer.getPassword());
			int  i =s.executeUpdate();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean login(Customer customer) {
		myConn = new MyConn();
		boolean flag =false;
		try {
			Connection con = myConn.getConn();
			String query = "select * from customer where (email=? or mobileNo=?) and password=?";
			PreparedStatement s = con.prepareStatement(query);
			s.setString(1, customer.getEmail());
			s.setString(2, customer.getMobileNo());
			s.setString(3, customer.getPassword());
			ResultSet rs = s.executeQuery();
			if(rs.next()){
				customer.setCustomerID(rs.getInt("customer_Id"));
				customer.setEmail(rs.getString("email"));
				customer.setMobileNo(rs.getString("mobileNo"));;
				customer.setName(rs.getString("Name"));
				customer.setAddress(rs.getString("address"));
				flag = true;
			}
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public void updateProfile(Customer customer) {
		myConn = new MyConn();
		try {
			Connection con = myConn.getConn();
			String query = "update customer set email=?, mobileNo=?, Name=?, address=? where customer_Id=? ";
			PreparedStatement s = con.prepareStatement(query);
			s.setString(1, customer.getEmail());
			s.setString(2, customer.getMobileNo());
			s.setString(3, customer.getName());
			s.setString(4, customer.getAddress());
			s.setInt(5, customer.getCustomerID());
			
			int  i =s.executeUpdate();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}
	

}
