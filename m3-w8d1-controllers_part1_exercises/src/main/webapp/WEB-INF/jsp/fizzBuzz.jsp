<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="common/header.jspf"  %>

	<h2>FizzBuzz Revisited</h2>
	
	<c:url var="fizzBuzzFormLink" value="/fizzBuzzResult" />
	<form method="GET" action="${fizzBuzzFormLink}">
		<div>
			<label for="divisorOne">Divisible By:</label><br>
			<input style="text" name="divisorOne" id="divisorOne">
		</div>
		<div>
			<label for="divisorTwo">Divisible By:</label><br>
			<input style="text" name="divisorTwo" id="divisorTwo">
		</div>
		<div>
			<label for="altFizz">Alternate Fizz:</label><br>
			<input style="text" name="altFizz" id="altFizz">
		</div>
		<div>
			<label for="altBuzz">Alternate Buzz:</label><br>
			<input style="text" name="altBuzz" id="altBuzz">
		</div>
		
		<div>
			<label for="numOne">Number 1:</label>
			<input style="text" name="numOne" id="numOne">
		</div>
		<div>
			<label for="numTwo">Number 2:</label>
			<input style="text" name="numTwo" id="numTwo">
		</div>
		<div>
			<label for="numThree">Number 3:</label>
			<input style="text" name="numThree" id="numThree">
		</div>
		<div>
			<label for="numFour">Number 4:</label>
			<input style="text" name="numFour" id="numFour">
		</div>
		<div>
			<label for="numFive">Number 5:</label>
			<input style="text" name="numFive" id="numFive">
		</div>	
		<div>
			<input type="submit">
		</div>					
	</form>
</body>
</html>
