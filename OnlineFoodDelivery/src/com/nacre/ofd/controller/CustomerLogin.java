package com.nacre.ofd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.ofd.delegates.CustomerLoginDelegates;
import com.nacre.ofd.vo.CustomerLoginVO;


@WebServlet("/CustomerLogin")
public class CustomerLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerLoginVO customerLoginVO = null;
		CustomerLoginDelegates customerLoginDelegates = null;
		boolean flag = false;
		
		//Accepting the values from the browser in the string format.
		String uname = request.getParameter("uname");
		String pswd = request.getParameter("pswd");
		String mobno = request.getParameter("mobno");
		
		//Encapsulating the variable values(VO)
		customerLoginVO = new CustomerLoginVO();
		customerLoginVO.setUname(uname);
		customerLoginVO.setPswd(pswd);
		customerLoginVO.setMobno(mobno);
		
		
		//passing the variable values to the next level to perform the operations according to the rules.
		customerLoginDelegates = new CustomerLoginDelegates();
		flag = customerLoginDelegates.parsingVariables(customerLoginVO);
		if(flag == true) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("pswd", pswd);
			session.setAttribute("mobno", mobno);
			response.sendRedirect("CustomerHomePage.jsp");
		}
		else {
			response.sendRedirect("wrongdetails.jsp");
		}
	}

}
