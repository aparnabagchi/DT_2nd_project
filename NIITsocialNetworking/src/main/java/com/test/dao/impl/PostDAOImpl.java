package com.test.dao.impl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.PostDAO;
import com.test.model.Post;
import com.test.model.User;
@Repository
public class PostDAOImpl implements PostDAO {

	@Autowired
	private SessionFactory factory;
	public void addPost(Post user) {
		
		factory.getCurrentSession().save(user);
	}

	public List<Post> getAllPosts() {
		
		return factory.getCurrentSession().createQuery("from Post").list();
	}

	public void editPost(Post post) {
	
		factory.getCurrentSession().saveOrUpdate(post);
		
	}

	public void deletePost(int id) {
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Post post =(Post)session.get(Post.class, new Integer(id));
		session.delete(post);
		t.commit();
		session.flush();
		session.close();
		
	}


	public Post getPost(int id) {
		
		return (Post)factory.getCurrentSession().get(Post.class, id);
	}

}



