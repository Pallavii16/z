<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Input Example</title>
</head>
<body>

<h2>Enter your name:</h2>
<form method="get">
    Name: <input type="text" name="username">
    <input type="submit" value="Submit">
</form>

<%
    String name = request.getParameter("username");
    if (name != null && !name.isEmpty()) {
        out.println("<h3>Hello, " + name + "!</h3>");
        out.println("Current Time: " + new java.util.Date());
    }
%>

</body>
</html>
