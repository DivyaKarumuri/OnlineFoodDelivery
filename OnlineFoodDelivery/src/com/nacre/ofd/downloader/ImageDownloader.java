package com.nacre.ofd.downloader;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.ofd.dao.ImageDAO;
import com.nacre.ofd.dto.ImageDTO;


@WebServlet("/ImageDownloader")
public class ImageDownloader extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		ImageDAO imageDAO = null;
		ServletOutputStream outputStream = null;
		String iid = request.getParameter("iid");
		imageDAO = new ImageDAO();
		byte[] image = imageDAO.getImage(iid);
		outputStream = response.getOutputStream();
		outputStream.write(image);
		outputStream.close();
	}
}
