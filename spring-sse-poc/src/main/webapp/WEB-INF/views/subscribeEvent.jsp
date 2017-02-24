<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Susbcribe to Events</title>

<script type="text/javascript">
	var notificationBaseUrl = "http://127.0.0.1:7001/sse";
	var source = new EventSource(notificationBaseUrl + "/events/connect");
	source.onopen = function(e) {
		console.log("Connection opened");
	}
	source.onmessage = function(e) {
		console.log("received Message...");
		document.body.innerHTML += e.data + '<br>';
	}
</script>
</head>
<body>

</body>
</html>