<%-- 
    Document   : inscription
    Created on : 7 juin 2017, 19:41:08
    Author     : HB
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>inscription</title>
    </head>
    <body>
        <%@include file="header.jsp"  %>
        <form method="post" action="inscriptionServlet">
            <input type="text" name="email" placeholder="email" />
            <input type="text" name="nom" placeholder="nom" />
            <input type="text" name="prenom" placeholder="prenom" />
            <input type="password" name="motDePasse" placeholder="motDePasse" />
            <input type="submit" value="Creer Mon Compte"/>
        </form>
    </body>
</html>
