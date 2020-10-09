<!doctype html>
<html>
	<head>
		<title>Registration Form</title>
		<link rel = "stylesheet" href = "CA.css">
		<script type = "text/javascript">
		function validation() {
			var uname = document.signup.uname.value;
			var pwd = document.signup.pwd.value;
			var mob = document.signup.mob.value;
			//checking for empty fields
			if(uname == "" || pwd == "" || mob == "") {
				alert("Fields should not be blank");
				return;
			}
			//checking size of password 
			if(pwd.length < 6 || pwd.length > 12) {
				alert("password must be 6 to 12 characters");
				return;
			}
			//username should not start with _,@ and number
			var str = uname.slice(0,1);
			if(uname.slice(0,1) == "_" || uname.slice(0,1) == "@" || str.match(/[0-9]/g) != null){
				alert("username should not start with _, @ and number");
				return;
			}
			var mobexpr=/^[6789]\d{9}$/;
			if(mobexpr.test(mob)==false || mob.length != 10) {
				alert("mobile number sholud be start with 6 or 7 or 8 or 9 and length sholud be 10");
				return;
			}
		}
		</script>
		
	</head>
	<body>
		<div class = "container">
			<h1 class = "label"> ADMIN LOGIN </h1>
			<form class = "signup_form" method = "post" name = "signup" action = "" onsubmit = "return validation()">
				
				<input type = "text" class = "font" name = "fname" id="firstname" required = "required" placeholder = "first name"> 
				
				<input type = "text" class = "font" name = "lname" id="lastname" required = "required" placeholder = "last name"> 
				
				<input type = "text" class = "font" name = "uname" id="username" required = "required" placeholder = "user name"> 
				
				<input type = "email" class = "font" name = "email" id="email" required = "required" placeholder = "Email ID"> 
				
				<input type = "password" class = "font" name = "pswd" id="password" required = "required" placeholder = "password">
				
				<input type = "password" class = "font" name = "pswd1" id="password" required = "required" placeholder = "confirm password">
				
				<input type = "number" class = "font" name = "mobno" id="mobilenum" required = "required" placeholder = "mobilenum">
				
				<input type = "date" class = "font" name = "dob" placeholder = "select the date of birth">
				
				<p>Gender: </p><p><input type = "radio" name = "gen" value = "Male">Male
				<input type = "radio" name = "gen" value = "Female">Female</p>
				
				<select class = "font" name = "country"> 
					<option hidden> Country </option>
					<option> India </option>
				</select>
				
				<select class = "font" name = "state">
					<option hidden> State </option>
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
				
				<input type = "text" class = "font" name = "hno" id = "address-info" class = "address-name" placeholder = "House No./Appartment No." required = "required"> 
				
				<input type = "text" class = "font" name = "rname" id = "address-info" class = "address-name" placeholder = "Road Name, Area, Colony" required = "required">
				
				<input type = "text" class = "font" name = "city" id = "city-info" class = "location-city" placeholder = "City" required = "required">
				
				<input type = "text" class = "font" name = "pincode" id = "pincode-number" class = "pincode-number" placeholder = "Pincode" required = "required">
				<button type = "submit" id="button" name ="btn"> LOGIN </button>
				<h3>Already Registered : <a href = "AdminLogin.jsp">login</a></h3><br>
			</form>
		</div>
	</body>
</html>
