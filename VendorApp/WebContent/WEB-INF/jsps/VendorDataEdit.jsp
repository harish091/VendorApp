<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Edit</title>
</head>
<body>
<%@include file="Master.jsp" %>
<h1>Welcome to Vendor Edit Page!!</h1>
<form action="updateVen" method="post">
<pre>
Id  :<input type="text" name="venId" value="${ven.venId}"  readonly="readonly"/>
Code:<input type="text" name="venCode" value="${ven.venCode}" />
Name:<input type="text" name="venName" value="${ven.venName}" />
Type: <select name="venType">
        <option>--select--</option>
	<c:choose>
	<c:when test="${ven.venType eq  'Regular'}">
        <option selected="selected">Regular</option>
        <option>Contract</option>
	</c:when>
	<c:otherwise>
	    <option>Regular</option>
        <option selected="selected">Contract</option>
	</c:otherwise>
	</c:choose>
	  </select>
Email:<input type="text" name="venEmail" value="${ven.venEmail}" />	  
Mobile:<input type="text" name="venMobile" value="${ven.venMobile}" />	  
Address :<textarea name="venAddr">${ven.venAddr}</textarea>
<input type="submit" value="Update" />
</pre>
</form>
</body>
</html>