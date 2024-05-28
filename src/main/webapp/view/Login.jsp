<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css" rel="stylesheet">
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<link href="/CSS/Style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="d-flex justify-content-center align-items-center vh-100">
		<div class="card" id = "loginCard" style="width: 18rem; height: auto;">
			<div class="card-body">
				<form id="loginForm" action="/login" method="post">
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
					<h1 id="loginTitle">Login</h1>
					<div class="form-group">
    <label for="username">Username</label>
    <div class="input-group">
        <div class="input-group-prepend">
           <i class="bi bi-person" id = "username-icon"></i>
        </div>
        <input type="text" class="form-control" id="username" name="username" placeholder="Inserisci l'username">
    </div>
    <div id = "username-blur-error" style = "display : none; color: red">Inserisci un username valido</div>
</div>

<div class="form-group mt-4">
    <label for="password">Password</label>
    <div class="input-group">
        <div class="input-group-prepend">
          <i class="bi bi-lock" id = "password-icon"></i>
        </div>
        <input type="password" class="form-control" id="password" name="password" placeholder="Inserisci la password">
                  <div class="input-group-append">
                          <i class="bi bi-eye-slash" id = "showPassword"></i>
                        </div>
    </div>
        <div id = "password-blur-error" style = "display : none; color: red">Inserisci una password valida</div>
    
</div>
       <c:if test="${not empty errorMessage}">
                <p style="color: red;">${errorMessage}</p>
            </c:if>

<div class="form-group text-center mt-4">
    <button type="submit" id="submitLogin" class="btn btn-primary">Accedi</button>
</div>
				</form>
			</div>
		</div>
	</div>
	
	<script src = "/JS/AdminLogin.js"></script>
</body>
</html>