package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.PostDAO;
import com.test.model.Post;
import com.test.model.User;
import com.test.service.PostService;
@Service
@Transactional
public class PostServiceImpl implements PostService {

	@Autowired
	private PostDAO postDAO;
	public void addPost(Post user) {
	
		postDAO.addPost(user);
	}

	public List<Post> getAllPosts() {
		return postDAO.getAllPosts();
	}

	
	public void editPost(Post post) {
		postDAO.editPost(post);
		
	}

	
	public void deletePost(int id) {
		postDAO.deletePost(id);
		
	}

	
	public Post getPost(int id) {
		return postDAO.getPost(id);
	}
}
