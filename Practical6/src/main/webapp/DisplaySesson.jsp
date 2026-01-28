<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Output</title>
</head>
<body>

<%
String storedName = (String) session.getAttribute("username");
%>

<h2>Welcome <%= storedName %>!</h2>
<p>Your name was successfully retrieved from the session.</p>

</body>
</html>	
