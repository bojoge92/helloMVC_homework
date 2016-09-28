<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<%-- JSP Expression Language --%>

	<h1>${customer.name} logged in successfully.</h1>

	<ul>
		<li>Id: ${customer.id}</li>
		<li>Name: ${customer.name}</li>
		<li>Gender: ${customer.gender}</li>
		<li>Email: ${customer.email}</li>
	</ul>

	<p>
		<a href="/helloMVC/index.jsp"> go to homepage</a>
	</p>

</body>

</html>