package com.test.controller;

import java.security.Principal;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.dao.CommentDAO;
import com.test.model.Comment;
import com.test.model.Forum;
import com.test.model.Post;
import com.test.service.ForumService;
import com.test.service.UserService;
import com.test.utils.DateUtils;

@Controller
public class ForumController {

	@Autowired
	private ForumService forumService;
	
	@Autowired(required=true)
	private CommentDAO commentService;
	
	@RequestMapping(value="/createForum")
	public String createForum(ModelMap map)
	{
		List<Forum> forum=forumService.getAllForums();
		map.addAttribute("myForum", forum);
		return "createForum";
	}
	@RequestMapping(value="/addForum")
	public String addPost(@Valid @ModelAttribute("addForum") Forum forum,BindingResult result,ModelMap model,Principal principal)
	{
		if(result.hasErrors()){
            return "createForum";
        }
		String date=DateUtils.getDate(new Date());
		String user=principal.getName();
		forum.setDate(date);
		forum.setForumUser(user);
		Set<Comment> comment=new TreeSet<Comment>();
		forum.setComment(comment);
		forumService.createForum(forum);
		model.addAttribute("forums", forum);
		return "redirect:createForum";
	}
	
	@RequestMapping(value="/allForums")
	public String allForums(ModelMap map, Forum forum)
	{
		List<Forum> forums=forumService.getAllForums();
		
		map.addAttribute("forums", forums);
		return "allForums";
	}
	
	@RequestMapping(value="/discussion")
	public String discussionPage(@RequestParam("id") int id, ModelMap model,Principal principal,Comment comment)
	{
		Forum forum=forumService.getForum(id);
		model.addAttribute("discuss", forum);
		List<Comment> list=commentService.allComments(id);
		model.addAttribute("comment", list);
		return "discussion";
	}
	
	@RequestMapping(value="/addComment")
	public String addNewComment(@ModelAttribute("addComment") Comment comment,ModelMap model,Principal principal,HttpServletRequest req)
	{
		
		String date=DateUtils.getDate(new Date());
		String name=principal.getName();
		String ids=req.getParameter("formId");
		int id=Integer.parseInt(ids);
		comment.setForum_id(id);
		comment.setDate(date);
		comment.setUsername(name);
		commentService.addComment(comment);
		
		
		return "redirect:/discussion?id="+id;
	}
}
