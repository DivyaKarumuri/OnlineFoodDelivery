package com.nacre.ofd.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.nacre.ofd.util.DBConnection;

@WebServlet("/AddItems")
@MultipartConfig
public class AddItems extends HttpServlet {

	private static final String FILE_PARAMETER = "upload";

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int flag = 0;
		
		//Accepting the values from the browser in the string format.
		int iid = Integer.parseInt(request.getParameter("iid"));
		String itemName = request.getParameter("iname");
		double price = Double.parseDouble(request.getParameter("price"));
		int deliveryCharges = Integer.parseInt(request.getParameter("deliverycharges"));
		double discount = Double.parseDouble(request.getParameter("discount"));
		String resName = request.getParameter("rname");
		Part upload = request.getPart(FILE_PARAMETER);
		InputStream fileContent = upload.getInputStream();
		Connection con = null;
		PreparedStatement ps = null;
		
		//DataBase Logic
		try {
			con = DBConnection.getDBConnection();
			if(con != null) {
				ps = con.prepareStatement("insert into tab_items values(?,?, ?,?, ?,?, ?)");
				ps.setInt(1,iid);
				ps.setString(2, itemName);
				ps.setDouble(3, price);
				ps.setInt(4,deliveryCharges);
				ps.setDouble(5,discount);
				ps.setString(6,resName);
				ps.setBlob(7, fileContent);
						
				flag = ps.executeUpdate();
			}
			con.commit();
			con.close();
		} catch(Exception e) {
				e.printStackTrace();
		}
				
		if(flag == 1) {
			HttpSession session = request.getSession();
			response.sendRedirect("additem.jsp");
		}
		else {
			response.sendRedirect("AdminHomePage.jsp");
		}
	}

}
