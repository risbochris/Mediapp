/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author risbochris
 */
public class Dao<T> implements AbstractDao<T>{
    
    private SessionFactory sessionFactory;
    
    public Dao() {
	this.sessionFactory = HibernateUtil.getSessionFactory();
    }

	@Override
	public T getEntity(Class<T> cl, Long id) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		T element = (T) session.get(cl, id);
		session.getTransaction().commit();
		return element;
	}

	@Override
	public T saveEntity(T object) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
            try {
                session.save(object);
		session.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
                session.getTransaction().rollback();
            }
            
            return object;
		
	}

	@Override
	public boolean updateEntity(T object) {
		Session session = sessionFactory.getCurrentSession();
                session.beginTransaction();
            try {
                session.update(object);
		session.getTransaction().commit();
                return true;
            } catch (Exception e) {
                session.getTransaction().rollback();
                return false;
            }
		
	}

	@Override
	public boolean deleteEntity(T object) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
            try {
                session.delete(object);
		session.getTransaction().commit();
                return true;
            } catch (Exception e) {
                session.getTransaction().rollback();
                return false;
            }
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> query(String hsql, Map<String, Object> params) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery(hsql);
		if (params != null) {
			for (String i : params.keySet()) {
				query.setParameter(i, params.get(i));
			}
		}

		List<T> result = null;
		if ((hsql.toUpperCase().indexOf("DELETE") == -1)
				&& (hsql.toUpperCase().indexOf("UPDATE") == -1)
				&& (hsql.toUpperCase().indexOf("INSERT") == -1)) {
			result = query.list();
		} else {
		}
		session.getTransaction().commit();

		return result;
	}
}
