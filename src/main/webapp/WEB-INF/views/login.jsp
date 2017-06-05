<%@ include file="Aheader.jsp"%>
<form method="post" action="perform_login">
	<div class="form-group">
		<label for="uname">Email ID:</label> <input type="text"
			name="username" id="uname" class="form-control"
			placeholder="Enter Registered Email ID" required>
	</div>
	<div class="form-group">
		<label for="pass">Password:</label> <input type="password"
			name="password" id="pass" class="form-control"
			placeholder="Enter Password" required>
		<p style="padding-top: 5px" class="pull-right">
			Forgot <a href="#">Password?</a>
		</p>
	</div>
	<input type="submit" class="btn btn-primary btn-block" value="Submit">
</form>


<%@ include file="Footer.jsp"%>