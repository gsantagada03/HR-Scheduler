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
<nav class="navbar navbar-expand-sm navbar-light">
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/admin/homePage">HOME <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         GESTISCI HR MANAGER
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Aggiungi HR manager</a>
           <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Modifica HR manager</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Rimuovi Hr manager</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">MODIFICA PASSWORD</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <button class="btn btn-outline-success my-2 my-sm-0" id="logout-button" type="submit">LOGOUT</button>
    </form>
  </div>
</nav>

<main>
<div id="description-homepage">
<h1 style="color:white">HR-Scheduler</h1>
<p style="color:white">SEMPLICE, INTUITIVO ED EFFICIENTE, HR SCHEDULER E' LA SOLUZIONE COMPLETA PER LA TUA AZIENDA.</p>
</div>
</main>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>
