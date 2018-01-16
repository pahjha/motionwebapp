<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>

<body>
	<h1>Hello</h1>
	<h2></h2>
	<form id="loginForm" modelAttribute="user" action="loginSubmit" method="post">
	 	<p style="color: red;">${message}</p>
		<label>Username</label>
		<input name="name" id="name" /> 
		<br> 
		<label>Password</label>
		<input type="password" name="password" id="password" /> <br>
		<button id="login" type="submit">Login</button>
	</form>

</body>
</html>
