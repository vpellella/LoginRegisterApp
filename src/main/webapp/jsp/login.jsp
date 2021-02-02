<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<Title>Login</Title>
		<script src="js/login.js"></script>
	</head>
	<body>
		<div>
			<img src="../images/login.png"  width="600" height="240"/>
		</div>
		<div id="login">
		<form method="post" action="login" id="loginForm">
			<label>Username or Email</label><input type="text" id="username" />
			<input type="submit" id="password" value="Login" />
		</form>
		<a href="" id="registration">New User</a>&nbsp;&nbsp; 
		<a href="" id="forgotPass">Forgot Password</a>
	</div>
	</body>
<html>