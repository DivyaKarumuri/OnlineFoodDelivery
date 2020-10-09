package com.nacre.ofd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.nacre.ofd.bo.AdminRegBO;
import com.nacre.ofd.daoI.registerDao;
import com.nacre.ofd.util.DBConnection;

public class AdminRegDAO implements registerDao{

	@Override
	public int insertData(AdminRegBO adminRegBO) {
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		
		//DataBase Logic
		try {
			con = DBConnection.getDBConnection();
			if(con != null) {
				ps = con.prepareStatement("insert into tab_register values(?,?,?,?,?,?,?,?)");
				ps.setString(1, adminRegBO.getFname());
				ps.setString(2, adminRegBO.getLname());
				ps.setString(3, adminRegBO.getUname());
				ps.setString(4, adminRegBO.getPass());
				ps.setString(5, adminRegBO.getConfirmpass());
				ps.setString(6, adminRegBO.getEmail());
				ps.setString(7, adminRegBO.getGen());
				ps.setLong(8, adminRegBO.getMobno());
				count = ps.executeUpdate();
				con.commit();
				con.close();
				return count;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
