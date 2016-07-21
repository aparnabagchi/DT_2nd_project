package com.test.controller;

import java.security.Principal;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.Post;
import com.test.model.User;
import com.test.service.PostService;
import com.test.utils.DateUtils;



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
	String user="";
	@RequestMapping("/editPost")
	public String editPostById(@RequestParam("id") int id, Model model){
		Post p = postService.getPost(id);
		user=p.getPostUser();
		model.addAttribute("post", p);
		return "editPost";
	}
	 static int editNumber=0;
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public String editPost(@PathVariable("id")Integer id,
	        @ModelAttribute("post") Post post, Map model){
		
		 editNumber++;
	
		// String date=DateUtils.getDate(new Date());
		 Date date=new Date();
	     post.setPostUser(user);
	     post.setDate(date);
	   
	    postService.editPost(post);
	    List postList=postService.getAllPosts();
	    model.put("postList", postList);
	 
	    return "redirect:/post";
	}
	
	@RequestMapping("/delete")
	 public String deleteUser(@RequestParam int id) {
		postService.deletePost(id);
	  return "redirect:post";
	 }
	 
}
