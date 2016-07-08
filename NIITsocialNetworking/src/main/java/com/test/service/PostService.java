package com.test.service;

import java.util.List;

import com.test.model.Post;

public interface PostService {

	public void addPost(Post user);
	public List<Post> getAllPosts();
}
