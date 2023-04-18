<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Employee ID</th>
    </tr>
  </thead>
  <tbody class="table-group-divider">
	<c:forEach var="emp" items="${zak}">
		    <tr>
		    	<td>${emp.username}</td>

   			 </tr>
	</c:forEach>

  </tbody>
</table>
</body>
</html>