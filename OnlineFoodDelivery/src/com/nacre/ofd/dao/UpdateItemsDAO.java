package com.nacre.ofd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.nacre.ofd.bo.UpdateItemsBO;
import com.nacre.ofd.daoI.updateDAOI;
import com.nacre.ofd.util.DBConnection;

public class UpdateItemsDAO implements updateDAOI{
	@Override
	public int updateData(UpdateItemsBO updateItemsBO) {
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		int itemID = updateItemsBO.getItemID();
		//DataBase Logic
		try {
			con = DBConnection.getDBConnection();
			if(con != null) {
				ps = con.prepareStatement("update tab_items set price = ?, deliverycharges = ?, discount = ? where iid = ?");
				ps.setDouble(1, updateItemsBO.getPrice());
				ps.setInt(2,updateItemsBO.getDeliveryCharges());
				ps.setDouble(3, updateItemsBO.getDiscount());
				ps.setDouble(4, itemID);
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
