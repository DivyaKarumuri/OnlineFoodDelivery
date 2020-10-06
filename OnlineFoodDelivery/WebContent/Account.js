var pwd = false;
function validatePassword1() {
	if (pwd) {
		document.getElementById("password").setAttribute("type", "password");
		pwd = false;
	} else {
		document.getElementById("password").setAttribute("type", "text");
		pwd = true;
	}
}

var pwd1 = false;
function validatePassword2() {
	if (pwd1) {
		document.getElementById("confirm_password").setAttribute("type", "password");
		pwd1 = false;
	} else {
		document.getElementById("confirm_password").setAttribute("type", "text");
		pwd1 = true;
	}
}