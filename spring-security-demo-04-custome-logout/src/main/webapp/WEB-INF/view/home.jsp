<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<h1>Heeloo pravin</h1>

<form:form action="${pageContext.request.contextPath}/logout" method="POST">
	<input type="submit" value="logout"/>
</form:form>