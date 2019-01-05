<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:errors path="product1.*"/>
<form action="${pageContext.request.contextPath}/addproducts" method="POST">

Product Name: <input type="text" name="pName"/>

Product Cost: <input type="text" name="pCost"/>

Product Qty: <input type="text" name="pQty"/>

Product DOM: <input type="text" name="pDOM"/>

<input type="submit" value="Submit"/>

</form>
</body>
</html>