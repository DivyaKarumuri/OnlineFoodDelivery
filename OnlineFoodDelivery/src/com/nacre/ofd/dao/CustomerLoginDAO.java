package com.nacre.ofd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.nacre.ofd.bo.CustomerLoginBO;
import com.nacre.ofd.daoI.loginCusDAOI;
import com.nacre.ofd.util.DBConnection;

public class CustomerLoginDAO implements loginCusDAOI{
	@Override
	public int insertData(CustomerLoginBO customerLoginBO) {
		Connection con = null;
		PreparedStatement ps = null;
		Statement stmt = null;
		int count = 0;
		
		//DataBase Logic
		try {
			con = DBConnection.getDBConnection();
			if(con != null) {
				stmt = con.createStatement();
				String SQL = "select * from tab_register";
				ResultSet rs = stmt.executeQuery(SQL);
				while(rs.next()) {
					if(rs.getString(3).equals(customerLoginBO.getUname()) && rs.getString(5).equals(customerLoginBO.getPswd()) && rs.getLong(7) == customerLoginBO.getMobno()) {
						ps = con.prepareStatement("insert into tab_login values(?,?,?)");
						ps.setString(1, customerLoginBO.getUname());
						ps.setString(2, customerLoginBO.getPswd());
						ps.setLong(3, customerLoginBO.getMobno());
						count = ps.executeUpdate();
						return count;
					} 
				}
				
			}
			con.commit();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
