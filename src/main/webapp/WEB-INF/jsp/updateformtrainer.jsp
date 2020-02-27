<%-- 
    Document   : updateformtrainer
    Created on : Feb 21, 2020, 12:15:03 PM
    Author     : panos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

            <h3>Update Trainer</h3>
            
                <table border="1">
                    <tr><td>${trainer.trainerid}</td><td>${trainer.trainername}</td><td>${trainer.trainerage}</td></tr>
<!--                    <form action="changetrainer/" method="POST">
                        <input name="trainerid" disabled value="">
                        <input name="trainername">alla3e onoma
                        <input name="trainerage">alla3e hlikia
                        <input type="submit">Submit
                    </form>-->
                </table>    
        <form:form method="POST" action="changetrainer"
                   modelAttribute="trainer">
            <form:label path="trainerid"></form:label>
            <form:input path="trainerid" placeholder="${trainer.trainerid}" type="hidden"/>
            <form:label path="trainername">Name</form:label>
            <form:input path="trainername" placeholder="${trainer.trainername}"/>
            <form:label path="trainerage" >Age</form:label>
            <form:input path="trainerage" placeholder="${trainer.trainerage}" />
            <input type="submit" value="Submit" />
        </form:form>
        
                    
                    
                
                
                
            









    </body>
</html>
