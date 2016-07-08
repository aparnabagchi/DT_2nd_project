package com.test.dao;

import java.util.List;

import com.test.model.Post;

public interface PostDAO {

	public void addPost(Post user);
	public List<Post> getAllPosts();
}
