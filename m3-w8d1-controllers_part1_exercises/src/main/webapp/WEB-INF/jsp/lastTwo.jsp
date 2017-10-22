<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="common/header.jspf"  %>

	<h2>Reverse Last Two Characters</h2>
	
	<c:url var="reverseFormLink" value="/lastTwoResult" />
	<form method="GET" action="${reverseFormLink}">
		<div>
			<label for="wordOne">Word 1:  </label>
			<input style="text" name="wordOne" id="wordOne">
		</div>
		<div>
			<label for="wordTwo">Word 2:  </label>
			<input style="text" name="wordTwo" id="wordTwo">
		</div>		
		<div>
			<label for="wordThree">Word 3:  </label>
			<input style="text" name="wordThree" id="wordThree">
		</div>		
		<div>
			<label for="wordFour">Word 4:  </label>
			<input style="text" name="wordFour" id="wordFour">
		</div>
		<div>
			<label for="wordFive">Word 5:  </label>
			<input style="text" name="wordFive" id="wordFive">
		</div>				
		<div>
			<label for="wordSix">Word 6:  </label>
			<input style="text" name="wordSix" id="wordSix">
		</div>
		<div>
			<label for="wordSeven">Word 7:  </label>
			<input style="text" name="wordSeven" id="wordSeven">
		</div>		
		<div>
			<label for="wordEight">Word 8:  </label>
			<input style="text" name="wordEight" id="wordEight">
		</div>		
		<div>
			<label for="wordNine">Word 9:  </label>
			<input style="text" name="wordNine" id="wordNine">
		</div>
		<div>
			<label for="wordTen">Word 10: </label>
			<input style="text" name="wordTen" id="wordTen">
		</div>		
			<div>
			<input type="submit">
		</div>					
	</form>
</body>
</html>
		