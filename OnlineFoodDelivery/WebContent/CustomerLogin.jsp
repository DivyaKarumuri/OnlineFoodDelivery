<!DOCTYPE html>
<html>
	<head>
		<title> login form </title>
		<link rel = "stylesheet" href = "login.css">
		<script type = "text/javascript" src = "validations.js"></script>
	</head>
	<body>
		<div class = "popup">
			<div class = "popup-close">
				<button class = "btn">
					<h3><a href = "welcomePage.jsp">X </a></h3>	
				</button>
			</div>
		</div>
		<div class = "container">
			<h1 class = "label">CUSTOMER LOGIN </h1>
			<form class = "login_form" method = "post" name = "login" action = "#" onsubmit = "return validation()">
				<div class = "font"> USER NAME </div>
				<input type = "text" autocomplete = "off" name = "uname" id="username"> 
				
				<div class = "font font2"> PASSWORD </div>
				<input type = "password" name = "pwd" id="password">
				
				<div class = "font font3"> MOBILE NUM </div>
				<input type = "number" name = "mob" id="mobilenum">
				
				<button type = "submit" id="button" name ="btn"> LOGIN </button><br>
				<h3>New user : <a href = "CustomerReg.jsp">create account</a></h3><br>
			</form>
		</div>
	</body>
</html>