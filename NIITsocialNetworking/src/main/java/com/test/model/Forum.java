package com.test.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.test.model.Comment;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Forum implements Serializable {
	private static final long serialVersionUID = -512357129325585843L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String forumTopic;
	@OneToMany(mappedBy="forum",fetch = FetchType.EAGER)
	private Set<Comment> comment;
	private String date;
	private String forumUser;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getForumTopic() {
		return forumTopic;
	}
	public void setForumTopic(String forumTopic) {
		this.forumTopic = forumTopic;
	}
	public Set<Comment> getComment() {
		return comment;
	}
	public void setComment(Set<Comment> comment) {
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getForumUser() {
		return forumUser;
	}
	public void setForumUser(String forumUser) {
		this.forumUser = forumUser;
	}
	public Forum() {
		// TODO Auto-generated constructor stub
	}
}
