<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
   <meta charset="ISO-8859-1">
   <title>Current Visit Count</title>
</head>
<body>

<h1>You have visited <c:out value="${ countToShow }"></c:out> Times</h1>

     
<a href="/">test onther visit ? </a>
  

</body>
</html>