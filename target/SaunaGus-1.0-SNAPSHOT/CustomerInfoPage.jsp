<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Please type in your information" %>
</h1>
<br/>


<form>

    <label for="email">Email:</label><br>
    <input type="text" id="email" name="email"><br>
    <br>
    <label for="firstName">First name:</label><br>
    <input type="text" id="firstName" name="firstName"><br>
    <br>
    <label for="lastName">Last name:</label><br>
    <input type="text" id="lastName" name="lastName"><br>
    <br>
    <label for="phoneNumber">Phone number:</label><br>
    <input type="text" id="phoneNumber" name="phoneNumber"><br>
    <br>
    <input type="submit" id="submit" name="sumbit" value="Submit">
</form>

</body>
</html>