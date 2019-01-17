<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Data </title>
<style type="text/css">
table tr th {
	color: white;
	background-color: black;
}
</style>
</head>
<body>
<%@include file="Master.jsp" %>
<h1>Welcome to Vendor Data Page!!</h1>
<c:if test="${!empty vObj}">
<table border="1">
 <tr>
 	<th>ID</th>
 	<th>CODE</th>
 	<th>NAME</th>
 	<th>TYPE</th>
 	<th>EMAIL</th>
 	<th>MOBILE</th>
 	<th>ADDRESS</th>
 	<th colspan="2">OPERATIONS</th>
 </tr>
 
 <c:forEach items="${vObj}" var="ven">
 	<tr>
 		<td><c:out value="${ven.venId}"/> </td>
 		<td><c:out value="${ven.venCode}"/> </td>
 		<td><c:out value="${ven.venName}"/> </td>
 		<td><c:out value="${ven.venType}"/> </td>
 		<td><c:out value="${ven.venEmail}"/> </td>
 		<td><c:out value="${ven.venMobile}"/> </td>
 		<td><c:out value="${ven.venAddr}"/> </td>
 		<td>
 			<a href="deleteVen?venId=${ven.venId}">
 				 <img src="../images/delete.png" width="20" height="20"/>
 			</a>
 		</td>
 		<td>
 			<a href="editVen?venId=${ven.venId}">
 				<img src="../images/edit.png" width="20" height="20">
 			</a>
 		</td>
 	</tr>
 </c:forEach>
 
</table>
</c:if>
<c:if test="${empty vObj}">
<h2>No Records Found</h2>
</c:if> 
</body>
</html>