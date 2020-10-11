package com.nacre.ofd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.ofd.delegates.CustomerRegDelegates;
import com.nacre.ofd.vo.CustomerRegVO;

@WebServlet("/CustomerReg")
public class CustomerReg extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		CustomerRegVO customerRegVO = null;
		CustomerRegDelegates customerRegDelegates = null;
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
		customerRegVO = new CustomerRegVO();
		customerRegVO.setFname(fname);
		customerRegVO.setLname(lname);
		customerRegVO.setUname(uname);
		customerRegVO.setPswd(pswd);
		customerRegVO.setPswd1(pswd1);
		customerRegVO.setEmail(email);
		customerRegVO.setMobno(mobno);
		customerRegVO.setDob(dob);
		customerRegVO.setGen(gen);
		customerRegVO.setCountry(country);
		customerRegVO.setState(state);
		customerRegVO.setHno(hno);
		customerRegVO.setRname(rname);
		customerRegVO.setCity(city);
		customerRegVO.setPincode(pincode);
		
		//passing the variable values to the next level to perform the operations according to the rules.
		customerRegDelegates = new CustomerRegDelegates();
		flag = customerRegDelegates.parsingVariables(customerRegVO);
		
		if(flag == true) {
			
			response.sendRedirect("CustomerLogin.jsp");
		}
		else {
			response.sendRedirect("welcomePage.jsp");
		}

	}


}
