<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<sec:authorize access="isAuthenticated()">
<h1>Manager Home page..!</h1>
<hr>
<a href="${pageContext.request.contextPath}/">Back To Homepage</a>
</sec:authorize>