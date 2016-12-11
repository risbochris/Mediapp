<%-- 
    Document   : connection
    Author     : risbochris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <title
            <!DOCTYPE html>
            <html>
                <head>
                    <meta charset="UTF-8" />
                    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                    <!--meta http-equiv="X-UA-Compatible" content="IE=edge" /-->	
                    <title>Connexion</title>
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
                <body id="signin" class="clear">

                    <div class="signup-switcher">
                        <a href="#" class="active" data-class="clear">
                            <i class="fa fa-check"></i>
                            Clear
                        </a>
                        <a href="#" data-class="">
                            <i class="fa fa-check"></i>
                            Dark
                        </a>
                    </div>

                    <a href="index.html" class="logo">
                        <i class="brankic-pen"></i>
                    </a>

                    <h3>Bienvennue!</h3>

                    <div class="content">
                        <form method="POST" action="Signin">
                            <div class="fields">
                                <strong>Adresse Mail</strong>
                                <input class="form-control" type="text" placeholder="Your email" />
                            </div>
                            <div class="fields">
                                <strong>Mot de passe</strong>
                                <input class="form-control" type="password" placeholder="Password" />
                            </div>
                            <div class="actions">
                                <input type="submit" value="Se connecter" />
                            </div>
                        </form>
                    </div>

                    <div class="bottom-wrapper">
                        <div class="message">
                            <span>Don't have an account?</span>
                            <a href="signup.html">Sign up here</a>.
                        </div>
                    </div>

                    <script type="text/javascript">
                        $(function () {
                            var $switcher = $(".signup-switcher a");
                            $switcher.click(function (e) {
                                e.preventDefault();
                                $switcher.removeClass("active");
                                $(this).addClass("active");
                                $("body").attr("class", $(this).data("class"));
                            });
                        });
                    </script>

                </body>
            </html>