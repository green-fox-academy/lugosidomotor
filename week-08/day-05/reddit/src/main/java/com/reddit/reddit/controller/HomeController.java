package com.reddit.reddit.controller;
import com.reddit.reddit.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

//  @Autowired
//  Repository repository;




  @GetMapping("")
  public String getIndex(Model model) {

    model.addAttribute("posts", getPost());
    return "index";
  }


  private ArrayList<Post> getPost(){

    ArrayList<Post> posts = new ArrayList<>();

    Post post1 = new Post();
    post1.setAuthor("Sanyi");
    post1.setContent("sdfghjklsdfghjkl");
    post1.setLike(15);

    post1.setTitle("első");

    Post post2 = new Post();
    post2.setTitle("második");

    posts.add(post1);
    posts.add(post2);

    return posts;
  }
}
