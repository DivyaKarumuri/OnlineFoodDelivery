package com.nacre.ofd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.ofd.delegates.AdminRegDelegates;
import com.nacre.ofd.vo.AdminRegVO;
@WebServlet("/AdminRegisteration")
public class AdminRegisteration extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		AdminRegVO adminRegVO = null;
		AdminRegDelegates adminRegDelegates = null;
		boolean flag = false;
		
		//Accepting the values from the browser in the string format.
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String uname = request.getParameter("uname");
		String pswd = request.getParameter("pswd");
		String pswd1 = request.getParameter("pswd1");
		String email = request.getParameter("email");
		String mobno = request.getParameter("mobno");
		String dob = request.getParameter("dob");
		String gen = request.getParameter("gen");
		String country = request.getParameter("country");
		String state = request.getParameter("state");
		String hno = request.getParameter("hno");
		String rname = request.getParameter("rname");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pincode");
		
		//Encapsulating the variable values(VO)
		adminRegVO = new AdminRegVO();
		adminRegVO.setFname(fname);
		adminRegVO.setLname(lname);
		adminRegVO.setUname(uname);
		adminRegVO.setPswd(pswd);
		adminRegVO.setPswd1(pswd1);
		adminRegVO.setEmail(email);
		adminRegVO.setMobno(mobno);
		adminRegVO.setDob(dob);
		adminRegVO.setGen(gen);
		adminRegVO.setCountry(country);
		adminRegVO.setState(state);
		adminRegVO.setHno(hno);
		adminRegVO.setRname(rname);
		adminRegVO.setCity(city);
		adminRegVO.setPincode(pincode);
		System.out.println("I am in controller");
		System.out.println(fname+" "+lname+" "+uname+" "+email+" "+pswd+" "+pswd1+" "+mobno+" "+dob+" "+gen+" "+country+" "+state+" "+hno+" "+rname+" "+city+" "+pincode);
		
		//passing the variable values to the next level to perform the operations according to the rules.
		adminRegDelegates = new AdminRegDelegates();
		flag = adminRegDelegates.parsingVariables(adminRegVO);
		
		if(flag == true) {
			
			response.sendRedirect("AdminLogin.jsp");
		}
		else {
			response.sendRedirect("welcomePage.jsp");
		}

	}

}
