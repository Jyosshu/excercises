<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<h2>Latest Messages</h2>
<ol class="message-list">
	<c:forEach items="${messages}" var="message">
		<li class="message">
			<c:url var="messageHref" value="/messages">
				<c:param name="userName" value="${message.fromUsername}" />
			</c:url>
			<span class="username"><a href="${messageHref}"><c:out value="${message.fromUsername}" /> </a></span>
			<span class="message-text"> <c:out value="${message.text}" /> </span>
			<time class="timeago" datetime="<c:out value="${message.createTime}" /> "><c:out value="${message.createTime}" /> </time>
			
			<c:if test="${message.fromUsername == currentUser}">
				<c:url var="deleteMessage" value="/deleteMessage"/>
				<form method="POST" action="${deleteMessage}"> 
					<input type="hidden" name="id" value=" <c:out value="${message.id}"/> "/>
					<input type="hidden" name="fromUsername" value=" <c:out value="${message.fromUsername}"/> "/>
					<input class="btn btn-default button" type="submit" value="DELETE"/>
				</form>
			</c:if>
		</li>
	</c:forEach>
</ol>
		
<c:import url="/WEB-INF/jsp/footer.jsp" />
		