<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Event Publisher</title>
</head>
<body>
	<c:if test="${not empty succesdMsg }">
		<p><c:out value="${ succesdMsg }"/></p>
	</c:if>
	<form action="${pageContext.request.contextPath }/events/broadcast" method="post">
		Message:<input name="eventMsg" type="text" value="" />
		<br><br><input type="submit" name="Submit" />
	</form>
</body>
</html>