package com.nacre.ofd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.nacre.ofd.bo.DeleteItemsBO;
import com.nacre.ofd.daoI.deleteDAOI;
import com.nacre.ofd.util.DBConnection;

public class DeleteItemsDAO implements deleteDAOI{
	@Override
	public int deleteData(DeleteItemsBO deleteItemsBO) {
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		int itemID = deleteItemsBO.getItemID();
		//DataBase Logic
		try {
			con = DBConnection.getDBConnection();
			if(con != null) {
				ps = con.prepareStatement("delete from tab_items where iid = ?");
				ps.setDouble(1, itemID);
				ps.executeUpdate();
			}
			con.commit();
			con.close();
			return count;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
