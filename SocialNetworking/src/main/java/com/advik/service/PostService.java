package com.advik.service;

import java.util.List;

import com.advik.model.Post;

public interface PostService {

	public void addPost(Post user);
	public List<Post> getAllPosts();
}
