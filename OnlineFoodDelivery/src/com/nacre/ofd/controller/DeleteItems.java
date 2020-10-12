package com.nacre.ofd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.ofd.delegates.AdminLoginDelegates;
import com.nacre.ofd.delegates.DeleteItemsDelegates;
import com.nacre.ofd.vo.AdminLoginVO;
import com.nacre.ofd.vo.DeleteItemsVO;


@WebServlet("/DeleteItems")
public class DeleteItems extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String itemID = request.getParameter("iid");
		String itemName = request.getParameter("iname");
		String resName = request.getParameter("rname");
		String price = request.getParameter("price");
		if(price == null) {
			price = "0.0";
		} 
		if(resName == null) {
			resName = "null";
		}
		if(itemName == null) {
			itemName = "null";
		}
		
		DeleteItemsVO deleteItemsVO = null;
		DeleteItemsDelegates deleteItemsDelegates = null;
		boolean flag = false;
		
		//Encapsulating the variable values(VO)
		deleteItemsVO = new DeleteItemsVO();
		deleteItemsVO.setItemName(itemName);
		deleteItemsVO.setItemID(itemID);
		deleteItemsVO.setPrice(price);
		deleteItemsVO.setResName(resName);
				
		//passing the variable values to the next level to perform the operations according to the rules.
		deleteItemsDelegates = new DeleteItemsDelegates();
		flag = deleteItemsDelegates.parsingVariables(deleteItemsVO);
		if(flag == false) {
			response.sendRedirect("deleteitem.jsp");
		}
		else {
				response.sendRedirect("AdminHomePage.jsp");
		}
	}
		
}

