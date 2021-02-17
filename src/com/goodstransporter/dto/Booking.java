package com.goodstransporter.dto;

public class Booking {
	private int bookingId;
	private String item;
	private float approxWeight;
	private int approxDistance;
	private float amount;
	private String pickUpLocation;
	private String dropLocation;
	private String receivedBy;
	private String bookingDate;
	private String bookingStatus;
	private String bookingCompeletionDate;
	private int transporterId;
	private int customerId;
	private String type;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public float getApproxWeight() {
		return approxWeight;
	}
	public void setApproxWeight(float approxWeight) {
		this.approxWeight = approxWeight;
	}
	public int getApproxDistance() {
		return approxDistance;
	}
	public void setApproxDistance(int approxDistance) {
		this.approxDistance = approxDistance;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getPickUpLocation() {
		return pickUpLocation;
	}
	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public String getReceivedBy() {
		return receivedBy;
	}
	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getBookingCompeletionDate() {
		return bookingCompeletionDate;
	}
	public void setBookingCompeletionDate(String bookingCompeletionDate) {
		this.bookingCompeletionDate = bookingCompeletionDate;
	}
	public int getTransporterId() {
		return transporterId;
	}
	public void setTransporterId(int transporterId) {
		this.transporterId = transporterId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
