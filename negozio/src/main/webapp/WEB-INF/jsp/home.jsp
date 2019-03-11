<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>StoGame</title>
	
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	
<link rel="stylesheet" href="css/body.css"  type="text/css"/>
<link rel="stylesheet" href="css/header.css" type="text/css">
<link rel="stylesheet" href="css/footer.css" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<!-- HEADER -->
	<div class="header">
		<div class="container">
			<div class="page-header">
				<h1 align="center">
					<h1></h1>
					<div class="row">
						<a href="#">
							<div class="col-md-4 col-md-offset-4"
								style="background-color: black;" align="center">
								<img src="StoGame.png" height="5%" width="30%">
							</div>
						</a>
						<div class="col-md-4">
							<br> <br>
						</div>
					</div>
				</h1>
			</div>
		</div>
	</div>
	<!-- Inizio corpo centrale sito -->
	<div class="col-md-12">
		<nav class="navbar navbar-inverse">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">StoGame</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">Ricerca Avanzata</a></li>
			</ul>
			<form class="navbar-form navbar-left" action="/action_page.php">
				<div class="form-group">
					<input type="text" class="form-control"
						placeholder="Inserisci nome.." name="search">
				</div>
				<button type="submit" class="btn btn-default">
					Cerca <span class="glyphicon glyphicon-search"> </span>
				</button>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"> <span
						class="glyphicon glyphicon-shopping-cart"> </span> Carrello
				</a></li>
				<li><a href="#"> <span class="glyphicon glyphicon-user">
					</span> Mario Rossi
				</a></li>
			</ul>
		</nav>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-3">
				<!--Lista console-->
				<div id="titoloBlocco">
					<h1 id="titolo" align="left">
						<b>CONSOLE</b>
					</h1>
				</div>
				<br>
				<form align="left">
					<br> <label class="radio-inline"> <input type="radio"
						value="PS3" name="console" checked=""><b>PS3</b>
					</label> <br> <br> <label class="radio-inline"> <input
						type="radio" value="PS4" name="console"><b>PS4</b>
					</label> <br> <br> <label class="radio-inline"> <input
						type="radio" value="X360" name="console"><b>XBOX360</b>
					</label> <br> <br> <label class="radio-inline"> <input
						type="radio" value="XONE" name="console"><b>Xbox One</b>
					</label> <br> <br> <label class="radio-inline"> <input
						type="radio" value="PC" name="console"><b>PC</b>
					</label> <br> <br> <label class="radio-inline"> <input
						type="radio" value="SWITCH" name="console"><b>Switch</b>
					</label> <br> <br> <label class="radio-inline"> <input
						type="radio" value="3DS" name="console"><b>3DS</b>
					</label> <br> <br>
					<p></p>
				</form>
				<!--Lista genere-->
				<div id="titoloBlocco">
					<h1 id="titolo" align="left">
						<b>GENERE</b>
					</h1>
				</div>
				<form align="left">
					<br> <label class="radio-inline"> <input type="radio"
						name="genere" value="avventura" checked=""><b>Avventura</b>
					</label> <br> <br> <label class="radio-inline"> <input
						type="radio" name="genere" value="azione"><b>Azione</b>
					</label> <br> <br> <label class="radio-inline"> <input
						type="radio" name="genere" value="sparatutto"><b>Sparatutto</b>
					</label> <br> <br> <label class="radio-inline"> <input
						type="radio" name="genere" value="sport"><b>Sport</b>
					</label> <br> <br>
					<p></p>
				</form>
				<!--Lista prezzo-->
				<div id="titoloBlocco">
					<h1 id="titolo" align="left">
						<b>PREZZO</b>
					</h1>
				</div>
				<br>
				<div class="slidecontainer">
					<input type="range" min="1" max="500" value="250" class="slider"
						id="myRange">
					<div id="valore">
						<b>
							<p>
								Max Price: <span id="demo"> </span>€
							</p>
						</b>
					</div>
				</div>
				<form align="left">
					<br>
					<p></p>
				</form>
			</div>
			<div id="catalogo">
				<div class="col-md-9">
					<div class="container">
						<ul class="list-group">
							<li class="list-group-item">
								<div class="row">
									<div class="col-md-3">
										<img src="copertina.jpg" height="150px" width="100px">
									</div>
									<div class="col-md-3">
										<br> <br> <br>
										<p>
											<a href="dettaglio.html"><b>Nome Gioco</b></a>
										</p>
									</div>
									<div class="col-md-2">
										<br> <br> <br>
										<p>
											<b>Prezzo</b>
										</p>
									</div>
									<div class="col-md-2">
										<br> <br> <br>
										<p>
											<b>Qt.</b>
										</p>
									</div>
									<div class="col-md-2">
										<br> <br> <br>
										<p>
											<button type="button" onclick="alert('Prodotto venduto')"
												class="btn btn-dark">Vendi</button>
										</p>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!--Chiude la row-->
	</div>
	<!-- FOOTER -->
	<div style="min-height: 5%" class="footer">
		<div class="container">
			Numero assistenza: <span class="glyphicon glyphicon-earphone">
			</span> 000-000-0000
		</div>
	</div>
	<!-- SCRIPT SLIDER PREZZO -->
	<script>
      var slider = document.getElementById("myRange");
      var output = document.getElementById("demo");
      output.innerHTML = slider.value;
      slider.oninput = function() {
      output.innerHTML = this.value;
      }
    </script>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>