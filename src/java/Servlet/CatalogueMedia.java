/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import dao.Dao;
import dao.MediaDao;
import entities.Audio;
import entities.Livre;
import entities.Media;
import entities.Video;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author **********
 */
@WebServlet(name = "CatalogueMedia", urlPatterns = {"/CatalogueMedia"})
public class CatalogueMedia extends HttpServlet {
    public static final String GET_MEDIAS="listMedia.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Livre> livres;
        Dao<Livre> ldao=new Dao();
        livres=ldao.getAll(Livre.class);
        
        List<Audio> audios;
        Dao<Audio> adao=new Dao();
        audios=adao.getAll(Audio.class);
        
        List<Video> videos;
        Dao<Video> vdao=new Dao();
        videos=vdao.getAll(Video.class);
        
        request.setAttribute("livres", livres);
        request.setAttribute("audios", audios);
        request.setAttribute("videos", videos);
        
        request.getRequestDispatcher(GET_MEDIAS).forward(request, response);
    }

}
