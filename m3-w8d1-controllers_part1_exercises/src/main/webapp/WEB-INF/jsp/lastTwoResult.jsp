<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="common/header.jspf"  %>
	<h2>FizzBuzz Revisited</h2>
	
	<div>
		<c:forEach items="${theLastTwo.lastTwo}" var="lastTwoEntry">
		<!-- <c:out value="${theLastTwo}" /> --> : <c:out value="${lastTwoEntry}" />
		</c:forEach>
	</div>
</body>
</html>