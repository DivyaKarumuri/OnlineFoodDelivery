<%@page import = "java.sql.DriverManager" %>
<%@page import = "java.sql.Connection" %>
<%@page import = "java.sql.PreparedStatement" %>
<%@page import = "java.sql.ResultSet" %>
<%@page import = "java.sql.Statement" %>

<!DOCTYPE html>
<html>
<head>
	<title>ordering items</title>
</head>
<body>
	<%
			if(session.getAttribute("uname") == null || session.getAttribute("pswd") == null || session.getAttribute("mobno") == null) {
				response.sendRedirect("CustomerLogin.jsp");
			}
		%>
	<% 
		String[] checkItems = request.getParameterValues("check");
		String[] quantity = request.getParameterValues("quantity");
		int flag =0;
		if(checkItems != null) {
			for(int i = 0; i < checkItems.length; i++) {
				try {
					Connection con = null;
					PreparedStatement ps = null;
					Statement st = null;
					String driverName = "com.mysql.jdbc.Driver";
					String url = "jdbc:mysql://localhost:3306/";
					String dbName = "demo";
					String userName = "root";
					String password = "divya";
					Class.forName(driverName);
					con = DriverManager.getConnection(url+dbName,userName,password);
					
					
					if(con != null) {	
						ps = con.prepareStatement("insert into tab_order values(?,?)");
						ps.setInt(1,Integer.parseInt(checkItems[i]));
						ps.setInt(2, Integer.parseInt(quantity[i]));
						flag = ps.executeUpdate();
						
					}
					con.commit();
					con.close();
				} catch(Exception e) {
						e.printStackTrace();
				}
			}	
		}
		if(flag != 0) {
			response.sendRedirect("PaymentDetails.jsp");
		} else {
			response.sendRedirect("search.jsp");
		}
	%>
</body>
</html>