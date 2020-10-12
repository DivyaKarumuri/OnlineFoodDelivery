package com.nacre.ofd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.ofd.delegates.*;
import com.nacre.ofd.vo.*;


@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String payment;
		//String upiId = null;
		String cardName;
		String cardNumber;
		String validThru;
		String cvv;
		PaymentVo paymentVo = null;
		PaymentDelegates paymentDel = null;
		boolean flag = false;
				
		payment = request.getParameter("payment");
		//upiId = request.getParameter("payment");
		cardName = request.getParameter("cardholder");
		cardNumber = request.getParameter("cardnumber");
		validThru = request.getParameter("date");
		cvv = request.getParameter("verification");
		
		paymentVo = new PaymentVo();
		
		paymentVo.setPayment(payment);
		//paymentVo.setUpiId(upiId);
		paymentVo.setCardname(cardName);
		paymentVo.setCardnumber(cardNumber);
		paymentVo.setValidThru(validThru);
		paymentVo.setCvv(cvv);
		//System.out.println("controller"+payment+"\t"+cardName+"\t"+cardNumber+"\t"+validThru+"\t"+cvv);
		
		paymentDel = new PaymentDelegates();
		
		flag = paymentDel.parseVariable(paymentVo);
		
		if(flag == true) {
			response.sendRedirect("message.jsp");
		} else {
			response.sendRedirect("cart.jsp");
		}
		
	}
}