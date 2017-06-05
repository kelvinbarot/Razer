function confPass(){
	var pass1 = document.getElementById('password');
	var pass2 = document.getElementById('confirmpassword');
	
	var message = document.getElementById('confirmMessage');
	
	var correctColor = "#66cc66";
	var wrongColor = "#ff6666";
	
	if(pass1.value == pass2.value){
		pass2.style.backgroundColor  = correctColor;
		message.style.color = correctColor;
		message.innerHTML = "Password Match"
		
	}else{
		pass2.style.backgroundColor  = wrongColor;
		message.style.color = wrongColor;
		message.innerHTML = "Password Do Not Match!"
		
	}



}
