<!DOCTYPE html>
<html lang = "en">
	<head>
		<meta charset = "UTF-8">
		<meta name = "viewport" content = "width=device-width, initial-scale = 1">
		<title> PAYMENT DETAILS </title>
		<link rel = "stylesheet" type = "text/css" href = "style.css">
	</head>
	<body>
		<%
			if(session.getAttribute("uname") == null || session.getAttribute("pswd") == null || session.getAttribute("mobno") == null) {
				response.sendRedirect("CustomerLogin.jsp");
			}
		%>
		<div class = "checkout-panel">
			<div class = "panel-body">
				<div class = "heading1"> PAYMENT DETAILS </div> <br>
				<h2 class = "title"> Checkout </h2>
				<div class = "progress-bar">
				<div class = "step active"> </div>
				<div class = "step active"> </div>
				<div class = "step"> </div>
				<div class = "step"> </div>
			</div>
			<form action = "PaymentServlet" method = "post">
			<div class="payment-method">
				<label for="card" class="method card">
					<div class="card-logo">
						<img src="images/visa_logo.png">
						<img src="images/mastercard_logo.png">
					</div>

					<div class="radio-input">
						<input id = "card" type ="radio" value = "card" name = "payment" required = "required">
							Pay with Debit Card / Credit Card <br>
						<!-- <input id = "card" type = "radio" name = "payment">
							Pay with GooglePay / AmazonPay / Paytm / PhonePe <br> <br> 
							<select class = "select1">
								<optgroup class = "option-group" id = "option-group">
									<option> Select </option>
									<option> GooglePay </option>
									<option> AmazonPay </option>
									<option> Paytm </option>
									<option> PhonePe </option>
								</optgroup>
							</select> -->
					</div>
				</label>
				<label for = "googlePay" class = "method googlePay">
					<div class = "card-logo">
      					<img src = "images/GooglePay-logo.png">
      					<img src = "images/amazonpay_logo.png">
      					<img src = "images/PhonePe_logo.png">
      				</div>
      				<div class = "radio-input">
      					<input type = "radio" value = "UPI pin" required = "required" name = "payment" id = "googlePay">
      						Pay with GooglePay/AmazonPay/PhonePe
      				</div>
      			</label>
			</div>

			<div class="input-fields">
				<div class="column-1">
					<label for = "cardholder"> Cardholder's Name</label>
					<input type = "text" name = "cardholder" id = "cardholder" placeholder = "As per in your ATM-Card" required = "required">
					<div class = "small-inputs">
						<div>
							<label for ="date"> Valid thru </label>
							<input type ="text" name = "date" id = "date" placeholder = "02/23" required = "required">
						</div>
						<div>
							<label for="verification"> CVV </label>
								<input type = "password"  name = "verification" id = "verification" required = "required" maxlength = "3" placeholder = "123">
						</div>
					</div>
				</div>
				<div class="column-2">
					<label for="cardnumber"> Card Number</label>
						<input type="text" id="cardnumber" name = "cardnumber" required = "required" placeholder = "1234 5678 9012 3456">
							<span class="info"> *CVV is the card security code, unique three digits number on the back of your card separate from its number.</span>
				</div>
			</div>
		</div>

		<div class="panel-footer">
			<br><center><button class ="btn next-btn">Next Step</button></center>
		</div>
		</div>
		</form>
	</body>
</html>