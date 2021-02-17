package com.goodstransporter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.goodstransporter.conn.MyConn;
import com.goodstransporter.dto.Booking;

public class BookingDaoImple implements BookingDao {
	private MyConn myConn;
	
	@Override
	public void doBooking(Booking booking) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String bdate = sdf.format(date);
		
		myConn = new MyConn();
		try {
			Connection con = myConn.getConn();
			String query = "insert into booking(item, approx_weight, approx_distance, pick_up_location, drop_location, received_by, booking_date, booking_status, type, customer_id ) values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement s = con.prepareStatement(query);
			s.setString(1, booking.getItem());
			s.setFloat(2, booking.getApproxWeight());
			s.setInt(3, booking.getApproxDistance());
			s.setString(4, booking.getPickUpLocation());
			s.setString(5, booking.getDropLocation());
			s.setString(6, booking.getReceivedBy());
			s.setString(7, bdate);
			s.setString(8, "PENDING");
			s.setString(9, booking.getType());
			s.setInt(10, booking.getCustomerId());
			int  i =s.executeUpdate();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Booking> requestedBooking(String type) {
		myConn = new MyConn();
		List<Booking> blist = new ArrayList<Booking>();
		try {
			Connection con = myConn.getConn();
			String query = "select * from booking where type=? and booking_status=?";
			PreparedStatement s = con.prepareStatement(query);
			s.setString(1, type);
			s.setString(2, "PENDING");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				Booking b = new Booking();
				b.setBookingId(rs.getInt(1));
				b.setItem(rs.getString(2));
				b.setApproxWeight(rs.getFloat(3));
				b.setApproxDistance(rs.getInt(4));
				b.setAmount(rs.getFloat(5));
				b.setPickUpLocation(rs.getString(6));
				b.setDropLocation(rs.getString(7));
				b.setReceivedBy(rs.getString(8));
				b.setBookingDate(rs.getString(9));
				b.setBookingStatus(rs.getString(10));
				b.setBookingCompeletionDate(rs.getString(11));
				b.setTransporterId(rs.getInt(12));
				b.setCustomerId(rs.getInt(13));
				b.setType(rs.getString(14));
				blist.add(b);
			}
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return blist;
	}

	@Override
	public List<Booking> customerPendingBooking(int customerId) {
		myConn = new MyConn();
		List<Booking> blist = new ArrayList<Booking>();
		try {
			Connection con = myConn.getConn();
			String query = "select * from booking where customer_id=? and booking_status=?";
			PreparedStatement s = con.prepareStatement(query);
			s.setInt(1, customerId);
			s.setString(2, "PENDING");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				Booking b = new Booking();
				b.setBookingId(rs.getInt(1));
				b.setItem(rs.getString(2));
				b.setApproxWeight(rs.getFloat(3));
				b.setApproxDistance(rs.getInt(4));
				b.setAmount(rs.getFloat(5));
				b.setPickUpLocation(rs.getString(6));
				b.setDropLocation(rs.getString(7));
				b.setReceivedBy(rs.getString(8));
				b.setBookingDate(rs.getString(9));
				b.setBookingStatus(rs.getString(10));
				b.setBookingCompeletionDate(rs.getString(11));
				b.setTransporterId(rs.getInt(12));
				b.setCustomerId(rs.getInt(13));
				b.setType(rs.getString(14));
				blist.add(b);
			}
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return blist;
	}
	

}
