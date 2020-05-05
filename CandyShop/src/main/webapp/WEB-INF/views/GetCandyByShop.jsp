<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="com.mindtree.candyshop.entity.Candy"%>
<%@page import="org.springframework.web.bind.annotation.ModelAttribute"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying the Details Of Candies with stock less than five</title>
<link rel="stylesheet" href="<c:url value="/resources/style.css"/>">
</head>
<body>
<div align ="center">
<h1>Candy Details</h1>
<form:form>
<table border="1" >
<thead>
<tr >
<th>CandyId</th>
<th>CandyName</th>
<th>CandyPrice</th>
<th>CandyStock</th>
</tr>
</thead>
<tbody>
<c:forEach var="candy" items="${candies}">
<tr >
<td>${candy.candyId}</td>
<td>${candy.candyName}</td>
<td>${candy.price }</td>
<td>${candy.stock }</td>
</tr>
</c:forEach>
</tbody>

</table>
</form:form>

</div>

</body>
</html>