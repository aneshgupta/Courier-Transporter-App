package com.goodstransporter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.goodstransporter.conn.MyConn;
import com.goodstransporter.dto.Transporter;

public class TransporterDaoImple implements TransporterDao{
	private MyConn myConn;
	@Override
	public void addTransporter(Transporter trans) {
		myConn = new MyConn();
		try {
			Connection con = myConn.getConn();
			String query = "insert into transporter(email,mobileNo,password) values(?, ?, ?)";
			PreparedStatement s = con.prepareStatement(query);
			s.setString(1, trans.getEmail());
			s.setString(2, trans.getMobileNo());
			s.setString(3, trans.getPassword());
			int  i =s.executeUpdate();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean login(Transporter trans) {
		myConn = new MyConn();
		boolean flag =false;
		try {
			Connection con = myConn.getConn();
			String query = "select * from transporter where (email=? or mobileNo=?) and password=?";
			PreparedStatement s = con.prepareStatement(query);
			s.setString(1, trans.getEmail());
			s.setString(2, trans.getMobileNo());
			s.setString(3, trans.getPassword());
			ResultSet rs = s.executeQuery();
			if(rs.next()){
				trans.setTransporterId(rs.getInt("transporter_Id"));
				trans.setEmail(rs.getString("email"));
				trans.setMobileNo(rs.getString("mobileNo"));;
				trans.setName(rs.getString("Name"));
				trans.setGender(rs.getString("gender"));
				trans.setAddress(rs.getString("address"));
				trans.setType(rs.getString("type"));
				flag = true;
			}
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return flag;
		
	}

	@Override
	public void updateProfile(Transporter trans) {
		myConn = new MyConn();
		try {
			Connection con = myConn.getConn();
			String query = "update transporter set email=?, mobileNo=?, Name=?, gender=?, address=?, type=? where transporter_id=? ";
			PreparedStatement s = con.prepareStatement(query);
			s.setString(1, trans.getEmail());
			s.setString(2, trans.getMobileNo());
			s.setString(3, trans.getName());
			s.setString(4, trans.getGender());
			s.setString(5, trans.getAddress());
			s.setString(6, trans.getType());
			s.setInt(7, trans.getTransporterId());
			int  i =s.executeUpdate();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
