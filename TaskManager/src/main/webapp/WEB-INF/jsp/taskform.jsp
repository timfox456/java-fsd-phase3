<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task</title>
</head>
<body>

<form action="task" method="post">
 <label for="fname">First name:</label><br>
  <input type="text" id="fname" name="fname"><br>
  <label for="lname">Last name:</label><br>
  <input type="text" id="lname" name="lname"><br>
  <label for="sdate">Start Date:</label><br>
  <input type="date" id="sdate" name="sdate"><br>
  <label for="edate">End Date:</label><br>
  <input type="date" id="edate" name="edate"><br>
  <label for="desc">Description:</label><br>
  <textarea id="desc" name="desc" rows=10 cols=30></textarea><br>
  <label for="sev">Severity</label><br>
  <select id="sev" name="sev">
  	<option value="high">High</option>
  	<option value="medium">Medium</option>
  	<option value="low">Low</option>
  </select>
  
  
  
   
  <br>
  <input type="submit" value="Submit">

</form>
</body>
</html>