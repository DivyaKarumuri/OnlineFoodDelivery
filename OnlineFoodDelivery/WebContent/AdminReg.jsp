<!doctype html>
<html>
	<head>
		<title>Registration Form</title>
		<link rel = "stylesheet" href = "CA.css">
		<script type = "text/javascript">
		function validation() {
			var uname = document.signup.uname.value;
			var pswd = document.signup.pswd.value;
			var pswd1 = document.signup.pswd1.value;
			var mobno = document.signup.mobno.value;
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
			if(pswd != pswd1) {
				alert("password and confirm password should be same");
				return false;
			}
		}
		</script>
	</head>
	<body>
		<div class = "container">
			<h1 class = "label"> ADMIN REGISTRATION </h1>
			<form class = "signup_form" method = "post" name = "signup" action = "AdminRegisteration" onsubmit = "return validation()">
				
				<input type = "text" class = "font" name = "fname" required = "required" placeholder = "first name"> 
				
				<input type = "text" class = "font" name = "lname" required = "required" placeholder = "last name"> 
				
				<input type = "text" class = "font" name = "uname" required = "required" placeholder = "user name"> 
				
				<input type = "email" class = "font" name = "email" required = "required" placeholder = "Email ID"> 
				
				<input type = "password" class = "font" name = "pswd" required = "required" placeholder = "password">
				
				<input type = "password" class = "font" name = "pswd1" required = "required" placeholder = "confirm password">
				
				<input type = "number" class = "font" name = "mobno" required = "required" placeholder = "mobilenum">
				
				<input type = "date" class = "font" name = "dob" placeholder = "select the date of birth">
				
				<p>Gender: </p><p><input type = "radio" name = "gen" value = "Male">Male
				<input type = "radio" name = "gen" value = "Female">Female</p>
				
				<select class = "font" name = "country"> 
					<option hidden> Country </option>
					<option value = "India"> India </option>
				</select>
				
				<select class = "font" name = "state">
					<option hidden> State </option>
					<option value = "Andhra Pradesh"> Andhra Pradesh </option>
					<option value = "Arunachal Pradesh"> Arunachal Pradesh </option>
					<option value = "Assam"> Assam </option>
					<option value = "Bihar" > Bihar </option>
					<option value = "Chandigarh"> Chandigarh </option>
					<option value = "Chattisgarh"> Chhattisgarh </option>
					<option value = "Dadar and Nagar Haveli"> Dadar and Nagar Haveli </option>
					<option value = "Daman and Diu"> Daman and Diu </option>
					<option value = "Delhi"> Delhi </option>
					<option value = "Goa"> Goa </option>
					<option value = "Gujarat"> Gujarat </option>
					<option value = "Haryana"> Haryana </option>
					<option value = "Himachal Pradesh"> Himachal Pradesh </option>
					<option value = "Jammu and Kashmir"> Jammu and kashmir </option>
					<option value = "Jharkand"> Jharkand </option>
					<option value = "Karnataka"> Karnataka </option>
					<option value = "Kerala"> Kerala </option>
					<option value = "Lakshadeep"> Lakshadeep </option>
					<option value = "Madhya Pradesh"> Madhya Pradesh </option>
					<option value = "Maharashtra"> Maharashtra </option>
					<option value = "Manipur"> Manipur </option>
					<option value = "Meghalaya"> Meghalaya </option>
					<option value = "Mizoram"> Mizoram </option>
					<option value = "Nagaland"> Nagaland </option>
					<option value = "Orissa"> Orissa </option>
					<option value = "Pondicherry"> Pondicherry </option>
					<option value = "Punjab"> Punjab </option>
					<option value = "Rajasthan"> Rajasthan </option>
					<option value = "Sikkim"> Sikkim </option>
					<option value = "Tamil Nadu"> Tamil Nadu </option>
					<option value = "Telangana"> Telangana </option>
					<option value = "Tripura"> Tripura </option>
					<option value = "Uttaranchal"> Uttaranchal </option>
					<option value = "Uttar Pradesh"> Uttar Pradesh </option>
					<option value = "West Bengal"> West Bengal </option>
				</select>
				
				<input type = "text" class = "font" name = "hno" id = "address-info" class = "address-name" placeholder = "House No./Appartment No." required = "required"> 
				
				<input type = "text" class = "font" name = "rname" id = "address-info" class = "address-name" placeholder = "Road Name, Area, Colony" required = "required">
				
				<input type = "text" class = "font" name = "city" id = "city-info" class = "location-city" placeholder = "City" required = "required">
				
				<input type = "text" class = "font" name = "pincode" id = "pincode-number" class = "pincode-number" placeholder = "Pincode" required = "required">
				<button type = "submit" id="button" name ="btn"> REGISTER </button>
				<h3>Already Registered : <a href = "AdminLogin.jsp">login</a></h3><br>
			</form>
		</div>
	</body>
</html>
