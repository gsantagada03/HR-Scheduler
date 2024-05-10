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

	<div class="card" style="width: 20rem;">
		<img class="card-img-top" id="login-card">
		<h3>LOGIN</h3>
		 <form action="/login" method="post">

			<div class="form-group">
				<label for="Username" id="username-label">Username </label>
				<div class="input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"><i class="bi bi-person"></i></span>
					</div>
					<input type="text" class="form-control underline-input shadow-none"
						id="username-input" name = "username">
				</div>


			</div>
			<div class="form-group">
				<label for="password" id="password-label">Password </label>
				<div class="input-group">
					<div class="input-group-prepend">
						<span class="input-group-text"><i class="bi bi-lock"></i></span>
					</div>
					<input type="password"
						class="form-control underline-input shadow-none"
						id="password-input" name = "password">
				</div>
				<button type="submit" class="btn btn-primary" id = "login-button">Accedi</button>

			</div>
		</form>
	</div>

	<script src="/JS/AdminLogin.js"></script>
</body>
</html>