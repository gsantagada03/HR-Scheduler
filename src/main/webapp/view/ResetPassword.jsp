<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reimposta password</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css"
	rel="stylesheet">

<link href="/CSS/Style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="d-flex justify-content-center align-items-center vh-100">
		<div class="card" style="width: 18rem; height: auto;">
			<div class="card-body">
				<form id="resetPasswordForm" action="/changePassword" method="post">
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
					<h1 id="resetPasswordTitle">Reimposta password</h1>

					<div class="form-group mt-4">
						<label for="password">Password</label>
						<div class="input-group">
							<div class="input-group-prepend">
								<i class="bi bi-lock" id="password-icon"></i>
							</div>
							<input type="password" class="form-control" id="password"
								name="password" placeholder="Inserisci la password">
							<div class="input-group-append">
								<i class="bi bi-eye-slash" id="showPassword"></i>
							</div>
						</div>
						<div id="empty-password-error" style="display: none; color: red">Inserisci
							una password valida</div>
						<div id="password-regex-error" style="display: none; color: red"></div>
						<div id="password-regex-success"
							style="display: none; color: green"></div>

					</div>

					<div class="form-group mt-4">
						<label for="conferma-password">Conferma password</label>
						<div class="input-group">
							<div class="input-group-prepend">
								<i class="bi bi-lock" id="password-icon"></i>
							</div>
							<input type="password" class="form-control" id="confirmPassword"
								name="confirmPassword" placeholder="Conferma la password">
							<div class="input-group-append">
								<i class="bi bi-eye-slash" id="showConfirmedPassword"></i>
							</div>
							<div id="confirm-password-empty-error"
								style="display: none; color: red">Inserisci una password
								valida</div>
							<div id="confirm-password-error"
								style="display: none; color: red"></div>
							<div id="confirm-password-success"
								style="display: none; color: green"></div>

						</div>


					</div>

					<div class="form-group text-center mt-4">
						<button type="submit" id="submitLogin" class="btn btn-primary">Cambia
							password</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<script src="/JS/ResetAdminPassword.js"></script>
</body>
</html>