<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<h2>Private Conversation with <c:out value="${conversation.withUser}"/></h2>

<ol class="message-list">
	<c:forEach items="${conversation.messages}" var="message">
		<c:choose>
			<c:when test="${conversation.forUser == message.fromUsername}">
				<c:set var="fromto" value="from" />
			</c:when>
			<c:otherwise>
				<c:set var="fromto" value="to" />
			</c:otherwise>
		</c:choose>
		<li class="message ${fromto}">
			<span class="username"><c:out value="${message.fromUsername}" /></span>
			<span class="message-text"><c:out value="${message.text}" /></span>
			<time class="timeago" datetime=" <c:out value="${message.createTime}"/> ">${message.createTime}</time>
		</li>
	</c:forEach>
</ol>

<c:import url="/WEB-INF/jsp/footer.jsp" />