package com.blog.blog.controller;

import com.blog.blog.model.Story;
import com.blog.blog.service.StoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  StoryServiceImpl storyService;

  @GetMapping("/")
  public String getIndexPage(Model model){
    model.addAttribute("posts", storyService.findAll());
    return "index";
  }

  @GetMapping("/create")
  public String getCreatePage(Model model){
    model.addAttribute("newstory", new Story());
    return "create";
  }

  @PostMapping("/createnew")
  public String getNewStory(@ModelAttribute Story newstory){
    storyService.save(newstory);
    return "redirect:/";
  }

  @PostMapping("/{id}/likeup")
  public String voteUp(@PathVariable(value = "id") long id){
    storyService.upvote(id);
    return "redirect:/";
  }

  @PostMapping("/{id}/likedown")
  public String voteDown(@PathVariable(value = "id") long id){
    storyService.downvote(id);
    return "redirect:/";
  }




  @GetMapping("/post.html")
  public String getPostPage(){
    return "post";
  }
}
