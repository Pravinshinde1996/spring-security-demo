<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>
			Login Page
		</title>
		<body>
			<h3>My Login page</h3>
			<c:if test="${param.error !=null}">
				<p style="color:red">please enter valid Username & Password....!</p>
			</c:if>
			<c:if test="${param.logout !=null}">
				<p style="color:red">logout done Successfully..!</p>
			</c:if>
			<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
				<p>UserName:<input type="text" name="username"/></p>
				<p>password:<input type="password" name="password"/></p>
				<input type="submit" value="login" />
			</form:form>
		</body>
	</head>
</html>