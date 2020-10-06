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
				margin : 6em 1em 0em 75em;
				width : 30em;
				height : auto;
				background : #dedede;
				border-radius : 0.5em;
	
			}
		</style>		
	</head>
	<body>
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
					<li><a href = "#"><i class = "fa fa-sign-out">LOGOUT</i></a></li>
				</ul>
		</div>
		</nav>
		<div class = "container">
			<br><label class = "label">DELETE ITEM</label>
			<form class = "form" method = "post" name = "login" action = "#">
				<div class = "deleteID">Item ID</div>
				<input type = "number" name = "iid" id="id" required = "required"> 
				
				<div class = "iname">Item Name</div>
				<input type = "text" name = "iname" id="iname">
				
				<div class = "rname">Resturant Name</div>
				<input type = "text" name = "rname" id="rname">
				
				<div class = "price">Price</div>
				<input type = "number" name = "price" id="price">
				
				<button type = "submit" id="btn" name ="btn"> DELETE </button>
				<button type = "submit" id="btn" name ="btn"><a href = "AdminHomePage.jsp">BACK TO HOME</a></button><br>
				<h5><b>Instructions:</b><br>1. Item ID is manadatory.<br>2. Remaining are not manadatory.</h5><br>
			</form>
		</div>
	</body>
</html>