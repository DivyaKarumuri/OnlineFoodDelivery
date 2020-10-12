package com.nacre.ofd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.ofd.dao.ImageDAO;
import com.nacre.ofd.dto.ImageDTO;

@WebServlet("/ImageViewerController")
public class ImageViewerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		ImageDAO imageDAO = null;
		imageDAO = new ImageDAO();
		List<ImageDTO> list =imageDAO.getData();
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("search.jsp");
		dispatcher.forward(request, response);
	}
}
