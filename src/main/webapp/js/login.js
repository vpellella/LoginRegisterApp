// onchange language
document.addEventListener('DOMContentLoaded', function(){
	registration = document.getElementById('registration');
	if(registration){
		registration.addEventListener('click', function(){
			document.forms["loginForm"].action = "register";
			document.forms["loginForm"].submit();
		});		
	}
});

// onchange language
document.addEventListener('DOMContentLoaded', function(){
	forgotPass = document.getElementById('forgotPass');
	if(forgotPass){
		registration.addEventListener('click', function(){
			document.forms["loginForm"].action = "forgotPassword";
			document.forms["loginForm"].submit();
		});		
	}
});
