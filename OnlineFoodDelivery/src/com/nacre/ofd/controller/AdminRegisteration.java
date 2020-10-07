package com.nacre.ofd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.ofd.delegates.AdminRegDelegates;
import com.nacre.ofd.vo.AdminRegEncapsulation;
@WebServlet("/loginform")
public class AdminRegisteration extends HttpServlet {
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		AdminRegEncapsulation ev = null;
		AdminRegDelegates rd = null;
		boolean flag = false;
		
		//Accepting the values from the browser in the string format.
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String confirmpass = request.getParameter("confirmpass");
		String mobno = request.getParameter("mobno");
		String dob = request.getParameter("dob");
		String gen = request.getParameter("gen");
		
		PrintWriter out = response.getWriter();
		
		//Encapsulating the variable values(VO)
		ev = new AdminRegEncapsulation();
		ev.setFname(fname);
		ev.setLname(lname);
		ev.setEmail(email);
		ev.setPass(pass);
		ev.setConfirmpass(confirmpass);
		ev.setMobno(mobno);
		ev.setDob(dob);
		ev.setGen(gen);
		
		//passing the variable values to the next level to perform the operations according to the rules.
		rd = new AdminRegDelegates();
		flag = rd.parsingVariables(ev);
		
		if(flag == true) {
			out.println("<html><body bgcolor = 'green' align = 'center'><h2>");
			out.println("REGISTRATION SUCEESS..................");
			out.println("</h2></body></html>");
		}
		else {
			int password = ev.getPass().length();
			if(password < 8) {
				out.println("<html><body bgcolor = 'red' align = 'center'><h2>");
				out.println("REGISTRATION FAILS..................DUE TO PASSWORD LENGTH IS LESS THAN 8 CHARACTERS");
				out.println("</h2></body></html>");	
			}
			else {
				out.println("<html><body bgcolor = 'red' align = 'center'><h2>");
				out.println("REGISTRATION FAILS..................");
				out.println("</h2></body></html>");
			}
		}
	}

}
