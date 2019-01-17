<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Register</title>
</head>
<body>
<%@include file="Master.jsp" %>
<h1>welcome to Vendor Register Page!!</h1>
<form action="saveVen" method="post">
<pre>
Id  :<input type="text" name="venId"/>
Code:<input type="text" name="venCode"/>
Name:<input type="text" name="venName"/>
Type: <select name="venType">
        <option>--select--</option>
        <option>Regular</option>
        <option>Contract</option>
	  </select>
Email:<input type="text" name="venEmail"/>	  
Mobile:<input type="text" name="venMobile"/>	  
Address :<textarea name="venAddr"></textarea>
<input type="submit" value="Register"/><input type="reset" value="Clear">
</pre>
</form>
${value}<br/>

</body>
</html>


