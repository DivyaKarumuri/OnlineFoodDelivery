<!doctype html>
<html>
	<head>
		<title>ONLINE FOOD DELIEVRY HOME PAGE</title>
		<link rel = "stylesheet" href = "navbar.css">
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> <!--apply navigationbar-->
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
		<style>
			body {
				background : url('images/img.jpg') no-repeat center center fixed;
			}
			.col{
				float : left;
				margin-top : 34em;
				margin-left : 3em;
			}
			.col a {
				text-decoration : none;
				font-size : 1.2em;
				color : red;
				text-align : center
			}
			.row{
				clear : both;
			}
			div div a input[type = image] {
				height : 4.5em;
				width : 6em;
			}
		</style>	
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
		<div class = "row">
			<div class = "col">
				<a href = "search.jsp">
				<input type = "image" src = "images/pizza.jpg">
				<figcaption>PIZZA</figcaption></a>
			</div>
			<div class = "col">
				<a href = "search.jsp">
				<input type = "image" src = "images/burger.jpg">
				<figcaption>BURGER</figcaption></a>
			</div>
			<div class = "col">
				<a href = "search.jsp">
				<input type = "image" src = "images/chineses.jpg">
				<figcaption>CHINESES</figcaption></a>
			</div>
			<div class = "col">
				<a href = "search.jsp">
				<input type = "image" src = "images/breakfast.jpg">
				<figcaption>BREAKFAST</figcaption></a>
			</div>
			<div class = "col">
				<a href = "search.jsp">
				<input type = "image" src = "images/briyani.jpg">
				<figcaption>BRIYANI</figcaption></a>
			</div>
			<div class = "col">
				<a href = "search.jsp">
				<input type = "image" src = "images/roti.jpg">
				<figcaption>ROTI</figcaption></a>
			</div>
			<div class = "col">
				<a href = "search.jsp">
				<input type = "image" src = "images/southindiathali.jpg">
				<figcaption>SOUTH THALI</figcaption></a>
			</div>
			<div class = "col">
				<a href = "search.jsp">
				<input type = "image" src = "images/softdrinks.jpg">
				<figcaption>SOFT DRINKS</figcaption></a>
			</div>
			<div class = "col">
				<a href = "search.jsp">
				<input type = "image" src = "images/dessert.jpg">
				<figcaption>DESSERTS</figcaption></a>
			</div>
			<div class = "col">
				<a href = "search.jsp">
				<input type = "image" src = "images/cakes.jpg">
				<figcaption>CAKES</figcaption></a>
			</div>
		</div>
	</body>
</html>
