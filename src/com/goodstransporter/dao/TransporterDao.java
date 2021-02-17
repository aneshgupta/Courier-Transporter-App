package com.goodstransporter.dao;

import com.goodstransporter.dto.Transporter;

public interface TransporterDao {
	
	void addTransporter(Transporter trans);
	boolean login(Transporter trans);
	void updateProfile(Transporter trans);
}
