<!DOCTYPE html>
<html lang="en">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>

<title>index</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
	<script type="text/javascript" src="./res/customjs.js"></script>
	
	<link rel="stylesheet" href="./res/MyStyle.css">
</head>
<body ng-app="myApp" style="background-image: url('./res/bg.jpg');">

	<nav class="navbar navbar1"
		style="background-image: url('./res/cbg.jpg');">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar spamcolor"></span> <span
						class="icon-bar spamcolor"></span> <span
						class="icon-bar spamcolor"></span>
				</button>
				<a class="navbar-brand" href="about"><img alt="logo"
					src="./res/brnd.png" class="mylogo"><img class="mylogo1"
					alt="" src="./res/brnd1.png"></a>
			</div>
			<div class="collapse navbar-collapse"
				style="background-color: transparent;" id="myNavbar">

				<ul class="nav navbar-nav navbarlist">
					<li class="dropdown navbarlistitems"><a
						class="dropdown-toggle nav-anchor" data-toggle="dropdown" href="#">HARDWARE
							<span class="caret"></span></a>
							<ul class="dropdown-menu" style="background-image: url('./res/cbg.jpg');">
							<li><a href="mouse">MOUSE</a></li>
							<li><a href="mousepad">PADS</a></li>
							<li><a href="keybord">KEYBOARD</a></li>

						</ul></li>
					<li class="active navbarlistitems"><a href="#"
						class="nav-anchor"> SOFTWARE </a></li>

					<li class="navbarlistitems"><a href="#" class="nav-anchor">COMMUNITY</a></li>
					<li class="navbarlistitems"><a href="#" class="nav-anchor">SUPPORT</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right navbarlist">
				<li class="cart"> <a href="#" class="nav-anchor" >
          <span class="glyphicon glyphicon-shopping-cart "></span> My Cart
        </a></li>
					<li class="navbar-sign-logout"><a data-toggle="modal" data-target="#register" class="nav-anchor"><span
							class="glyphicon glyphicon-user"></span> Sign-in</a></li>
					<li class="navbar-sign-logout"><a data-toggle="modal" data-target="#login"  class="nav-anchor"><span
							class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</ul>

			</div>
		</div>
	</nav>
	<div class="container">
	<div id="register" class="modal fade" role="dialog" >
		<div class="modal-dialog">
			<div class="modal-content" style="background-image: url('./res/cbg.jpg');">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h1 id="col">Register</h1>
				</div>
				<div class="modal-body" >
						<form:form action="registeruser" commandName="user" method="POST" >
						<div class="form-group" >
							<form:label  path="user_firstname">First Name: </form:label>
							<form:input  path="user_firstname" class="form-control" placeholder="Enter First Name" required="required"></form:input>
						</div>	
						<div class="form-group">
							<form:label  path="user_lastname">Last Name:</form:label>
							<form:input  path="user_lastname" class="form-control" placeholder="Enter Last Name" required="required"></form:input>
						</div>	
						<div class="form-group">
							<form:label  path="userName">User Name:</form:label>
							<form:input  path="userName" class="form-control" placeholder="Enter User Name" required="required"></form:input>
						</div>
						<div class="form-group">
							<form:label  path="user_emailid">E-mail:</form:label>
							<form:input  path="user_emailid" class="form-control" type="email" placeholder="Enter Email ID" required="required" pattern="^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" title="Enter valid mail ID"></form:input>
						</div>
						<div class="form-group">
							<form:label  path="user_password">Password:</form:label>
							<form:password path="user_password" id="password" class="form-control" placeholder="Enter Password" required="required" pattern="^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#~$%^&*_]).{8,}$" title="The password must contain at least one number and one uppercase and lowercase letter and one special character like !,@,#,~,$,%,^,&,*,_ only, and at least 8 or more characters"></form:password>
						</div>	
						<div class="form-group">
							<form:label  path="user_confirmpassword">Confirm Password:</form:label>
							<form:password  path="user_confirmpassword" id="confirmpassword" onkeyup="confPass(); return false;" class="form-control" placeholder="Re-enter Password" required="required"></form:password>
							<span id="confirmMessage" class="confirmMessage"></span>
						</div>
						<div class="form-group">
							<form:label  path="user_contact">Contact Number:</form:label>
							<form:input  path="user_contact" class="form-control" placeholder="Enter Contact Number" required="required" pattern="(^[1-8]\d{9}$)|(^[789]\d{9}$)" title="Please enter a valid contact number (including STD code for landlines) but excluding the zero at the start"></form:input>
						</div>
						<div class="form-group">
							<form:label  path="user_address">Address:</form:label>
							<form:textarea  path="user_address" rows="3" class="form-control" placeholder="Enter Address" required="required"></form:textarea>
						</div>
						<div class="form-group">
							<form:label  path="user_city">City:</form:label>
							<form:input  path="user_city" class="form-control" placeholder="Enter City" required="required"></form:input>
						</div>
						<div class="form-group">	
							<form:label  path="user_pincode">Pincode:</form:label>
							<form:input  path="user_pincode" class="form-control" placeholder="Enter Pincode" required="required" pattern="^[1-9][0-9]{5}$" title="Please enter a valid pincode"></form:input>
						</div>
						<div class="form-group">
							<form:label  path="user_state">State:</form:label>
							<form:input  path="user_state" class="form-control" placeholder="Enter State" required="required"></form:input>
						</div>
						<div style="margin-bottom: 9px;">
							<form:label  path="user_gender">Gender:</form:label>
							<form:radiobutton  path="user_gender" value="male" checked="checked" />Male&nbsp;<form:radiobutton  path="user_gender" value="female" />Female
						</div>
						<div class="form-group">
							<form:label  path="user_dob"></form:label>
							<form:input  path="user_dob" class="form-control" type="date" required="required"></form:input>
						</div>
						<div class="form-group">
							<form:label  path="user_acceptprivacy">Accept Privacy Policy</form:label>
							<form:checkbox  path="user_acceptprivacy" value="accept" required="required" />
							<a  data-target="#privacy" data-toggle="modal" data-dismiss="modal">Read Policy</a>
						</div>
						<input  class="btn btn-primary btn-block" type="submit" value="Submit">
						</form:form>	
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Close</button>
				</div>
			</div>
		</div>
	</div>
   </div>
   <!-- model for log in start -->
    <div id="login" class="modal fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h1>Login</h1>
				</div>
				<div class="modal-body">
					<form method="post" action="vconf">
						<div class="form-group">
							<label for="uname">Email ID:</label>
							<input type="text" name="username" id="uname" class="form-control" placeholder="Enter Registered Email ID" required>
						</div>
						<div class="form-group">
							<label for="pass">Password:</label>
							<input type="password" name="password" id="pass" class="form-control" placeholder="Enter Password" required>
							<p style="padding-top: 5px" class="pull-right">Forgot <a href="#">Password?</a></p>
						</div>
						<input type="submit" class="btn btn-primary btn-block" value="Submit">
					</form>
				</div>
				<div class="modal-footer">
					<p class="pull-left">Not a member? <a data-toggle="modal" data-target="#register" data-dismiss="modal">Register here</a></p>
					<button type="button" class="btn btn-danger" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Close</button>
				</div>
			</div>
		</div>
	</div>
   
  <!-- moddel for privacy starts -->
  <div id="privacy" class="modal fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h1>Privacy Policy</h1>
				</div>
				<div class="modal-body">
					<p>Razer is committed to safeguarding your privacy online. We recognize your need for reasonable control of personally identifiable information that you share with Razer.</p> 
					<p>When you order, we need to know your name, e-mail address, mailing address, credit card number, and expiration date. This allows us to process and fulfill your order. This will used only for the service you have sought and would not be under any circumstances passed on fo any other commercial purpose. Razer will not disclose any of your personally identifiable information except when we have your permission or under special circumstances, such as when we believe in good faith that the law requires it.</p> 
					<p>Although we track the total number of visitors to each of sites in an aggregate form to allow us to update an improve our sites, personally identifiable information is not extracted in this process. Any cookie technology (where our servers deposit special codes on a visitor's computer) will only be used to track non-personal information such as type of browser,operating system, and domain names to improve our visitor's online experience. </p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#register" data-dismiss="modal">Back</button>
				</div>
			</div>
		</div>
	</div>
  