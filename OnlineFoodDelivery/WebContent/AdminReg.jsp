<!DOCTYPE html>
<html>
	<head>
		<meta charset = "UTF-8">
		<meta name = "viewport" content = "width=device-width, initial-scale = 1">
		<link rel =  "stylesheet" type = "text/css" href = "bootstrap.css">
		<script type = "text/javascript" src = "jquery-3.5.1.js"> </script>
		<script type = "text/javascript" src = "popper.js"> </script>
		<script type = "text/javascript" src = "bootstrap.js"> </script>
		<link rel = "stylesheet" type = "text/css" href = "CA.css">
		<link rel = "stylesheet" type = "text/css" href = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<script type = "text/javascript" src = "Account.js"> </script>
		<title>SignUp Form</title>
	</head>
	<body>
		<div class = "popup">
			<div class = "popup-close">
				<button>
					<h6><a href = "welcomePage.jsp">X </a></h6>
				</button>
			</div>
		</div>
		<form action = "" method = "post">
		<div class = "signup-panel">
			<div class = "panel-body">
				<div class = "heading"> REGISTRATION FORM </div> <br>
				<h5 class = "title"> Admin Sign Up Page </h5>
			</div>
			<div class = "column-1">
				<input type = "text" name = "fname" id = "firstname" class = "fname" placeholder = "First Name" required ="required">
				<input type = "text" name = "lname" id = "lastname" class = "lname" placeholder = "Last Name" required = "required">
			</div> <br>
			<div class = "column-2"> 
				<input type = "text" name = "uname" id = "username" class = "uname" placeholder = "User Name" required = "required" title = "Username must not be blank and contain only letters, numbers and underscore." pattern = "\w+" maxlength = "15"> 
			</div> <br>
			<div>
				<input type = "password" name = "pass" id = "password" class = "pass" placeholder = "Create Password" required = "required" title = "Password must contains atleast 8 characters, including UPPER/lowercase and numbers" pattern = "(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" onchange = "this.setCustomValidity(this.validity.Mismatch ? this.title = ''); if(this.checkValidity()) form.pass1.pattern = RegExp.escape(this.value);" maxlength = "15">
				<span class = "span1"> <i class = "fa fa-eye" aria-hidden = "true" onclick = "validatePassword1()" title = "Show Password"> </i> </span>
			</div> <br>
			<div>
				<input type = "password" name = "pass1" id = "confirm_password" class = "pass" placeholder = "Confirm Password" required = "required" title = "Plese enter the same password as above" pattern = "(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" onchange = "this.setCustomValidity(this.validity.Mismatch ? this.title = '');" maxlength = "15">
				<span class = "span1"> <i class = "fa fa-eye" aria-hidden = "true" onclick = "validatePassword2()" title = "Show Password"> </i> </span>
			</div> <br>
			<div>
				<input type = "email" name = "email" id = "mail" class = "mail" placeholder = "Enter Your Mailid" required = "required">
			</div> <br>
			<div class = "gender-panel">
				<div>
					 <h5> Gender </h5> 
				</div>	
						&nbsp; &nbsp; <b> Male </b>
					<input type = "radio" name = "gender" id = "gender" class = "gender">
						&nbsp;&nbsp; <b> Female </b>
					<input type = "radio" name = "gender" id = "gender" class = "gender">
			</div> <br>
			
			<div class = "mobile">
				<input type = "text" name = "number" id = "number" class = "number" placeholder = "Mobile Number" required  maxlength = "10">
			</div>
			<button class = "btn signup"> Sign Up </button><br>
			<h3>Already registered : <a href = "CustomerLogin.jsp">sign in</a></h3><br>
		</div>
	</form>
	</body>
</html>