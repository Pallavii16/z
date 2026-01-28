<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="user" class="example.StandardAction" scope="session"/>
<jsp:setProperty name="user" property="*"/>
<html>

<body>
<h2>User Details (Using Standard Action Tags)</h2>

<p>Name: <jsp:getProperty name="user" property="name" /></p>
<p>Age: <jsp:getProperty name="user" property="age" /></p>
<hr>

<h3>Including another JSP</h3>
<jsp:include page="footer.jsp" />
<br><br>

<h3>Forwarding Example</h3>
<jsp:forward page="Succesjsp.jsp" />

</body>
</html> 
