<!doctype html>
<html>
	<head>
		<title>SEARCH PAGE</title>
		<link rel = "stylesheet" href = "navbar.css">
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> <!--apply navigationbar-->
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
		<link rel = "stylesheet" href = "search.css">
		<script type = "text/javascript" src = "search.js"></script>
		<style>
			body {
				background : url('images/img.jpg') no-repeat center center fixed;
			}
			
		</style>	
	</head>
	<body>
		<nav class = "navbar navbar-inverse">
			<div class = "container-fluid">
				<ul class = "nav navbar-nav">
					<li><a href = "CustomerHomePage.jsp" ><i class = "fa fa-home">HOME</i></a></li>
					<li><a href = "search.jsp"><i class = "fa fa-search">SEARCH</i></a></li>
					<li><a href = "cart.jsp"><i class = "fa fa-shopping-cart">CART</i></a></li>
					<li><a href = "profile.jsp"><i class = "fa fa-user">PROFILE</i></a></li>
				</ul>
				<ul class = "nav navbar-nav navbar-right">
					<li><a href = "#"><i class = "fa fa-sign-out">LOGOUT</i></a></li>
				</ul>
		</div>
		</nav>
		<div class = "boxcontainer">
			<table class = "elementscontainer">
				<tr>
					<td><input type = "text" id = "myInput" onkeyup = "myFunction()" placeholder = "search for resturant or food item" class = "search"></td>
					<td><a href = "#"><i class = "fa fa-search"></a></td>
				</tr>
			</table>
		</div>
		<center>
		<table id = "myTable">
			<thead>
			<tr class = "header">
				<th style = "width : 15%">Item Id</th>
				<th style = "width : 25%">Item Name</th>
				<th style = "width : 30%">Restaurant Name</th>
				<th style = "width : 10%">Price</th>
				<th style = "width : 35%">Add To Cart</th>
			</tr>
			</thead>
			
		</table>
		</center>
	</body>
</html>