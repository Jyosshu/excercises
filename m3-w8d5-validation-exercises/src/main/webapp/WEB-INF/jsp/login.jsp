<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="pageTitle" value="Login"/>

<%@include file="common/header.jspf" %>

<h2>Login</h2>
		<div class="form-container">
			<c:url var="loginSubmitUrl" value="/login"/>
			<form:form method="POST" action="${loginSubmitUrl}" modelAttribute="login" class="login-form">
				
				<div class="email-container">
					<label for="email">Email Address</label>
					<form:input path="email" placeholder="enter email"/>
					<form:errors path="email" cssClass="error" />
				</div>
				<div class="password-container">
					<label for="password">Password</label>
					<form:input type="password" path="password" placeholder="enter password"/>
					<form:errors path="password" cssClass="error" />
				</div>
				<div>
					<input type="submit" value="Submit" class="login-button" />
				</div>											
			</form:form>			
		</div>	
<%@include file="common/footer.jspf" %>
