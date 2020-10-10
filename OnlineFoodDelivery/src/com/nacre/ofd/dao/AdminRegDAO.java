package com.nacre.ofd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;

import com.nacre.ofd.bo.AdminRegBO;
import com.nacre.ofd.daoI.registerDao;
import com.nacre.ofd.util.DBConnection;

public class AdminRegDAO implements registerDao{

	@Override
	public int insertData(AdminRegBO adminRegBO) {
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		Date date = Date.valueOf(adminRegBO.getDob());
		//DataBase Logic
		try {
			con = DBConnection.getDBConnection();
			if(con != null) {
				ps = con.prepareStatement("insert into tab_register values(?,?,?, ?,?,?, ?,?,?, ?,?,?, ?,?,?)");
				ps.setString(1, adminRegBO.getFname());
				ps.setString(2, adminRegBO.getLname());
				ps.setString(3, adminRegBO.getUname());
				ps.setString(4,adminRegBO.getEmail());
				ps.setString(5,adminRegBO.getPswd());
				ps.setString(6,adminRegBO.getPswd1());
				ps.setLong(7, adminRegBO.getMobno());
				ps.setDate(8, date);
				ps.setString(9,adminRegBO.getGen());
				ps.setString(10,adminRegBO.getCountry());
				ps.setString(11,adminRegBO.getState());
				ps.setString(12, adminRegBO.getHno());
				ps.setString(13, adminRegBO.getRname());
				ps.setString(14, adminRegBO.getCity());
				ps.setLong(15,adminRegBO.getPincode());
				
				count = ps.executeUpdate();
				return count;
			}
			con.commit();
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
