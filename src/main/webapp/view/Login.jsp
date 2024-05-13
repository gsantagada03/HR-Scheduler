<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/CSS/Style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css"
	rel="stylesheet">

<title>Login</title>
</head>
<body>


<div class = "centered-form-container">
<form id = "loginForm">
<h1 id = "LoginTitle">Login</h1>
  <div class="form-group" id = "username-input" style = "position: relative">
    <input type="text" class="form-control" id="inputUsername" placeholder="Username">
    <div id = "username-blur-error" style = "display:none; color:red">Inserisci un username valido</div>
  </div>
  
  
  <div class="form-group" style="position: relative;">
            <input type="password" class="form-control" id="inputPassword" placeholder="Password">
            <i class="bi bi-eye password-toggle-icon" id="showPassword"></i>
            <div id="password-blur-error" style="display:none; color:red">Inserisci una password valida</div>
        </div>
  <button type="submit" id = "SubmitLoginButton" class="btn btn-primary">Submit</button>
</form>
</div>
	<script src="/JS/AdminLogin.js"></script>
</body>
</html>