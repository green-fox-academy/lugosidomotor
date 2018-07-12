package com.exam.exam.controllers;

import com.exam.exam.models.Attractions;
import com.exam.exam.services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AttractionsController {

  @Autowired
  AttractionService attractionervice;

  @GetMapping("/")
  public String getIndexPage(Model model){
    model.addAttribute("attractions", attractionervice.getAllAttractions());
    model.addAttribute("newAttraction", new Attractions());
    return "index";
  }

  @PostMapping("/add")
  public String postIndexPage(@ModelAttribute Attractions attraction){
    attractionervice.save(attraction);

    return "redirect:";
  }


}
