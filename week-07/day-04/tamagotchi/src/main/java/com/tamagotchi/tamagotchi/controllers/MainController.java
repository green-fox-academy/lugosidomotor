package com.tamagotchi.tamagotchi.controllers;
import com.tamagotchi.tamagotchi.models.Drink;
import com.tamagotchi.tamagotchi.models.Food;
import com.tamagotchi.tamagotchi.models.Fox;
import com.tamagotchi.tamagotchi.models.Trick;
import com.tamagotchi.tamagotchi.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @Autowired
  FoxService foxService;

  @GetMapping("")
  public String startIndexPage() {
    return "index";
  }


  @GetMapping("/")
  public String showIndexPage(Model model) {
    List<Trick> trickList = fox.getTricks();

    model.addAttribute("name",fox.getName());
    model.addAttribute("trickCount",fox.getNumberOfTricks());
    model.addAttribute("food",fox.getFood());
    model.addAttribute("drink",fox.getDrink());
    model.addAttribute("tricks",trickList);
    return "index";
  }

  @GetMapping("/login")
  public String renderLoginPage() {
    return "login";
  }

  @GetMapping("/nutritionstore")
  public String showNutritionStorePage(Model model) {
    List<Food> foodList = fox.allPossibleFoodList();
    List<Drink> drinkList = fox.allPossibleDrinkList();
    model.addAttribute("foodList", foodList);
    model.addAttribute("drinkList", drinkList);
    return "nutritionstore";
  }

  @GetMapping("/trickcenter")
  public String showtrickCenterPage(Model model) {
    List<Trick> trickList = fox.allPossibleTrickList();
    model.addAttribute("trickList", trickList);
    return "trickcenter";
  }


  @PostMapping("/login")
  public String login(@RequestParam("username") String foxName, Model model) {
    model.addAttribute("foxLogin", foxService.login(foxName));
    return "redirect:/" + foxName;
  }

  @GetMapping("/login/{username}")
  public String returnIndexPageWithNewParams(@PathVariable(value = "username") String username, Model model) {
    model.addAttribute("fox", foxService.getFox(username));
    return "index";
  }

}


