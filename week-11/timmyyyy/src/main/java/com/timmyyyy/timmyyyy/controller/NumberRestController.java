package com.timmyyyy.timmyyyy.controller;

import com.timmyyyy.timmyyyy.model.NumberModel;
import com.timmyyyy.timmyyyy.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NumberRestController {

  @Autowired
  NumberService numberService;


  @GetMapping("/rest")
  public List<NumberModel> getAllNumber(){
    return numberService.findAll();
  }


}
