<%-- 
    Document   : questionJsp
    Created on : 6 juin 2017, 22:33:58
    Author     : HB
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Question</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        Utilisateur ${joueurConnecte.nom}, ton meilleur score doit être améliorré
        <br/>
        <br/>
        <br/>
        <br/>
        le verbe à trouver est ${verbePasse.baseVerbale}
        <br/>

        <form method="post" action="controleReponseServlet">
            ${verbePasse.baseVerbale}
            <label>preterit</label>
            <input type="text" name="preterit" placeholder="preterit"/>
            <label>participe passe</label>
            <input type="text" name="participePasse" placeholder="participe passe"/>
            <input type="submit" value="Envoyer"/>
        </form>
    </body>
</html>
