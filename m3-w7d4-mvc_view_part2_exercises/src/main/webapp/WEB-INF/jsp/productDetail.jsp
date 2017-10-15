<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file="common/header.jspf" %>

    <section id="main-content">
    
    	<div class="content-container">
    		<div class="detail-product-image">
    			<c:url var="detailProductImage" value="img/${product.imageName}" />
 				<img src="${detailProductImage}" id="detailProductImage"/>
    		</div>
    		<div class="detail-product-info">
    			<ul>
    				<li class="detail-title"> <c:out value="${product.name}"/> <span class="detail-best-seller"> <c:out value="${product.topSeller? 'BEST SELLER!': ''}"/></span> </li>
    				<li>by <c:out value="${product.manufacturer}"/> </li>
    				<li> 
    					<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
						<img src="img/${formattedRating}-star.png" class="detail-rating"/>
					</li>
    			</ul>	
    			<ul>
    				<li class="detail-price">Price: $<c:out value="${product.price}"/> </li>
    				
    				<fmt:formatNumber maxFractionDigits="0" value="${product.weightInLbs}" var="formattedWeight"/>
    				<li><strong>Weight</strong>  <c:out value="${formattedWeight}"/> lbs</li>
    			</ul>
    			
    			<p class="detail-description"> <strong> Description: </strong> <c:out value="${product.description}" /> </p>
    		</div>
    	</div>
    
    </section>
</body>
</html>