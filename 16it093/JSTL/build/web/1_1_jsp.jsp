<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="name" value="${param.name}"></c:set>
        <c:out value="Name is : ${name}"></c:out><br>
        
            
        <c:set var="sem" value="${param.sem}">   </c:set>
        <c:out   value="Sem is : ${sem}"></c:out><br>
     
         <c:if test="${name == 'abc'}">
            <c:redirect url="welcome.html"></c:redirect>
        </c:if>
        
        <c:if test="${name != 'abc'}">
            <c:out value="Try again!!!!"></c:out><br>
            <a href="<c:url value="1_1jstl.html"></c:url>">Login</a>
        </c:if>
            
    </body>
</html>
