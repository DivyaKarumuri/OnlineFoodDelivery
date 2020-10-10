<!DOCTYPE html>
<html>
	<head>
		<title> login form </title>
		<link rel = "stylesheet" href = "login.css">
		<script type = "text/javascript">
		function validation() {
			var uname = document.login.uname.value;
			var pswd = document.login.pswd.value;
			var mobno = document.login.mobno.value;
			//checking for empty fields
			if(uname == "" || pswd == "" || mobno == "") {
				alert("Fields should not be blank");
				return false;
			}
			//checking size of password 
			if(pswd.length < 6 || pswd.length > 12) {
				alert("password must be 6 to 12 characters");
				return false;
			}
			//username should not start with _,@ and number
			var str = uname.slice(0,1);
			if(uname.slice(0,1) == "_" || uname.slice(0,1) == "@" || str.match(/[0-9]/g) != null){
				alert("username should not start with _, @ and number");
				return false;
			}
			var mobexpr=/^[6789]\d{9}$/;
			if(mobexpr.test(mobno)==false || mobno.length != 10) {
				alert("mobile number sholud be start with 6 or 7 or 8 or 9 and length sholud be 10");
				return false;
			}
		}
		</script>
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