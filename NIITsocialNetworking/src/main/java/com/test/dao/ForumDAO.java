package com.test.dao;
import java.util.List;

import com.test.model.Forum;

public interface ForumDAO {

	public void createForum(Forum forum);
	public List<Forum> getAllForums();
	public void updateForum(Forum forum);
	public void deleteForum(int id);
	public Forum getForum(int id);
}

