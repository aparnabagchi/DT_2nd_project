package com.test.dao;

import java.util.List;

import com.test.model.Comment;

public interface CommentDAO {

	public void addComment(Comment comment);
	public List<Comment> allComments(int id);
}
