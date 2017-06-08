<%-- 
    Document   : connexionPage
    Created on : 7 juin 2017, 19:33:12
    Author     : HB
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PageDeConnexion</title>
    </head>
    <body>

        <%@include file="header.jsp"%>
        <br/>
        <br/>
        <form method="post" action="connexionServlet">
            <input type="text" name="email" placeholder="email"/>
            <input type="password" name="motDePasse" placeholder="1234"/>
            <input type="submit" value="Connexion"/>
        </form>
        <a href="inscription.jsp">inscription</a>
        <br/>
        <br/>
        <br/>
        <br/>
        HALL OF FAME<br/>
        Delphine    88 verbes<br/>
        Bruno       86 verbes<br/>
    </body>
</html>
