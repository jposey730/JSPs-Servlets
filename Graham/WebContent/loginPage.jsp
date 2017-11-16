<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>Login Page</title>
</head>
<body>

<h1>Login</h1>
<div id="login">
<form action="Login" method="post">
	username: <input type="text" name="uname"/>
	<br />
	password: <input type="password" name="pass"/>
	<br />
	<input type="submit" value="Login"/>
	
</form>
</div>
<h4>***If you are a new user please create an account <a href="signUp.jsp">here</a>***</h4>
</body>
</html>