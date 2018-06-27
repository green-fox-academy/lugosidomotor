package com.bankofsimba.bankofsimba.controller;
import com.bankofsimba.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

  public List<BankAccount> accounts;

  public MainController() {
      }

  @GetMapping("")
  public String showIndexPage(Model model) {
    model.addAttribute("name", "name");
    return "index";
  }

  @GetMapping("/show")
  public String show(Model model) {
    accounts = new ArrayList<>();
    accounts.add(new BankAccount("Mufasza", 10000, "lion","+++","dead king"));
    accounts.add(new BankAccount("Simba", 10000, "lion","+++","king"));
    accounts.add(new BankAccount("Timon", 1000, "meerkat","+++","peasant"));
    accounts.add(new BankAccount("Pumbaa", 10, "warthog","+++","peasant"));
    accounts.add(new BankAccount("Rafiki", 5000, "mandrill","+++","saman"));
    accounts.add(new BankAccount("Scar", 500, "lion","---","peasant"));

    model.addAttribute("accounts", accounts);
    return "show";
  }

  @GetMapping("/accounts")
  public String showAccounts(Model model) {
    model.addAttribute("string1", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "example";
  }

  @PostMapping("/show")
  public void pumpMoney(){


  }



}
