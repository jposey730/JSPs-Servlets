<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>Welcome</title>
</head>
<body>
<%
//checks the session attribute to make sure that there is a 
//session created already.  This prevents some one from accessing the 
//page before they have logged in.
if(session.getAttribute("username")==null){
	response.sendRedirect("loginPage.jsp");
}

%>
<h1>Welcome!!!</h1>
<h2>You have reached the Shark Page!</h2>
<img src="https://www.thesun.co.uk/wp-content/uploads/2017/06/nintchdbpict000293748979.jpg?strip=all&w=960" />
<br />
<form action="Logout" method="post">
<input id="leave" type="submit" value="Logout"/>
</form>
</body>
</html>