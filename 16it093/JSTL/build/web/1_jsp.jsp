<%--core library set,choose,when,out,otherwise,remove--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Core Library Demo</title>
    </head>
    <body>
        <c:set var="month" value="${param.month}">    
        </c:set>
        <c:choose>
            <c:when test="${month>=1 && month<=4}">
                <c:out value="Month is : ${month}" ></c:out><br>
        <c:out value="Season is Winter"></c:out>
        </c:when>
        
        <c:when test="${month>=5 && month<=8}">
            <c:out value="Month is : ${month}" ></c:out><br>
        <c:out value="Season is Summer"></c:out>
        </c:when>
        
        <c:when test="${month>=9 && month<=12}">
            <c:out value="Month is : ${month}" ></c:out><br>
        <c:out value="Season is Monsoon"></c:out>
        </c:when>
        
        <c:otherwise>
            <c:out value="Invalid Month number"></c:out><br>
            <c:out value="Choose number from below list only:"></c:out>  <br>
        <c:forEach var="i" begin="1" end="12" >
                <c:out value="${i}"></c:out><br>
        </c:forEach>
        </c:otherwise>
       </c:choose>
        <c:remove var="month"></c:remove>
        <br> <c:out value="Month is: ${month}"></c:out><br>
        <h1> Names:</h1><br>  
        <c:forTokens items="abc/pqr/xyz/uvw" delims="/" var="name">
            <c:out value="${name}"></c:out><br>
        </c:forTokens>
    </body>
</html>
