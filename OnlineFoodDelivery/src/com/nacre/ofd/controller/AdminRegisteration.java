package com.nacre.ofd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.ofd.delegates.AdminRegDelegates;
import com.nacre.ofd.vo.AdminRegVO;
@WebServlet("/loginform")
public class AdminRegisteration extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		AdminRegVO adminRegVO = null;
		AdminRegDelegates rd = null;
		boolean flag = false;
		
		//Accepting the values from the browser in the string format.
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String confirmpass = request.getParameter("pass1");
		String email = request.getParameter("email");
		String gen = request.getParameter("gender");
		String housenum = request.getParameter("address");
		String roadname = request.getParameter("address1");
		String city = request.getParameter("location");
		String state = request.getParameter("location1");
		String pinnum = request.getParameter("pincode-number");
		String mobno = request.getParameter("mob");
		
		//Encapsulating the variable values(VO)
		adminRegVO = new AdminRegVO();
		adminRegVO.setFname(fname);
		adminRegVO.setLname(lname);
		adminRegVO.setUname(uname);
		adminRegVO.setPass(pass);
		adminRegVO.setConfirmpass(confirmpass);
		adminRegVO.setEmail(email);
		adminRegVO.setGen(gen);
		adminRegVO.setMobno(mobno);
		
		
		//passing the variable values to the next level to perform the operations according to the rules.
		rd = new AdminRegDelegates();
		flag = rd.parsingVariables(adminRegVO);
		

	}

}
