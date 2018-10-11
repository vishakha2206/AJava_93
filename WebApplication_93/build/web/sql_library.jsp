<%-- 
    Document   : sql_library
    Created on : Aug 10, 2018, 9:52:25 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
    
        <h1>Hello World!</h1>
        
        <sql:setDataSource var="conn" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/16it093" user="root" password=""></sql:setDataSource>
        
        <sql:update dataSource="${conn}" sql="Insert into crud_op(Id,Name) Values ('93','Vishakha')"></sql:update>
        
        <sql:update dataSource="${conn}">
            Insert into crud_op(Id,Name) Values ("5","Priya");
        </sql:update>
            
        <sql:query var="result" dataSource="${conn}">
            select * from crud_op;    
        </sql:query>
            
            <table border='1'>
                <tr>
                    <td>Id</td>
                    <td>Name</td>
                </tr>
            
        <c:forEach var="row" items="${result.rows}" >
            <tr>
                <td> <c:out value="${row.Id}"></c:out></td>
                <td> <c:out value="${row.Name}"></c:out></td>
             
            </tr>
                
        </c:forEach>
             
            </table>
        
    </body>

    </html>