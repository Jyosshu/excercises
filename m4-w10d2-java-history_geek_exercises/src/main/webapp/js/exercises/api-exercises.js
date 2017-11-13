/// <reference path="../jquery-3.1.1.js" />

var root = 'http://localhost:8080/m4-java-historygeek-exercises/';

$(document).ready(function () {
    
	$('#BillingPostalCode').on('change', function(event) {
		$.ajax({
			url: root + "/api/getTax",
			method: 'GET',
			data: {
				'BillingPostalCode': $(this).val(),
				'subtotal': $(this).val(),
			}
		}).then (function(data) {
			
		});
	})
});