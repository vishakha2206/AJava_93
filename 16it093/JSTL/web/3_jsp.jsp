<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SQL Page</title>
    </head>
    <body>
        <sql:setDataSource var="obj" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/16it093" user="root" password=""></sql:setDataSource>
        <sql:update dataSource="${obj}" var="va1" sql="INSERT INTO new values (?,?,?)">
            <sql:param value="${param.id}"></sql:param>
            <sql:param value="${param.name}"></sql:param>
            <sql:param value="${param.birthdate}"></sql:param>
        </sql:update>
        <sql:query var="rs">
            select * from new
        </sql:query>
            
    </body>
</html>
