<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Location Edit</title>
</head>
<body>
<%@include file="Master.jsp" %>
<h1>Welcome to Location Edit Page!!</h1>
<form action="updateLoc" method="post">
<pre>
Location Id  : <input type="text" name="locId" value="${loc.locId}"  readonly="readonly"/>
Location Code: <input type="text" name="locCode" value="${loc.locCode}"/>
Location Name: <input type="text" name="locName" value="${loc.locName}"/>
Location Type: <c:choose>
                 <c:when test="${loc.locType eq 'Urban'}">
                   <input type="radio" name="locType" value="Urban" checked="checked">Urban        
                   <input type="radio" name="locType" value="Rural">Rural               
                 </c:when>
                 <c:otherwise>
                    <input type="radio" name="locType" value="Urban" >Urban
                    <input type="radio" name="locType" value="Rural" checked="checked">Rural
                 </c:otherwise>
			   </c:choose> 
               
<input type="submit" value="Update"/>               
</pre>
</form>
</body>
</html>