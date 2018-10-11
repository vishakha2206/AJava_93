<%-- 
    Document   : bean_1
    Created on : Aug 9, 2018, 9:57:24 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    
        <h1>Hello Bean</h1>
           
        <jsp:useBean id="test" class="Bean.bean_1" > </jsp:useBean>
        <% 
            test.setName("Vishakha");
            String name1= test.getName();
            out.println("Name set using getter and setter is "+name1);
            
            test.setId("16it093");
            String id1 = test.getId();
            out.println("    Id set using getter and setter is "+id1);
          
            
            test.setAge(20);
            int age1 = test.getAge();
            out.println("    Age set using getter and setter is "+age1);
        %>
        
        <jsp:setProperty name="test"  property="id" value="5"></jsp:setProperty>
        <br>
       Id  is :  <jsp:getProperty name="test" property="id"></jsp:getProperty> 
        
        
        <jsp:include page="bean_2.jsp"></jsp:include>
        
       <%-- <jsp:forward page="bean_2.jsp"></jsp:forward> --%>
        <jsp:element name="bean_xml.xml"  ></jsp:element>
        
        
      </body>
</html>
