<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String req = (String) request.getAttribute("flu1"); %>
	Requisição: <%= req %>
	<% String ses = (String) session.getAttribute("flu2"); %>
	Session: <%= ses %>
	<% String app = (String) application.getAttribute("flu3"); %>
	Application : <%= app %>
	
	
</body>
</html>