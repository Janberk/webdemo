<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="UTF-8">
</head>

<body>

<h1><s:message code="fruit.APPLE"/></h1>

<select name='fruit'>
    <c:forEach items="${fruits}" var="val">
        <option value="<s:message code='fruit.${val}' htmlEscape="false"/>">${val}</option>
    </c:forEach>
</select>

</body>

</html>
