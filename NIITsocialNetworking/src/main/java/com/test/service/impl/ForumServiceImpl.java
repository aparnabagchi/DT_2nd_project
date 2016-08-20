package com.test.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.ForumDAO;
import com.test.model.Forum;
import com.test.service.ForumService;

@Service
@Transactional
public class ForumServiceImpl implements ForumService{

	@Autowired
	private ForumDAO forumDAO;
	
	public void createForum(Forum forum) {
		forumDAO.createForum(forum);
		
	}

	public List<Forum> getAllForums() {
		
		return forumDAO.getAllForums();
	}

	public void updateForum(Forum forum) {
		forumDAO.updateForum(forum);
		
	}

	public void deleteForum(int id) {
	forumDAO.deleteForum(id);
		
	}

	public Forum getForum(int id) {
	
		return forumDAO.getForum(id);
	}

}

