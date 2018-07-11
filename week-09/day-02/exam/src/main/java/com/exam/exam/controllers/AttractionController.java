package com.exam.exam.controllers;

import com.exam.exam.models.Attractions;
import com.exam.exam.services.AttractionService;
import com.exam.exam.services.AttractionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AttractionController {

  AttractionService attractionService;

  @Autowired
  public AttractionController(AttractionServiceImpl attractionService) {
    this.attractionService = attractionService;
  }

  @GetMapping("/")
  public String indexPage(Model model) {
    model.addAttribute( "list", attractionService.findAllAttractions());
    model.addAttribute("newAttr", new Attractions());
    return "index";
  }

  @PostMapping("/add")
  public String addAttraction(@ModelAttribute Attractions attraction) {
    attractionService.saveAttraction(attraction);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public String editPage(@PathVariable(value = "id") long id, Model model) {
    model.addAttribute( "list", attractionService.findAllAttractions());
    model.addAttribute("newAttr", attractionService.findByIdAttraction(id));
    return "index";
  }

  @GetMapping("/filter")
  public String filteredAttractions(@RequestParam(value = "category", required = false) String category,
                                    @RequestParam(value = "city", required = false) String city, Model model) {
    model.addAttribute("list", attractionService.findFilteredAttractions(category, city));
    model.addAttribute("newAttr", new Attractions());
    return "index";
  }

}