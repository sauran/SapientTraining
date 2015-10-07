<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>  Spring MVC International</h1>

language : <a href = "welcome?language=en">English</a>
<a href = "welcome?language=hi_IN">Hindi</a>


<h3>
   <spring:message code="welcome.greeting" text="Welcome"/>
</h3>
Current Locale : ${pageContext.response.locale }


</body>
</html>