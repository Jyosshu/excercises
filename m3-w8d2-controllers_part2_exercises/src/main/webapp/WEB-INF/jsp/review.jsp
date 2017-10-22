<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@include file="common/header.jspf"  %>

	<h2>Post a Review</h2>
	
	<div class="post-review-container">
		<c:url var="formUrl" value="/review" />
		<form:form method="POST" action="${formUrl}" modelAttribute="review">
			<form:errors path="*" cssClass="error" />
			
			<form:input path="username" placeholder="Username" />
			<form:errors path="username" cssClass="error" /><br>
			
			<form:input path="title" placeholder="Title" />
			<form:errors path="title" cssClass="error" /><br>
			
			<fieldset class="rating">
    			<input type="radio" id="star5" name="rating" value="5" /><label class = "full" for="star5" title="Awesome - 5 stars"></label>
			    <input type="radio" id="star4" name="rating" value="4" /><label class = "full" for="star4" title="Pretty good - 4 stars"></label>
			    <input type="radio" id="star3" name="rating" value="3" /><label class = "full" for="star3" title="Meh - 3 stars"></label>
			    <input type="radio" id="star2" name="rating" value="2" /><label class = "full" for="star2" title="Kinda bad - 2 stars"></label>
			    <input type="radio" id="star1" name="rating" value="1" /><label class = "full" for="star1" title="Sucks big time - 1 star"></label>
			</fieldset><br>
			
			<%-- <label for="rating">Rating: </label>
			<form:input path="rating" placeholder="Rating" class="form-rating"/>
			<form:errors path="rating" cssClass="error" /><br> --%>
			
			<p> <form:input path="text" placeholder="Type your review here..." class="form-text"/> </p>
			<form:errors path="text" cssClass="error" /><br>
			
			<input type="submit" value="Submit Review"/>
		</form:form>
	</div>

<%@include file="common/footer.jspf"  %>