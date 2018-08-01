package com.timmyyyy.timmyyyy.controller;

import com.timmyyyy.timmyyyy.model.NumberModel;
import com.timmyyyy.timmyyyy.service.NumberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  NumberServiceImpl numberService;

  @GetMapping("/")
  public String getIndexPage(Model model){
    model.addAttribute("newNumbers", new NumberModel());
    model.addAttribute("allNumberModel", numberService.findAll());
    return "index";
  }

  @PostMapping("/saveNewNumberModel")
  public String saveNewNumberModel(@ModelAttribute NumberModel numberModel, Model model) {
    numberService.save(numberModel);
    model.addAttribute("newNumbers", new NumberModel());
    model.addAttribute("allNumberModel", numberService.findAll());
    model.addAttribute("message", numberService.message(numberModel));
    return "index";
  }

  @GetMapping("/sum")
  public String sumNumbers(@RequestParam(name = "sumID") long id, Model model) {
    model.addAttribute("object", numberService.findById(id));
    model.addAttribute("sum", numberService.sum(numberService.findById(id)));
    return "sum";
  }

  @GetMapping("/square")
  public String squareNumbers(@RequestParam(name = "squareID") long id, Model model) {
    model.addAttribute("object", numberService.findById(id));
    model.addAttribute("square", numberService.square(numberService.findById(id)));
    return "square";
  }



}
