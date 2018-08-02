package com.szekszindahuli.demoszekszindahuli.controller;

import com.szekszindahuli.demoszekszindahuli.model.People;
import com.szekszindahuli.demoszekszindahuli.service.PeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class MainController {

  @Autowired
  PeopleServiceImpl peopleService;

  @GetMapping("/")
  public String getIndexPage(Model model) {
    Random rand = new Random();
    int  girlRandom = rand.nextInt(peopleService.findAllGirl().size());
    int  boyRandom = rand.nextInt(peopleService.findAllMan().size());

    peopleService.counterPlus(peopleService.findAllGirl().get(girlRandom),peopleService.findAllMan().get(boyRandom));

    model.addAttribute("girl", peopleService.doEveryStuff(peopleService.findAllGirl().get(girlRandom)));
    model.addAttribute("boy", peopleService.doEveryStuff(peopleService.findAllMan().get(boyRandom)));
    model.addAttribute("result", peopleService.calculateResult());


    return "index_fancy";
  }
}
