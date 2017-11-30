<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<script type="text/javascript">
	$(document).ready(function () {
		$.validator.addMethod('uppercase', function(value) {
			return value.match(/[A-Z]/);
		}); 
		$.validator.addMethod('lowercase', function(value) {
			return value.match(/[a-z]/);
		});
		$.validator.addMethod('numbers', function(value) {
			return value.match(/[0-9]/);
		});
		$("form").validate({
			
			rules : {
				userName : {
					required : true
				},
				password : {
					required : true,
					minlength : 15,
					uppercase : true,
					lowercase : true,
					numbers : true,	
				},
				confirmPassword : {
					required : true,		
					equalTo : "#password"  
				}
			},
			messages : {	
				password:  {
					minlength: "Password was too short.  It should be at least 15 characters",
					uppercase: "Password must contain Uppercase letters",
					lowercase: "Password must contain lowercase letters",
					numbers: "Password must contain a number",
				},
				confirmPassword : {
					equalTo : "Passwords do not match"
				}
			},
			errorClass : "error"
		});
	});
</script>

<c:url var="formAction" value="/users" />
<form:form method="POST" action="${formAction}" modelAttribute="newUser">
<input type="hidden" name="CSRF_TOKEN" value="${CSRF_TOKEN}" />
	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<div class="form-group">
				<label for="userName">User Name: </label>
				<form:input path="userName"  placeHolder="User Name" class="form-control" />
				<form:errors path="userName"></form:errors>
				<c:if test="${message != null }"> <c:out value="${message }"/></c:if>
			</div>
			<div class="form-group">
				<label for="password">Password: </label>
				<form:input type="password" path="password" placeHolder="Password" class="form-control" />
				<form:errors path="password"></form:errors>
			</div>
			<div class="form-group">
				<label for="confirmPassword">Confirm Password: </label>
				<form:input type="password" path="confirmPassword" placeHolder="Re-Type Password" class="form-control" />	
			</div>
			<button type="submit" class="btn btn-default">Create User</button>
		</div>
		<div class="col-sm-4"></div>
	</div>
</form:form>
		
<c:import url="/WEB-INF/jsp/footer.jsp" />