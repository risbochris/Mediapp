/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Librarian;
import entities.Media;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author knazanga
 */
public class MediaDao extends Dao<Media>{
    
    public Media getMediaByRed(String ref){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query=session.createQuery("From Media m where m.codeMedia=:ref");
        query.setString("email", ref);
        Media media=(Media) query.uniqueResult();
        session.getTransaction().commit();
        return media;
    }
}
