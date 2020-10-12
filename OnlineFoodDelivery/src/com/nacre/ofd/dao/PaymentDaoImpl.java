package com.nacre.ofd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nacre.ofd.bo.PaymentBo;
import com.nacre.ofd.daoI.PaymentIDao;
import com.nacre.ofd.util.DBConnection;

public class PaymentDaoImpl implements PaymentIDao {
	@Override
	public int insert(PaymentBo paymentbo) {
		Connection con = null;
		PreparedStatement pst = null;
		int add = 0;
		con = DBConnection.getDBConnection();
		if (con != null) {
			try {
				//System.out.println("connection"+paymentbo.getPayment()+"\t"+paymentbo.getCardName()+"\t"+paymentbo.getCardNumber()+"\t"+paymentbo.getValidThru()+"\t"+paymentbo.getCvv());
				pst = con.prepareStatement("insert into payment_details values(?,?,?,?,?)");
				pst.setString(1,paymentbo.getPayment());
				//pst.setString(2,paymentbo.getUpiId());
				pst.setString(2,paymentbo.getCardName());
				pst.setLong(3,paymentbo.getCardNumber());
				pst.setString(4, paymentbo.getValidThru());
				pst.setInt(5, paymentbo.getCvv());
				add = pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return add;
	}
}