package com.goodstransporter.dto;

public class BookingInterest {
	private int bookingInterestId;
	private int transporterId;
	private int bookingId;
	private float amount;
	private String mobileNo;
	private String transporterFullName;
	
	public BookingInterest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookingInterestId() {
		return bookingInterestId;
	}

	public void setBookingInterestId(int bookingInterestId) {
		this.bookingInterestId = bookingInterestId;
	}

	public int getTransporterId() {
		return transporterId;
	}

	public void setTransporterId(int transporterId) {
		this.transporterId = transporterId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getTransporterFullName() {
		return transporterFullName;
	}

	public void setTransporterFullName(String transporterFullName) {
		this.transporterFullName = transporterFullName;
	}

}
