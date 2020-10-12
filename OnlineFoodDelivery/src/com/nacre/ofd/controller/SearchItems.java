/*package com.nacre.ofd.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;
import com.nacre.ofd.util.DBConnection;


@WebServlet("/SearchItems")
public class SearchItems extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iid = Integer.parseInt(request.getParameter("iid"));
		SearchDAO searchDAO = new SearchDAO();
		Connection con = null;
		//DataBase Logic
				try {
					ItemID iid = searchDAO.get(iid);
					request.setAttribute("", arg1);
				} catch(Exception e) {
						e.printStackTrace();
				}
}
*/