package com.test.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.Post;



@Service
@Transactional
public class PostService {
	
	@Autowired
	private SessionFactory factory;
	public List<Post> getAllPost() {
		return factory.getCurrentSession().createQuery("from Post").list();
	}

	public List<Post> getAllPost(int user_id) {
		return factory.getCurrentSession().createQuery("from Post where user-id='user_id'").list();
	}

	public Post getPostOfId(int post_id) {
		return (Post)factory.getCurrentSession().get(Post.class, post_id);
	}

	public void createPost(Post post) {
		factory.getCurrentSession().save(post);
	}

	/*private static class PostRowMapper implements RowMapper<Post> {
		@Override
		public Post mapRow(ResultSet resultSet, int line) throws SQLException {
			Post post = new Post();
			post.setId(resultSet.getInt("id"));
			post.setTitle(resultSet.getString("title"));
			post.setContent(resultSet.getString("content"));
			post.setDate(resultSet.getDate("date"));
			post.setUser_id(resultSet.getInt("user_id"));
			post.setUser_username(resultSet.getString("username"));
			return post;
		}
	}*/
}

