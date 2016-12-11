<%-- 
    Document   : inscription
    Created on : ******
    Author     : risbochris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Ressources/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <title>Nouveau Bibliothécaire</title>
    </head>
    <body>
        <h1>Formulaire d'inscription </h1>
        <form class="form-horizontal container" method="POST" action="Register">
            <div class="form-group">
              <label for="nom" class="col-sm-2 control-label">Nom</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="nom" id="nom" placeholder="Nom">
              </div>
            </div>
            <div class="form-group">
              <label for="prenom" class="col-sm-2 control-label">Prénoms</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="prenom" id="prenom" placeholder="Prénoms">
              </div>
            </div>
            <div class="form-group">
              <label for="adresse" class="col-sm-2 control-label">Adresse</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="adresse" id="adresse" placeholder="Adresse">
              </div>
            </div>
            <div class="form-group">
                <label for="mail" class="col-sm-2 control-label">Email</label>
                <div class="col-sm-10">
                  <input type="email" class="form-control" name="mail" id="mail" placeholder="Email">
                </div>
            </div>
            <div class="form-group">
              <label for="pwd" class="col-sm-2 control-label">Mot de passe</label>
              <div class="col-sm-10">
                <input type="password" class="form-control" name="pwd" id="pwd" placeholder="Mode de passe">
              </div>
            </div>
            <div class="form-group">
              <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Inscription</button>
              </div>
            </div>
        </form>
    </body>
</html>
