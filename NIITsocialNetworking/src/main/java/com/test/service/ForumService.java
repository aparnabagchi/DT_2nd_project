package com.test.service;

import java.util.List;

import com.test.model.Forum;


public interface ForumService {

	public void createForum(Forum forum);
	public List<Forum> getAllForums();
	public void updateForum(Forum forum);
	public void deleteForum(int id);
	public Forum getForum(int id);
}
