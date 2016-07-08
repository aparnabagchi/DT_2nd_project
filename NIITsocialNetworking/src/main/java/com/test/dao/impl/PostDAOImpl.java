package com.test.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.PostDAO;
import com.test.model.Post;
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

}
