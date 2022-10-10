<%-- 
    Document   : login
    Created on : 10-Oct-2022, 12:07:43 AM
    Author     : Lynde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Login</h1>
        <form method="post" action="login">
            Username: <input type="text" name="username" value="${username}"><br>
            Password: <input type="password" name="password"  value="${password}"><br>
            <input type="submit"  value="Login">
            <p>${message}</p>
        </form>
    </body>
</html>
