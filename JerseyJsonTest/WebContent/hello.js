$(document).ready(function() {
	$.ajax({
		url : 'http://localhost:8080/res/rest/employeeService/get/1',
		type : 'GET',
		data : 1,
		success : function(dt) {
			alert("from hello.js" + dt.Employee);

		}
	});

	tdclicka();
});

function tdclicka() {
	$("#empos").on("click", "td", function(e) {
		// alert($( this ).text());
		// $( this ).css("font-weight","bold");
		alert("cliked");
		// e.stopPropagation();
	});
}