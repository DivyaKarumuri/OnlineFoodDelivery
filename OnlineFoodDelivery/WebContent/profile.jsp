<!doctype html>
<html>
	<head>
		<title>PROFILE PAGE</title>
		<link rel = "stylesheet" href = "navbar.css">
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> <!--apply navigationbar-->
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
		
	</head>
	<body>
		<%
			if(session.getAttribute("uname") == null || session.getAttribute("pswd") == null || session.getAttribute("mobno") == null) {
				response.sendRedirect("CustomerLogin.jsp");
			}
		%>
		<nav class = "navbar navbar-inverse">
			<div class = "container-fluid">
				<ul class = "nav navbar-nav">
					<li><a href = "CustomerHomePage.jsp" ><i class = "fa fa-home">HOME</i></a></li>
					<li><a href = "searchHome.jsp"><i class = "fa fa-search">SEARCH</i></a></li>
					<!--  <li><a href = "cart.jsp"><i class = "fa fa-shopping-cart">CART</i></a></li>-->
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
		<center>
			<table style = "font-size : 2em;" border = "1">
				<tr><th> &nbsp USER NAME &nbsp</th><td> &nbsp<%= session.getAttribute("uname")%> &nbsp </td></tr>
				<tr><th> &nbsp PASSWORD &nbsp</th><td> &nbsp<%= session.getAttribute("pswd")%> &nbsp</td></tr>
				<tr><th> &nbsp MOBLIE NUMBER &nbsp</th><td> &nbsp<%= session.getAttribute("mobno")%> &nbsp </td></tr>
			</table>
		</center>
	</body>
</html>