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
		<title> Customer Login Page </title>
	</head>
	<body>
		<form action = "" method = "post">
		<div class = "signup-panel">
			<div class = "panel-body">
				<div class = "heading"> REGISTRATION FORM </div> <br>
				<h5 class = "title"> Customer Sign Up Page </h5>
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
			<div class = "dropdown-list-country" id = "Country" required = "required">
				<select class = "select1"> 
					<option> Country </option>
					<option> India </option>
				</select>
			</div>
			<div class = "dropdown-list-state" id = "state" required = "required">
				<select class = "select1">
					<option> State </option>
					<option> Andra Pradesh </option>
					<option> Arunachal Pradesh </option>
					<option> Assam </option>
					<option> Bihar </option>
					<option> Chandigarh </option>
					<option> Chhattisgarh </option>
					<option> Dadar and Nagar Haveli </option>
					<option> Daman and Diu </option>
					<option> Delhi </option>
					<option> Goa </option>
					<option> Gujarat </option>
					<option> Haryana </option>
					<option> Himachal Pradesh </option>
					<option> Jammu and kashmir </option>
					<option> Jharkand </option>
					<option> Karnataka </option>
					<option> Kerala </option>
					<option> Lakshadeep </option>
					<option> Madhya Pradesh </option>
					<option> Maharashtra </option>
					<option> Manipur </option>
					<option> Meghalaya </option>
					<option> Mizoram </option>
					<option> Nagaland </option>
					<option> Orissa </option>
					<option> Pondicherry </option>
					<option> Punjab </option>
					<option> Rajasthan </option>
					<option> Sikkim </option>
					<option> Tamil Nadu </option>
					<option> Telangana </option>
					<option> Tripura </option>
					<option> Uttaranchal </option>
					<option> Uttar Pradesh </option>
					<option> West Bengal </option>
				</select>
			</div> <br>
			<!-- Address -->
			<div class = "Address">
				<input type = "text" name = "address" id = "address-info" class = "address-name" placeholder = "House No./Appartment No." required>
				<input type = "text" name = "address" id = "address-info" class = "address-name" placeholder = "Road Name, Area, Colony" required>
			</div> <br>
			<!-- city -->
			<div class = "location-city">
				<input type = "text" name = "city" id = "city-info" class = "location-city" placeholder = "City" required>
			</div> <br>
			<!-- Pincode -->
			<div class = "pincode-number">
				<input type = "text" name = "pincode-number" id = "pincode-number" class = "pincode-number" placeholder = "Pincode" maxlength = "6">
			</div> <br>
			<!-- Mobile Number -->
			<div class = "mobile">
				<input type = "text" name = "number" id = "number" class = "number" placeholder = "Mobile Number" required  maxlength = "10">
			</div>
			<button class = "btn signup"> Sign Up </button>
		</div>
	</form>
	</body>
</html>