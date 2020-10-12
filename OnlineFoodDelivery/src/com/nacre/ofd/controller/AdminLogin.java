package com.nacre.ofd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.ofd.delegates.AdminLoginDelegates;
import com.nacre.ofd.vo.AdminLoginVO;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AdminLoginVO adminLoginVO = null;
		AdminLoginDelegates adminLoginDelegates = null;
		boolean flag = false;
		
		//Accepting the values from the browser in the string format.
		String uname = request.getParameter("uname");
		String pswd = request.getParameter("pswd");
		String mobno = request.getParameter("mobno");
		
		
		//Encapsulating the variable values(VO)
		adminLoginVO = new AdminLoginVO();
		adminLoginVO.setUname(uname);
		adminLoginVO.setPswd(pswd);
		adminLoginVO.setMobno(mobno);
		
		//passing the variable values to the next level to perform the operations according to the rules.
		adminLoginDelegates = new AdminLoginDelegates();
		flag = adminLoginDelegates.parsingVariables(adminLoginVO);
		if(flag == true) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("pswd", pswd);
			session.setAttribute("mobno", mobno);
			response.sendRedirect("AdminHomePage.jsp");
		}
		else {
			response.sendRedirect("detailswrong.jsp");
		}
	}

}
