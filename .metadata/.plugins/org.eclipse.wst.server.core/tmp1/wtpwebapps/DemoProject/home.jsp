<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userBean" class ="com.sapient.model.User" scope = "request"></jsp:useBean>
Welcome <jsp:getProperty property="fname" name="userBean"/>  <jsp:getProperty property="lname" name="userBean"/>

<%-- ${requestScope.userBean.fname } <br>
${requestScope.userBean.lname }<br>

${requestScope.userBean.fullName } --%>



<%-- ${requestScope.userBean.listName} --%>



</body>
</html>