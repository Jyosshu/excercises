<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="common/header.jspf"  %>

<h1>Ordered Name</h1>

	<div>
		<p>First name: <c:out value="${arrangedName.firstName}" /></p>
		<p>Middle name: <c:out value="${arrangedName.middleName}" /></p>
		<p>Last name: <c:out value="${arrangedName.lastName}" /></p>
		
		<p>Ordered: <c:out value="${arrangedName.orderedName}" /></p>
	</div>

</body>
</html>