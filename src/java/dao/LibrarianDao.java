/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Librarian;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author risbochris
 */
public class LibrarianDao extends Dao<Librarian> {

    public LibrarianDao() {
        super();
    }

    public Librarian getLibrarianByEmail(String email) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query=session.createQuery("From Librarian l where l.mailUser=:email");
        query.setString("email", email);
        Librarian lib=(Librarian) query.uniqueResult();
        session.getTransaction().commit();
        return lib;
    }

}
