<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file="common/header.jspf" %>

    <section id="main-content">

		<h1>Toy Department</h1>
		
		<table id="productTable">
			<tr>
				<th>&nbsp;</th>
					<c:forEach items="${products}" var= "product">
						<td> <a href="productDetail?productId=${product.productId}" > <img src="img/${product.imageName}" alt="${product.name}" class="table-product-image"/> </a> </td>
					</c:forEach>
			</tr>	
			<tr>
				<th>&nbsp;</th>
					<c:forEach items="${products}" var= "product">
						<td> <span class="table-best-seller"> <c:out value="${product.topSeller? 'BEST SELLER!': ''}"/></span> </td>
					</c:forEach>
			</tr>	
						
			<tr class="shaded">
				<th>Name</th>
					<c:forEach items="${products}" var= "product">
						<td> <a href="recipeDetail?productId=${product.productId}" ><c:out value="${product.name}"/> </a></td>
					</c:forEach>
			</tr>	
			
			<tr>	
				<th>Rating</th>
					<c:forEach items="${products}" var= "product">
						<td>
							<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
						
							<img src="img/${formattedRating}-star.png" class="rating"/>
							
						</td>
					</c:forEach>
			</tr>				
			
			<tr class="shaded">	
				<th>Mfr</th>
					<c:forEach items="${products}" var= "product">
						<td> <c:out value="${product.manufacturer}"/> </td>
					</c:forEach>
			</tr>		
				
			<tr>	
				<th> Price </th>
					<c:forEach items="${products}" var= "product">
						<td class="table-price"> $<c:out value="${product.price}"/></td>
					</c:forEach>
			</tr>	
			
			<tr class="shaded">	
				<th> wt. (in lbs) </th>
					<c:forEach items="${products}" var= "product">
						<fmt:formatNumber maxFractionDigits="0" value="${product.weightInLbs}" var="formattedWeight"/>
						<td> <c:out value="${formattedWeight}"/> </td>
					</c:forEach>
			</tr>	
			
		</table>
       

    </section>
</body>
</html>