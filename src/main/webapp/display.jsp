<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Result</title>
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
    crossorigin="anonymous"
/>
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<div class="studentDetails">
	    <h1>Student details</h1>
	    <table>
	        <tr>
	            <td><h3>Name:  </h3></td>
	            <td><h3>Sourya </h3></td>
	        </tr>
	        <tr>
	            <td><h3>Roll:  </h3></td>
	            <td><h3>111 </h3></td>
	        </tr>
	    </table>
	</div>
	<table class="table table-striped table-hover result_table">
	    <tr class="table-dark">
	        <th>Subject name</th>
	        <th>marks</th>
	        <th>Grade</th>
	    </tr>
	    <tr>
	        <td>Lorem</td>
	        <td>ipsum</td>
	        <td>dolor</td>
	    </tr>
	    <tr>
	        <td>Lorem</td>
	        <td>ipsum</td>
	        <td>dolor</td>
	    </tr>
	    <tr>
	        <td>Lorem</td>
	        <td>ipsum</td>
	        <td>dolor</td>
	    </tr>
	    <tr>
	        <td>Total marks</td>
	        <td colspan="2">95</td>
	    </tr>
	    <tr>
	        <td>Grade</td>
	        <td colspan="2">E</td>
	    </tr>
	</table>
	<script
	    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	    integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	    crossorigin="anonymous">
	</script>
</body>
</html>