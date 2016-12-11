/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import dao.MediaDao;
import entities.Audio;
import entities.Livre;
import entities.Media;
import entities.Video;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CreateMediaServlet", urlPatterns = {"/CreateMedia"})
public class CreateMediaServlet extends HttpServlet {

    public static final String GET_MEDIA = "creatioMedia.jsp";
    public static final String POST_MEDIA = "listMedias.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher(GET_MEDIA).forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ref = ServletUtils.getParam(request, "ref");
        String titre = ServletUtils.getParam(request, "titre");
        String auteur = ServletUtils.getParam(request, "auteur");
        String annee = ServletUtils.getParam(request, "annee");
        String desc = ServletUtils.getParam(request, "desc");
        String genre = ServletUtils.getParam(request, "genre");
        String type = ServletUtils.getParam(request, "type");
        String local = ServletUtils.getParam(request, "local");
        String volum = ServletUtils.getParam(request, "vol");

        MediaDao mdao = new MediaDao();
        int vol = 0;
        int an = 1970;
        boolean intval = false;
        boolean error = false;
        try {
            vol = Integer.parseInt(volum);
            an = Integer.parseInt(annee);
        } catch (Exception e) {
            intval = true;
        }

        if (intval || ref == null || titre == null || auteur == null || genre == null || type == null || local == null) {
            request.setAttribute("erreur", "Veuillez remplir correctement tous les champs obligatoires!");
            error = true;
        } else {
            Media media = mdao.getMediaByRed(ref);
            if (media != null) {
                request.setAttribute("erreur", "Ce media existe déjà, veuillez verifié la référence!");
                error = true;
            } else {
                if(type.equals("livre")){
                    Livre lv=new Livre(ref, titre, auteur, an, genre, local, desc);
                    lv.setNbPages(vol);
                    mdao.saveEntity(lv);
                }else if(type.equals("audio")){
                   Audio aud=new Audio(ref, titre, auteur, an, genre, local,desc);
                   aud.setDureeAudio(vol);
                   mdao.saveEntity(aud);
                }else{
                    Video v=new Video(ref, titre, auteur, an, genre, local,desc);
                    v.setDureeVideo(vol);
                    mdao.saveEntity(v);
                }
                
                mdao.saveEntity(media);
            }
        }
        
        if (!error) {
                request.getRequestDispatcher(GET_MEDIA).forward(request, response);
                return;
        }

        request.getRequestDispatcher(POST_MEDIA).forward(request, response);
    }

}
