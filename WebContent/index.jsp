<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<fieldset>

<legend>Enter your information</legend>
<form action="regservlet" >
Enrollment No: <br> <input type="text" name="enroll" required><br>
Password: <br> <input type="password" name="pass" required><br>
Full Name: <br> <input type="text" name="fname" required><br>
Address: <br> <input type="text" name="add" required><br>
<br>
<input type="submit" value="register">
</form>
</fieldset>

</body>
</html>