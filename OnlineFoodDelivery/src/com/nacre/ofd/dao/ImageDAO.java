package com.nacre.ofd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.nacre.ofd.dto.ImageDTO;
import com.nacre.ofd.util.DBConnection;

public class ImageDAO {
	private final String GET_DATA = "select iid,iname,price,deliverycharges,discount from tab_items";
	private final String GET_IMAGE_QUERY = "select upload from tab_items where iid = ?";
	//this can be access by only this class so that it is private
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<ImageDTO> getData() {
		ImageDTO imageDTO = null;
		List<ImageDTO> imageList = new ArrayList<ImageDTO>();
		try {
			con = DBConnection.getDBConnection();
			ps = con.prepareStatement(GET_DATA);
			rs = ps.executeQuery();
			while(rs.next()) {
				imageDTO = new ImageDTO();
				imageDTO.setIid(rs.getString(1));
				imageDTO.setIname(rs.getString(2));
				imageDTO.setPrice(rs.getString(3));
				imageDTO.setDeliverycharges(rs.getString(4));
				imageDTO.setDiscount(rs.getString(5));
				imageList.add(imageDTO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return imageList;
	}
	public byte[] getImage(String iid) {
		byte[] image = null;
		try {
			con = DBConnection.getDBConnection();
			ps = con.prepareStatement(GET_IMAGE_QUERY);
			ps.setString(1, iid);
			rs = ps.executeQuery();
			if(rs.next()) {
				image = rs.getBytes(1);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return image;
	}
}
