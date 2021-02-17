package com.goodstransporter.dto;

public class Transporter {
	private int transporterId;
	private String email;
	private String mobileNo;
	private String password;
	private String name;
	private String gender;
	private String address;
	private String type;
	public Transporter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTransporterId() {
		return transporterId;
	}
	public void setTransporterId(int transporterId) {
		this.transporterId = transporterId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
