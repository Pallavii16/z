<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>User Bean Example</title>
</head>
<body>

<jsp:useBean id="user" class="example.UserBean" scope="session" />

<!-- Automatically sets values from request -->
<jsp:setProperty name="user" property="*" />

<h2>User Details</h2>
<p>User ID: <jsp:getProperty name="user" property="id" /></p>
<p>User Name: <jsp:getProperty name="user" property="name" /></p>

</body>
</html>
