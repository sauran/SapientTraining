<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Employee Information:
<form:form action="/SpringMVC/addEmployee" method="post">
<table>
  <tr>
    <td><form:label path="id">Id</form:label></td>
    <td><form:input path="id" /></td>
  </tr>
  <tr>
    <td><form:label path="fullName" >FullName</form:label></td>
    <td><form:input path="fullName" /></td>
  </tr>
  <tr>
    <td><form:label path="age">Age</form:label></td>
    <td><form:input path="age"/></td>
  </tr>
  <tr>
  	<td colspan="2"><input type="submit" value="Submit"/></td>
  </tr>
</table>
</form:form>





