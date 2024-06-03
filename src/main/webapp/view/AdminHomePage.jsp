<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto&display=swap">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
	<link href="/CSS/Style.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body class ="home-page-body">
<nav class="navbar navbar-expand-lg navbar-light">
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">HOME <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         GESTISCI HR MANAGER
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">MODIFICA PASSWORD</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <button class="btn btn-outline-success my-2 my-sm-0" id = "logout-button" type="submit">LOGOUT</button>
    </form>
  </div>
</nav>

<main>
<div id = "description-homepage">
<h1 style = "color:white">HR-Scheduler</h1>
<p style = "color:white">SEMPLICE, INTUITIVO ED EFFICIENTE, HR SCHEDULER E' LA SOLUZIONE COMPLETA PER LA TUA AZIENDA.
</p>
</div>
</main>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poTtfnGJA7ul3yLmbbI2Aa8hDDdjT/8e2kF0C6TktW8fKvx91v9" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pjaaA8dDz/0vJ20cHtkfICCpHftZ1+GxC4ePbEpCzZjKgHrBgQw+F5MFL5x6L2wR" crossorigin="anonymous"></script>

</body>
</html>