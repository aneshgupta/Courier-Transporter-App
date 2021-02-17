package com.goodstransporter.dao;

import java.util.List;

import com.goodstransporter.dto.Booking;

public interface BookingDao {
	void doBooking(Booking booking);
	List<Booking> requestedBooking(String type);
	List<Booking> customerPendingBooking(int customerId);

}
