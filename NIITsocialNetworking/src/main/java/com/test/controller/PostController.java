package com.test.controller;

import java.security.Principal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.model.Post;
import com.test.model.User;
import com.test.service.PostService;



@Controller
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@RequestMapping(value="/newPost")
	public String newPosts(ModelMap map,Principal principal)
	{
		List<Post> post=postService.getAllPosts();
		/*for(Post p : post)
		{
			if(p.getPostUser().equals(principal.getName()))
			{
		       map.addAttribute("myPosts", post);
			}
		}*/
		map.addAttribute("myPosts", post);
		return "newPost";
	}
	
	@RequestMapping(value="/addPost")
	public String addPost(@Valid @ModelAttribute("addpost") Post post,BindingResult result,ModelMap model,Principal principal)
	{
		if(result.hasErrors()){
            return "newPost";
        }
		Date date=new Date();
		String user=principal.getName();
		post.setPostUser(user);
		post.setDate(date);
		postService.addPost(post);
		model.addAttribute("posts", post);
		return "redirect:userProfile";
	}
	
	@RequestMapping(value="/post")
	public String allPosts(ModelMap map)
	{
		List<Post> post=postService.getAllPosts();
		map.addAttribute("posts", post);
		return "post";
	}
}
