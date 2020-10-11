package com.nacre.ofd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.ofd.delegates.UpdateItemsDelegates;
import com.nacre.ofd.vo.AdminLoginVO;
import com.nacre.ofd.vo.UpdateItemsVO;


@WebServlet("/UpdateItems")
public class UpdateItems extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String itemID = request.getParameter("iid");
		String price = request.getParameter("price");
		String deliveryCharges = request.getParameter("deliverycharges");
		String discount = request.getParameter("discount");
		
		
		UpdateItemsVO updateItemsVO = null;
		UpdateItemsDelegates updateItemsDelegates = null;
		boolean flag = false;
		
		//Encapsulating the variable values(VO)
		updateItemsVO = new UpdateItemsVO();
		updateItemsVO.setDiscount(discount);
		updateItemsVO.setItemID(itemID);
		updateItemsVO.setPrice(price);
		updateItemsVO.setDeliveryCharges(deliveryCharges);
				
		//passing the variable values to the next level to perform the operations according to the rules.
		updateItemsDelegates = new UpdateItemsDelegates();
		flag = updateItemsDelegates.parsingVariables(updateItemsVO);
		if(flag == false) {
				response.sendRedirect("updateitem.jsp");
		}
		else {
				response.sendRedirect("AdminHomePage.jsp");
		}
	}
		
}

