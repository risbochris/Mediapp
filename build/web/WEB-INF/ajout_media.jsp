<%-- 
    Document   : inscriptions
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
        <script src="Ressources/js/bootstrap/bootstrap.min.js"></script>
        <script src="Ressources/js/theme.js"></script>
    </head>
    <body id="signup">
        <a href="/Mediapp" class="logo">
            <i class="brankic-pen"></i>
        </a>

        <h3>Nouveau Média   </h3>
        <div class="content">

            <div class="alert-danger">
                <c:out value="${requestScope.erreur}"/>
            </div>

            <form method="POST" action="Register">
                <div class="fields">
                    <strong>Informations Média</strong>
                    <div class="btn-group pull-right" data-toggle="buttons" >
                        <label class="btn btn-default active">
                            <input type="radio" name="type" id="option1" value="Livre"/> Livre
                        </label>
                        <label class="btn btn-default">
                            <input type="radio" name="type" id="option1" value="CD"/> CD
                        </label>
                        <label class="btn btn-default">
                            <input type="radio" name="type" id="option2"  value="DVD"/> DVD
                        </label>
                    </div>
                    <input class="form-control" name="ref" type="text" placeholder="ISBN" />
                    <input class="form-control" name="titre" type="text" placeholder="Titre" />
                    <input class="form-control" name="auteur" type="text" placeholder="Auteur" />
                    <input class="form-control" name="annee" type="number" placeholder="Année" />
                    <input class="form-control" name="desc" type="text" placeholder="Description" />
                    <input class="form-control" name="local" type="text" placeholder="Localisation" />
                    <input class="form-control" name="volume" id="prm" type="text" placeholder="Nombre de page ou durée" />

                </div>
                <div class="signup">
                    <input type="submit" value="Ajouter" class="btn btn-success btn-lg" />	
                </div>
            </form>
        </div>
        <div class="bottom-wrapper">
            <div class="message">
                <span>Accéder à votre tableau de bord</span>
                <a href="/Mediapp/Dashboard">ici</a>.
            </div>
        </div>
<!--        <script type="text/javascript">
            $(function change() {
                var el = Document.getElementById("prm").placeholder=""
                });
            });
        </script>-->
    </body>
</html>
