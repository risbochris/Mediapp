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
import org.hibernate.Session;

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
        Map<String,Object> param=new HashMap<>();
        param.put("email", email);
        return this.query("From Librarian  l where l.mailUser=:email", param).get(0);
    }

}
