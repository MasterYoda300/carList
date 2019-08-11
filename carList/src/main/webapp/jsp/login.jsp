<%-- 
    Document   : Login
    Created on : Jul 28, 2019, 4:45:01 PM
    Author     : stoff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h3>Log in</h3>
            <form name="login" action="FrontController" method="POST">
                <input type="hidden" name="command" value="login"><br>
                <input type="text" name="email" placeholder="E-mail" required><br>
                <input type="password" name="password" placeholder="password" required><br>
                <input type="submit" value="Submit">
            </form>
            <h3> Register </h3>
            <form name="register" action="FrontController" method="POST">
                <input type="hidden" name="command" value="register"><br>
                <input type="text" name="email" placeholder="E-mail" required><br>
                <input type="text" name="userName" placeholder="Username" required><br>
                <input type="password" name="password1" placeholder="password" required><br>
                <input type="password" name="password2" placeholder="repeat password" required><br>
                <input type="submit" value="Submit">
            </form>
        </div>
         <% String error = (String) request.getAttribute("error");
            if (error != null) {
                out.println("<H2>Error!!</h2>");
                out.println(error);
            }
        %>
    </body>
</html>
