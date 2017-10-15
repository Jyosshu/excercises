<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file="common/header.jspf" %>

    <section id="main-content">
		<h1>Toy Department</h1>
		
		<c:forEach items="${products}" var="product">
			<div class="list-container">
				
				<div class="list-image">
					<a href="productDetail?productId=${product.productId}" > <img src="img/${product.imageName}" alt="${product.name}" class="product-image"/> </a>
				</div>
				<div class="list-details">
					<ul style="list-style-type: none">
						<li class="list-name">
							<a href="productDetail?productId=${product.productId}" > <c:out value="${product.name}"/> </a> <span class="best-seller"><c:out value="${product.topSeller? 'BEST SELLER!': ''}"/></span> 
						</li>
						<li>
							by <c:out value="${product.manufacturer}"/>
						</li>
						<li class="list-price">
							$<c:out value="${product.price}"/>
						</li>
						<li>
							<fmt:formatNumber maxFractionDigits="0" value="${product.weightInLbs}" var="formattedWeight"/>
							<strong>Weight</strong> <c:out value="${formattedWeight}"/> lbs
						</li>	
						<li>
							<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
							<img src="img/${formattedRating}-star.png" class="list-rating"/>
						</li>		
					</ul>
				</div>

	        </div>
	       
		</c:forEach>
    </section>
</body>
</html>