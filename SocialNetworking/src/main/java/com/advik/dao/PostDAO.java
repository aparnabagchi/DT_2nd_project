package com.advik.dao;

import java.util.List;

import com.advik.model.Post;

public interface PostDAO {

	public void addPost(Post user);
	public List<Post> getAllPosts();
}
