var request;

function getres() {
	var url = 'http://localhost:8080/JerseyJsonTest/rest/employeeService/getAll';
	if (window.XMLHttpRequest) {
		request = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		request = new ActiveXObject("Microsoft.XMLHTTP");
	}
	request.open("Get", url, true);
	request.onreadystatechange = callback;
	request.send(null);

}

function callback() {
	console.log("readystate - " + request.readyState);
	console.log("status - " + request.status);
	if (request.readyState == 4) {
		if (request.status == 200) {

			var ids = document.getElementById('ids');
			var emp = request.responseText;
			getxmll(request);

			ids.innerHTML = emp;
		}
	}

}

function getxmll(emp) {
	var empData = " <tr class='success'> <th>id</th> <th>name</th> <th>age</th> <th>salary</th> <th>bdate</th></tr>";
	var xmld = emp.responseXML;
	alert(xmld.getElementsByTagName('Employee'));
	var emps = xmld.getElementsByTagName('Employee');
	for ( var i = 0; i < emps.length; i++) {
		empData += "<tr><td>"
				+ emps[i].getElementsByTagName("id")[0].childNodes[0].nodeValue
				+ "</td><td>"
				+ emps[i].getElementsByTagName("name")[0].childNodes[0].nodeValue
				+ "</td><td>"
				+ emps[i].getElementsByTagName("age")[0].childNodes[0].nodeValue
				+ "</td><td>"
				+ emps[i].getElementsByTagName("salary")[0].childNodes[0].nodeValue
				+ "</td><td>"
				+ emps[i].getElementsByTagName("bdate")[0].childNodes[0].nodeValue
				+ "</td></tr>";

	}
	var empTable = document.getElementById("empos");
	empTable.innerHTML = empData;
}
