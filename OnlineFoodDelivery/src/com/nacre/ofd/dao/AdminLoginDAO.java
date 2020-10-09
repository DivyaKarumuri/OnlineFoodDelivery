package com.nacre.ofd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.nacre.ofd.bo.AdminLoginBO;
import com.nacre.ofd.daoI.loginDAOI;
import com.nacre.ofd.util.DBConnection;

public class AdminLoginDAO implements loginDAOI{
	@Override
	public int insertData(AdminLoginBO adminLoginBO) {
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
					if(rs.getString(3).equals(adminLoginBO.getUname()) && rs.getString(4).equals(adminLoginBO.getPswd()) && rs.getLong(14) == adminLoginBO.getMobno()) {
						ps = con.prepareStatement("insert into tab_login values(?,?,?)");
						ps.setString(1, adminLoginBO.getUname());
						ps.setString(2, adminLoginBO.getPswd());
						ps.setLong(3, adminLoginBO.getMobno());
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
