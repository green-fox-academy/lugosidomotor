package com.rest.rest.controllers;


import com.rest.rest.models.DoubleModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @GetMapping ("/")
  public String getIndex(){
    return "index";
  }

}
