<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="common/header.jspf"  %>

<section>
	<h2>Enter Name</h2>
	
	<c:url var="orderedNameUrl" value="/orderedResult" />
	<form method="GET" action="${orderedNameUrl}">
		<div> 	<label for="firstName">First name:</label> </div>
		<div>	<input type="text" name="firstName" id="firstName" /></div>
		<div>	<label for="middleName">Middle name:</label> </div>
		<div>	<input type="text" name="middleName" id="middleName" /> </div>
		<div>	<label for="lastName">Last name:</label> </div>
		<div>	<input type="text" name="lastName" id="lastName" />	</div>
		
		<h2>Choose Order</h2>
		
		<div>
			<input type="radio" name="order" value="firstMiLast"> First MI Last<br>
			<input type="radio" name="order" value="firstLast"> First Last<br>
			<input type="radio" name="order" value="lastFirstMi"> Last, First MI<br>
			<input type="radio" name="order" value="lastFirst"> Last, First
		</div>
		<div class="formGroup">
			<input type="submit" value="Submit" />
		</div>
	</form>
	
</section>

</body>
</html>
