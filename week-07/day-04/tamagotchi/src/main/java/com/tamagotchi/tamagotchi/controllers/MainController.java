package com.tamagotchi.tamagotchi.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @GetMapping("")
  public String startIndexPage() {
    return "index";
  }


  @GetMapping("/")
  public String showIndexPage() {
    return "index";
  }

  @GetMapping("/login")
  public String renderLoginPage() {
    return "login";
  }

  @GetMapping("/nutritionstore")
  public String showNutritionStorePage() {
    return "nutritionstore";
  }

  @GetMapping("/trickcenter")
  public String showtrickCenterPage() {
    return "trickcenter";
  }


  @PostMapping("/login")
  public String login(@ModelAttribute(value = "username") String username) {
    //userService.login(username);
    return "redirect:/profile/" + username;
  }

  @GetMapping("/profile/{username}")
  public String renderProfilePage(@PathVariable(value = "username") String username, Model model) {
    //model.addAttribute("user", Fox));
    return "profile";
  }

}


