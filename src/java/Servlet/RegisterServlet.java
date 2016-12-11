/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import dao.LibrarianDao;
import entities.Librarian;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author risbochris
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/Register"})
public class RegisterServlet extends HttpServlet {

    public static final String GET_VIEW = "WEB-INF/inscription.jsp";
    public static final String POST_VIEW = "WEB-INF/inscription.jsp";

    boolean error=false;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/inscription.jsp").forward(request, response);

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nom = ServletUtils.getParam(request, "nom");
        String prenom = ServletUtils.getParam(request, "prenom");
        String adresse = ServletUtils.getParam(request, "adresse");
        String email = ServletUtils.getParam(request, "mail");
        String password = ServletUtils.getParam(request, "pwd");

        LibrarianDao daolib = new LibrarianDao();
        Librarian librarian = daolib.getLibrarianByEmail(email);
        if (nom == null || prenom == null || adresse == null || email == null || password == null || !ServletUtils.isEmail(email)) {
            request.setAttribute("erreur", "Veuillez remplir correctement tous les champs obligatoire!");
            error=true;
        } else if (librarian != null) {
            // TODO check if the email is well formed
            request.setAttribute("erreur", "Cet utilisateur existe déjà");
            error=true;
        } else {
            // Create the new user object
            librarian = new Librarian(nom, prenom, adresse, email, ServletUtils.cryptPassword(password));

            // Push it in DB
            daolib.saveEntity(librarian);

            // sign the user in
            if (librarian.getId() == null) {
                request.setAttribute("erreur", "Erreur interne survenue, veuillez reesayez plutard!");
            }
        }
        
        if (!error) {
                request.getRequestDispatcher(GET_VIEW).forward(request, response);
                return;
        }

        request.getRequestDispatcher(POST_VIEW).forward(request, response);
    }

}
