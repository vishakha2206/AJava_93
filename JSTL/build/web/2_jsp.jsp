<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Xml Page</title>
    </head>
    <body>
        <h1>Welcome!</h1>
        <c:import url="file:///C:/Users/Admin/Documents/NetBeansProjects/16it093/JSTL/2_xml.xml" var="obj"></c:import>
        <x:parse var="xmldata" xml="${obj}"></x:parse>
        <c:set var="fooditem" value="${param.fooditem}"></c:set>
        <x:if select="$fooditem='Belgian Waffles'">
            <c:out value="Belgian Waffles Data:::"></c:out>
        </x:if>
        <x:if select="$fooditem='Strawberry Belgian Waffles'">
            <c:out value="Strawberry Belgian Waffles Data:::"></c:out>
        </x:if>
        <x:if select="$fooditem='Berry-Berry Belgian Waffles'">
            <c:out value="Berry-Berry Belgian Waffles Data:::"></c:out>
        </x:if>
        <br>
        <x:choose>
            <x:when select="$fooditem='Belgian Waffles'">
                Food item:
                <x:out select="$xmldata/breakfast_menu/food[1]/name"></x:out>
                Price:
                <x:out select="$xmldata/breakfast_menu/food[1]/price"></x:out>
                Description:
                <x:out select="$xmldata/breakfast_menu/food[1]/description"></x:out>
                Calories:
                <x:out select="$xmldata/breakfast_menu/food[1]/calories"></x:out>
            </x:when>
            <x:when select="$fooditem='Strawberry Belgian Waffles'">
                Food item:
                <x:out select="$xmldata/breakfast_menu/food[2]/name"></x:out>
                Price:
                <x:out select="$xmldata/breakfast_menu/food[2]/price"></x:out>
                Description:
                <x:out select="$xmldata/breakfast_menu/food[2]/description"></x:out>
                Calories:
                <x:out select="$xmldata/breakfast_menu/food[2]/calories"></x:out>
            </x:when>
           <x:when select="$fooditem='Berry-Berry Belgian Waffles'">
                Food item:
                <x:out select="$xmldata/breakfast_menu/food[3]/name"></x:out>
                Price:
                <x:out select="$xmldata/breakfast_menu/food[3]/price"></x:out>
                Description:
                <x:out select="$xmldata/breakfast_menu/food[3]/description"></x:out>
                Calories:
                <x:out select="$xmldata/breakfast_menu/food[3]/calories"></x:out>
            </x:when>
                <x:otherwise>
                    <c:out value="Invalid!!!"></c:out>
                </x:otherwise>
        </x:choose>
    </body>
</html>
