<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<%-- <%@ taglib prefix="security"  uri="http://www.springframework.org/security/tags" %> --%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>Heeloo pravin</h1>
<sec:authorize access="isAuthenticated()"> 
<!-- dispaly username name role -->
<p>Username:<sec:authentication property="principal.username"/></p>
<p>Role:<sec:authentication property="principal.authorities"/></p>
</sec:authorize>
<hr>

<form:form action="${pageContext.request.contextPath}/logout" method="POST">
	<input type="submit" value="logout"/>
</form:form>
