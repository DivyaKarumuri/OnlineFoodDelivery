<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Message Page</title>
	<link rel = "stylesheet" href = "navbar.css">
	<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> <!--apply navigationbar-->
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
	<style>
			body {
				background : url('images/message.jpg') no-repeat center center fixed;
			}
		</style>	
</head>
<body>
	<%
			if(session.getAttribute("uname") == null || session.getAttribute("pswd") == null || session.getAttribute("mobno") == null) {
				response.sendRedirect("AdminLogin.jsp");
			}
		%>
	<nav class = "navbar navbar-inverse">
			<div class = "container-fluid">
				<ul class = "nav navbar-nav">
					<li><a href = "CustomerHomePage.jsp" ><i class = "fa fa-home">HOME</i></a></li>
					<li><a href = "search.jsp"><i class = "fa fa-search">SEARCH</i></a></li>
					<li><a href = "cart.jsp"><i class = "fa fa-shopping-cart">CART</i></a></li>
					<li><a href = "profile.jsp"><i class = "fa fa-user">PROFILE</i></a></li>
				</ul>
				<ul class = "nav navbar-nav navbar-right">
					<li><a href = "#">
						<form action = "CustomerLogout">
							<button type = "submit" value = "LOGOUT"><i class = "fa fa-sign-out">LOGOUT</i></button>
						</form>
					</a></li>
				</ul>
		</div>
		</nav>
</body>
</html>