<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>WELCOME</h2>

<p>${message} </p>

<form action="loginStudent" method="post">

Username : <input type="text" name="username" /> <br>  <br><br>

Password : <input type="text" name="password" /> <br> <br>



<input type="submit" value="Login">
</form>
<br><br>
<a href="home"><button> click here to Register</button></a>


</body>
</html>