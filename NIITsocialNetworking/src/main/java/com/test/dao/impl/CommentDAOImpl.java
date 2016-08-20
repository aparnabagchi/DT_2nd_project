package com.test.dao.impl;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.CommentDAO;
import com.test.model.Comment;
@Repository
@Transactional
public class CommentDAOImpl implements CommentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addComment(Comment comment) {
		sessionFactory.getCurrentSession().save(comment);
		
	}

	public List<Comment> allComments(int id) {
		
		return sessionFactory.getCurrentSession().createQuery("from Comment where id=" + "'"+ id +"'").list();
	}
   
}
