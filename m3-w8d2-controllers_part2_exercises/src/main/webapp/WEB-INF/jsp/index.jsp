<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="common/header.jspf"  %>


<div class="content-container">

	<div class="image-container">
		<c:url var="imgUrl" value="/img/forDummies.png"/>
		<img src="${imgUrl}" />
	</div>
	<div class="description-container">
		<h3>Reviews</h3>
		<div class="reviews">
			<c:forEach items="${reviews}" var="tempReview">
				<div class="review-container">
					<ul class="review-list">
						<li> <strong> <c:out value="${tempReview.title}" /> </strong> (<c:out value="${tempReview.username}" />) </li>
						<li> 
							<p> 
							
								<c:out value="${tempReview.formatedDate}" /> 
							</p> 
						</li>
						<li>
							<c:url var="ratingImg" value="/img/star.png" />
							<c:forEach var = "i" begin = "1" end = "${tempReview.rating}">
								<img src="${ratingImg}" />
							</c:forEach>
						</li>
						<li> <p> <c:out value="${tempReview.text}" /> </p> </li>
					</ul>
				</div>
			</c:forEach>
		</div>
	</div>
</div>
<%@include file="common/footer.jspf"  %>