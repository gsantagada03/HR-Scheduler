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
<form>
<h1 id = "LoginTitle">Login</h1>
  <div class="form-group" id = "username-input">
    <input type="text" class="form-control" id="inputUsername" placeholder="Username">
  </div>
  <div class="form-group">
    <input type="password" class="form-control" id="inputPassword" placeholder="Password" >
  </div>
  <button type="submit" id = "SubmitLoginButton" class="btn btn-primary">Submit</button>
</form>
</div>
	<script src="/JS/AdminLogin.js"></script>
</body>
</html>