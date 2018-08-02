package com.szekszindahuli.demoszekszindahuli.controller;

import com.szekszindahuli.demoszekszindahuli.model.People;
import com.szekszindahuli.demoszekszindahuli.service.PeopleService;
import com.szekszindahuli.demoszekszindahuli.service.PeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleRestController {

  @Autowired
  PeopleServiceImpl peopleService;


  @GetMapping("/gimmegimmealltheguys")
  public List<People> getAllGuy(){
    return peopleService.findAllMan();
  }

  @GetMapping("/gimmegimmeallthegirls")
  public List<People> getAllGirl(){
    return peopleService.findAllGirl();
  }
}
