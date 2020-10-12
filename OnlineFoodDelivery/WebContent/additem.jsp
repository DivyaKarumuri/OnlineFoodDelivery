<!doctype html>
<html>
	<head>
		<title>Add items</title>
		<link rel = "stylesheet" href = "navbar.css">
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> <!--apply navigationbar-->
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
		<link rel = "stylesheet" href = "items.css">
		<style>
			body {
				background : url('images/homeimg1.jpg') no-repeat center center fixed;
			}
			.container {
				position : relative;
				margin : 1em 1em 0em 75em;
				width : 30em;
				height : auto;
				background : #dedede;
				border-radius : 0.5em;
	
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
					<li><a href = "AdminHomePage.jsp" ><i class = "fa fa-home">HOME</i></a></li>
					<li><a href = "additem.jsp"><i class = "fa fa-plus">ADD ITEM</i></a></li>
					<li><a href = "deleteitem.jsp"><i class = "fa fa-trash">DELETE ITEM</i></a></li>
					<li><a href = "updateitem.jsp"><i class = "fa fa-pencil">UPDATE ITEM</i></a></li>
				</ul>
				<ul class = "nav navbar-nav navbar-right">
					<!--<li><a href = "orderdetails.jsp"><i class = "fa fa-info-circle">ORDER DETAILS</i></a></li>-->
					<li><a href = "#">
						<form action = "AdminLogout">
							<button type = "submit" value = "LOGOUT"><i class = "fa fa-sign-out">LOGOUT</i></button>
						</form>
					</a></li>
				</ul>
		</div>
		</nav>
		
		<div class = "container">
			<br><label class = "label">ADD ITEM</label>
			<form class = "form" method = "post" name = "login" action = "AddItems" enctype = "multipart/form-data">
				
				<div class = "iid">Item ID</div>
				<input type = "number" name = "iid" id="iid" required = "required">
				
				<div class = "iname">Item Name</div>
				<input type = "text" name = "iname" id="iname" required = "required">
				
				<div class = "price">Price</div>
				<input type = "number" name = "price" id="price" required = "required">
				
				<div class = "deliverycharges">Delivery Charges</div>
				<input type = "number" name = "deliverycharges" id="deliverycharges" required = "required">
				
				<div class = "discount">Discount Amount</div>
				<input type = "number" name = "discount" id="discount" required = "required">
				
				<div class = "rname">Resturant Name</div>
				<input type = "text" name = "rname" id="rname" required = "required"><br><br>
				
				<input type = "file" id="btn" name ="upload" value = "UPLOAD IMAGE">
				
				<button type = "submit" id="btn" name ="add"> ADD </button>
				<button type = "submit" id="btn" name ="btn"><a href = "AdminHomePage.jsp">BACK TO HOME</a></button><br><br>
			</form>
		</div>
	</body>
</html>