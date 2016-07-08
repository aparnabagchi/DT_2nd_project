package com.advik.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.advik.dao.PostDAO;
import com.advik.model.Post;
import com.advik.service.PostService;
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

}
