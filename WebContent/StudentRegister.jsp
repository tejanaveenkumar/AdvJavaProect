<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Register Page</title>
</head>
<body>
<%@include file="Menu.jsp"%>
<h3>Welcome to Student Register Page</h3>
<form action="studentinsert" method="post">
<pre>
NAME     : <input type="text" name="stdName"/>
GENDER   : <input type="radio" name="stdGen" value="Male"> Male <input type="radio" name="stdGen" value="Female"> Female  
EMAIL    : <input type="text" name="stdEmail"/> 
MOBILE   : <input type="text" name="stdContact"/>
QUAL     : <select name="stdQual">
			<option value="">-select-</option>
			<option>BE</option>
			<option>BSc</option>
			<option>BEd</option>
			<option>BTECH</option>
			<option>BCA</option>
			<option>MCA</option>
			<option>MTech</option>
			<option>MCom</option>
			<option>MSc</option>
			<option>Other</option>
			</select>
ADDRESS :<textarea name="stdAddr"></textarea>
	<input type="submit" value="Register"/>
</pre>
</form>
${message}
</body>
</html>


