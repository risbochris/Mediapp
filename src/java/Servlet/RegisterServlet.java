/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import com.sun.xml.ws.transport.http.servlet.ServletUtil;
import dao.Dao;
import dao.LibrarianDao;
import entities.Genre;
import entities.Librarian;
import java.io.IOException;
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

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

		if (nom == null || prenom == null || adresse == null || email == null || password == null || !ServletUtils.isEmail(email)) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}

		// TODO check if the email is well formed

		LibrarianDao daolib = new LibrarianDao();

		// Create the new user object

		Librarian librarian = new Librarian(nom, prenom, adresse, email, ServletUtils.cryptPassword(password));
                
                if(daolib.getLibrarianByEmail(email)!=null){
                    response.sendError(HttpServletResponse.SC_CONFLICT);
                    return;
                }

		// Push it in DB

		daolib.saveEntity(librarian);

		// sign the user in
                if(librarian.getId()==null){
                    response.sendError(HttpServletResponse.SC_NOT_FOUND);
                }
                request.getRequestDispatcher("WEB-INF/inscription.jsp").forward(request, response);
	}
    
    

}
