<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<Title>Login</Title>
	</head>
	<body>
		<div>
			<img src="../images/login.png"  width="600" height="240"/>
		</div>
		<div id="login">
			<form method="post" action="userLogin">
				<label>Username or Email</label><input type="text" id="username" />
				<input type="submit" id="password" value="Login"/>
			</form>			
		</div>
	</body>
<html>