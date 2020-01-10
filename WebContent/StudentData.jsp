<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Menu.jsp"%>
<h3>Welcome to Student Data Page!!</h3>
<table border="1">
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>GENDER</th>
		<th>EMAIL</th>
		<th>MOBILE</th>
		<th>QUALIFICATION</th>
		<th>ADDRESS</th>
		<th>OPERATION</th>
	</tr>
	<c:forEach items="${stdList }" var="std">
		<tr>
			<td><c:out value="${std.stdId }"/> </td>
			<td><c:out value="${std.stdName }"/> </td>
			<td><c:out value="${std.stdGen }"/> </td>
			<td><c:out value="${std.stdEmail }"/> </td>
			<td><c:out value="${std.stdContact }"/> </td>
			<td><c:out value="${std.stdQual }"/> </td>
			<td><c:out value="${std.stdAddr }"/> </td>
			<td>
				<a href="studentdelete?stdId=${std.stdId}">DELETE</a>
			</td>
		</tr>
	</c:forEach>
</table>
${message}
</body>
</html>


