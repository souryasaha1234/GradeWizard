<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input details</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
</head>
<body>
	<h1>Student details Entry</h1>
    <div class="container">
      <form action="ProcessServlet" method="POST">
      <div id="formfield">
        <h2>Student details</h2>
        <input type="text" name="sname" class="text" size="50" placeholder="Student's Name" required autocomplete="off">
        <input type="number" name="sroll" class="text" size="50" placeholder="Roll no" required autocomplete="off">
        <h2>Add Subject details</h2>
        <input type="text" name="subjectName" id="subject_Name" class="subject" size="50" placeholder="Subject name" required autocomplete="off">
        <input type="number" name="subjectMarks" id="subject_Marks" class="subject" size="50" placeholder="Subject marks"  step="0.1" min="0" max="100" required autocomplete="off">
      </div>
      <input name="submit" type="Submit" value="Get Report">
    </form>
      <div class="controls">
        <button class="add" onclick="add()"><i class="fa fa-plus"></i>Add</button>
        <button class="remove" onclick="remove()"><i class="fa fa-minus"></i>Remove</button>
      </div>
    </div>
  <script src="script.js"></script>
</body>
</html>