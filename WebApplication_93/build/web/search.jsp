<%-- 
    Document   : search
    Created on : Aug 10, 2018, 10:37:14 AM
    Author     : Admin
--%>

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
        
        <form name="search" action="search.jsp">
            Enter price: <input type="text" name="price" value="" size="5" />
            <br>
            <br>
            <input type="submit" value="Submit" name="Submit" />
        </form>
        
        <br>
        <br>
        
        <sql:setDataSource var="conn" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/16it093" user="root" password=""></sql:setDataSource>
         
        <sql:query var="result" dataSource="${conn}">
            select * from add_book_detail;    
        </sql:query>
            
            <table border='1'>
                <tr>
                    <td>Book_Title</td>
                    <td>Book_Price</td>
                    <td>Book_Author</td>
                    <td>Id</td>
                </tr>
            
        <c:forEach var="row" items="${result.rows}" >
            <tr>
                <td> <c:out value="${row.Book_Title}"></c:out></td>
                <td> <c:out value="${row.Book_Price}"></c:out></td>
                 <td> <c:out value="${row.Book_Author}"></c:out></td>
                <td> <c:out value="${row.Id}"></c:out></td>
             
            </tr>
                
        </c:forEach>
        </table>
            
            
             
    </body>
</html>
