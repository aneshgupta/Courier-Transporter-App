package com.goodstransporter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.goodstransporter.conn.MyConn;
import com.goodstransporter.dto.BookingInterest;

public class BookingInterestDaoImple implements BookingInterestDao {
	private MyConn myConn;
	@Override
	public void add(BookingInterest bookingInterest) {
		myConn = new MyConn();
		try {
			Connection con = myConn.getConn();
			String query = "insert into booking_interest(transporter_id,booking_id,amount) values(?, ?, ?)";
			PreparedStatement s = con.prepareStatement(query);
			s.setInt(1, bookingInterest.getTransporterId());
			s.setInt(2, bookingInterest.getBookingId());
			s.setFloat(3, bookingInterest.getAmount());
			int  i =s.executeUpdate();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
