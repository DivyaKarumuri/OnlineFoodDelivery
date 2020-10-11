package com.nacre.ofd.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.nacre.ofd.bo.CustomerRegBO;
import com.nacre.ofd.daoI.cusRegDAOI;
import com.nacre.ofd.util.DBConnection;

public class CustomerRegDAO implements cusRegDAOI {
	@Override
	public int insertData(CustomerRegBO customerRegBO) {
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		Date date = Date.valueOf(customerRegBO.getDob());
		//DataBase Logic
		try {
			con = DBConnection.getDBConnection();
			if(con != null) {
				ps = con.prepareStatement("insert into tab_register values(?,?,?, ?,?,?, ?,?,?, ?,?,?, ?,?,?)");
				ps.setString(1, customerRegBO.getFname());
				ps.setString(2, customerRegBO.getLname());
				ps.setString(3, customerRegBO.getUname());
				ps.setString(4,customerRegBO.getEmail());
				ps.setString(5,customerRegBO.getPswd());
				ps.setString(6,customerRegBO.getPswd1());
				ps.setLong(7, customerRegBO.getMobno());
				ps.setDate(8, date);
				ps.setString(9,customerRegBO.getGen());
				ps.setString(10,customerRegBO.getCountry());
				ps.setString(11,customerRegBO.getState());
				ps.setString(12, customerRegBO.getHno());
				ps.setString(13, customerRegBO.getRname());
				ps.setString(14, customerRegBO.getCity());
				ps.setLong(15,customerRegBO.getPincode());
				
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
