<%-- 
    Document   : all_library
    Created on : Aug 10, 2018, 10:19:53 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <c:set var="a" value="${param.val}" ></c:set>
        <c:out value="Value entered is ${a}  "></c:out>
        
        <c:if test="${1<=a && a<=100}">
            <c:redirect url="https://www.google.com/"></c:redirect>
        </c:if>
        
    </body>
</html>
