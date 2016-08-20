package com.test.dao.impl;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.ForumDAO;
import com.test.model.Forum;
@Repository
public class ForumDAOImpl implements ForumDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void createForum(Forum forum) {
		sessionFactory.getCurrentSession().save(forum);
		
	}

	public List<Forum> getAllForums() {
		
		return sessionFactory.getCurrentSession().createQuery("from Forum").list();
	}

	public void updateForum(Forum forum) {
		sessionFactory.getCurrentSession().saveOrUpdate(forum);
		
	}

	public void deleteForum(int id) {

		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		Forum forum=(Forum)session.get(Forum.class, id);
		session.delete(forum);
		t.commit();
		session.flush();
		session.close();
		
	}

	public Forum getForum(int id) {
		
		return (Forum)sessionFactory.getCurrentSession().get(Forum.class, id);
	}

}

