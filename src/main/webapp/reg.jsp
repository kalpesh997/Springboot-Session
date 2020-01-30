<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Registration</h3>
	<form action="insertReg" method="get">
		First Name : <input type="text" name="firstName"> <br/>
		Last Name : <input type="text" name="lastName"> <br/>
		Email : <input type="text" name="email"> <br/>
		Password : <input type="text" name="password"> <br/>
		<input type="submit"> 
	</form>
	<a href="login">login</a>
</body>
</html>