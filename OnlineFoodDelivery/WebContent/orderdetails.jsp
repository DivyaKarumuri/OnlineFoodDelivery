<!doctype html>
<html>
	<head>
		<title>Add items</title>
		<link rel = "stylesheet" href = "navbar.css">
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> <!--apply navigationbar-->
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
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
					<li><a href = "AdminHomePage.jsp" ><i class = "fa fa-home">HOME</i></a></li>
					<li><a href = "additem.jsp"><i class = "fa fa-plus">ADD ITEM</i></a></li>
					<li><a href = "deleteitem.jsp"><i class = "fa fa-trash">DELETE ITEM</i></a></li>
					<li><a href = "updateitem.jsp"><i class = "fa fa-pencil">UPDATE ITEM</i></a></li>
				</ul>
				<ul class = "nav navbar-nav navbar-right">
					<li><a href = "orderdetails.jsp"><i class = "fa fa-info-circle">ORDER DETAILS</i></a></li>
					<li><a href = "#">
						<form action = "AdminLogout">
							<button type = "submit" value = "LOGOUT"><i class = "fa fa-sign-out">LOGOUT</i></button>
						</form>
					</a></li>
				</ul>
		</div>
		</nav>
	</body>
</html>