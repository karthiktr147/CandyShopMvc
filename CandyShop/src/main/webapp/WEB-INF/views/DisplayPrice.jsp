<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buy Candies</title>
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
</head>
<body>
<div align ="center">
<h1>buy Candy Price Details</h1>
<hr/>
<br>

<div align="center">
        <p>the price is : ${price}</p>
        </div>
</div>
</body>
</html>