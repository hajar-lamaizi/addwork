<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADD WORK</h1>
<p>${message}</p>
<c:forEach var="documentation" items="${documentations }">
<div>
<h3>${documentation.nom}</h3>
</div>
</c:forEach>
</body>
</html>