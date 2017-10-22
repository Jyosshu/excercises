<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="common/header.jspf"  %>
	<h2>FizzBuzz Revisited</h2>
	
	<div>
		<p> Divisible By: <c:out value="${fizzed.divisorOne}" /> <br>
			Divisible By: <c:out value="${fizzed.divisorTwo}" /> <br>
			Divisible By Both: <c:out value="${fizzed.divisorOne}" /> and <c:out value="${fizzed.divisorTwo}" /> 
		</p>
	</div>
	<div>
		<p> Alternative Fizz: <c:out value="${fizzed.altFizz}" /> <br>
			Alternative Buzz: <c:out value="${fizzed.altBuzz}" /> <br> 
		</p>
	</div>	
	<div>
		<c:forEach items="${fizzed.doFizzBuzz()}" var="fizzBuzzVar">
			<c:out value="${fizzBuzzVar}" /><br>
		</c:forEach>
	</div>
</body>
</html>