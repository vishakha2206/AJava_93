
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>CORE LIBRARY</h1>
        
        <c:set var="x" value="20"></c:set>
        <c:out  value="Value of x is ${x}"></c:out>
        
        <c:set var="uname" value="${param.u_name}"></c:set>
        <br>
        <br>
        
        <c:out value="User name is ${uname}"></c:out>
        <br>
        <br>
        
        <c:if test="${uname == 'vishakha'}">
            <c:out value="Welcome ${uname}"></c:out>
        </c:if>
        
        <br>
        <br>
        
        <c:set var="mon" value="${param.month}"></c:set>
        <c:out value="Your month is ${mon}"></c:out>
        
        <br>
        <br>
        
        <c:choose>
            <c:when test="${mon>=1 && mon<=4}">
                <c:out value="${mon} falls in Winter season"></c:out>
            </c:when>
            
            <c:when test="${mon>=5 && mon<=8}">
                <c:out value="${mon} falls in Summer season"></c:out>
            </c:when>
            <c:when test="${mon>=9 && mon<=12}">
                <c:out value="${mon} falls in Rainy season"></c:out>
            </c:when>
            
            <c:otherwise>You have entered wrong month</c:otherwise>
            
        </c:choose>
            <br>
        <br>
            
        <c:forEach var="i" begin="1" end="10" step="2">
            <c:out value="i is ${i}">
                <br>
                <br>
            </c:out>
            
        </c:forEach>
        
         <c:catch>
            <%
                try
                {
                    int a=10;
                     int b=20;
                    int c= b/0;
                    out.println("b/0" );
                }
                catch(Exception e)
                {
                    out.println("Error is " + e.getMessage());
                }
            
            %> 
         </c:catch>
        
        <%--<c:redirect url="https://www.google.com/"></c:redirect>--%>
    

