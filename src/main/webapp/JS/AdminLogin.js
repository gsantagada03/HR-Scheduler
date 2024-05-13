var inputUsername = document.getElementById("inputUsername");
var usernameError = document.getElementById("username-blur-error");

var inputPassword = document.getElementById("inputPassword");
var passwordError = document.getElementById("password-blur-error");

var form = document.getElementById("loginForm");

var showPassword = document.getElementById("showPassword");

inputUsername.addEventListener("blur", function(){
	if(inputUsername.value.trim() === ""){
		usernameError.style.display = "block";
	}else{
		 usernameError.style.display = "none";
	}
});

inputPassword.addEventListener("blur", function(){
	if(inputPassword.value.trim() === ""){
		passwordError.style.display = "block";
	}else{
		passwordError.style.display = "none";
	}
});

form.addEventListener("submit", function(event){
	if(inputUsername.value.trim()=== ""){
		usernameError.style.display = "block";
		event.preventDefault();
	}
	
	 if(inputPassword.value.trim()===""){
		passwordError.style.display = "block";
		event.preventDefault();
	}
});

showPassword.addEventListener("mousedown", function(){
    inputPassword.type = "text";
});

showPassword.addEventListener("mouseup", function(){
    inputPassword.type = "password";
});