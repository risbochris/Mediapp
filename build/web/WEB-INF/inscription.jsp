<%-- 
    Document   : inscription
    Created on : ******
    Author     : risbochris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>


        <meta charset="UTF-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--meta http-equiv="X-UA-Compatible" content="IE=edge" /-->	
        <title>Inscription</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />

        <!-- stylesheets -->
        <link rel="stylesheet" type="text/css" href="Ressources/css/compiled/theme.css" />
        <link rel="stylesheet" type="text/css" href="Ressources/css/vendor/brankic.css" />
        <link rel="stylesheet" type="text/css" href="Ressources/css/vendor/ionicons.min.css" />
        <link rel="stylesheet" type="text/css" href="Ressources/css/vendor/font-awesome.min.css" />

        <!-- javascript -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <script src="js/theme.js"></script>
    </head>
    <body id="signup">
        <a href="/" class="logo">
            <i class="brankic-pen"></i>
        </a>
        
        <h3>Nouveau médiathécaire</h3>
        <div class="content">
            
            <div class="alert-danger">
                <c:out value="${requestScope.erreur}"/>
            </div>
            
            <form method="POST" action="Register">
                <div class="fields">
                    <strong>Informations personnelles</strong>
                    <input class="form-control" name="nom" type="text" placeholder="Nom" />
                    <input class="form-control" name="prenom" type="text" placeholder="Prénoms" />
                    <input class="form-control" name="adresse" type="text" placeholder="Adresse complète" />
                </div>
                <div class="fields">
                    <strong>Informations de connexion</strong>
                    <input class="form-control" name="mail" type="text" placeholder="Email" />
                    <input class="form-control" name="pwd" type="password" placeholder="Mot de passe" />
                </div>
                <div class="signup">
                    <input type="submit" value="Inscription" class="btn btn-success btn-lg" />	
                </div>
            </form>
        </div>
        <div class="bottom-wrapper">
		<div class="message">
			<span>Accéder à votre tableau de bord</span>
			<a href="/Dashboard">ici</a>.
		</div>
	</div>

    </body>
</html>
