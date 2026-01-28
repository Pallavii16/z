<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String name = request.getParameter("uname");

// Store value in session
session.setAttribute("username", name);

// Redirect to display page
response.sendRedirect("DisplaySesson.jsp");
%>
