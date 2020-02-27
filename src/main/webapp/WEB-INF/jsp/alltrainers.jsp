<%-- 
    Document   : alltrainers
    Created on : Feb 21, 2020, 11:25:44 AM
    Author     : panos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>All Trainers</h1>
        <table border="1">
            <tr><td>Name</td><td>Age</td></tr>
            <c:forEach items="${oloitrainers}" var="t">
                
<tr>                
                <td>${t.trainername}</td><td>${t.trainerage}</td>
                <td><a href="update/${t.trainerid}">Update</td>
                <td><a href="delete/${t.trainerid}">Delete</td>
   </tr>
            </c:forEach>
            
        </table>
        
        
        
        <a href="home">BACK TO MAIN</a>
        
    </body>
</html>
