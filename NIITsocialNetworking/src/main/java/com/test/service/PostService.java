package com.test.service;

import java.util.List;

import com.test.model.Post;
import com.test.model.User;

public interface PostService {

	public void addPost(Post user);
	public List<Post> getAllPosts();
	public void editPost(Post post);
	public void deletePost(int id);
	public Post getPost(int id);
}
