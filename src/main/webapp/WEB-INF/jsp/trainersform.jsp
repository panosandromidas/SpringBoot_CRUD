<%-- 
    Document   : trainersform
    Created on : Feb 21, 2020, 11:04:59 AM
    Author     : panos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Trainer!</h1>
        <h2>ADD A TRAINER</h2>
        <form method="POST" action="submitform">
            <input type="text" name="trainername">trainer name
            <input type="text" name="trainerage">trainer age
            <input type="submit" >
            
        </form>
    </body>
</html>
