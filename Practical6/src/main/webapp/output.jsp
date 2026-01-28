<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<c:set var="name" value="${param.uname}" />
Name: <c:out value="${name}" />

</body>
</html>
