<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<title>AdminPage</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./res/MyStyle.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
</head>
<body style="background-image: url('./res/bg.jpg');">

	<nav class="navbar navbar1"
		style="background-image: url('./res/cbg.jpg');">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar" >
					<span class="icon-bar spamcolor"></span> <span
						class="icon-bar spamcolor"></span> <span
						class="icon-bar spamcolor"></span>
				</button>
				<a class="navbar-brand" href="index"><img alt="logo"
					src="./res/brnd.png" class="mylogo"><img class="mylogo1"
					alt="" src="./res/brnd1.png"></a>
			</div>
			<div class="collapse navbar-collapse"
				style="background-color: transparent;" id="myNavbar">

				<ul class="nav navbar-nav navbarlist drpnav" style="background-image: url('./res/cbg.jpg');">
					
					<li class="navbarlistitems"><a href="managep" class="nav-anchor">MANAGE PRODUCT</a></li>
					<li class="navbarlistitems"><a href="manages" class="nav-anchor">MANAGE SUPPLIER</a></li>
					<li class="navbarlistitems"><a href="adminmanagecat" class="nav-anchor">MANAGE CATEGORY</a></li>
					
				</ul>
				<ul class="nav navbar-nav navbar-right navbarlist">
					<li class="navbar-sign-logout"><a href="#" class="nav-anchor"><span
							class="glyphicon glyphicon-user "></span> Sign Up</a></li>
					<li class="navbar-sign-logout"><a href="log" class="nav-anchor"><span
							class="glyphicon glyphicon-log-in"></span> Login</a>
							</li>
				</ul>

			</div>
		</div>
	</nav>