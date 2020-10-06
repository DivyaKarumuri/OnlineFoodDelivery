function validation() {
	var uname = document.login.uname.value;
	var pwd = document.login.pwd.value;
	var mob = document.login.mob.value;
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