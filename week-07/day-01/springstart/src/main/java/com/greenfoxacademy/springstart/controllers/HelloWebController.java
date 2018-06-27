package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  private final AtomicLong counter = new AtomicLong(1);


  @RequestMapping("/web/greeting")
  public String greeting(Model model, Model model2) {
    model.addAttribute("name", " Sanyi");
    model2.addAttribute("number", counter.incrementAndGet());
    return "greeting";
  }

  @RequestMapping("/web/randomGreeting")
  public String randomGreeting(Model r, Model b, Model g, Model size, Model model1, Model model2, Model model3) {
    r.addAttribute(R);
    b.addAttribute(B);
    g.addAttribute(G);
    size.addAttribute(fontSize);
    model1.addAttribute("hello", getRandomHello());
    model2.addAttribute("name", " Sanyi");
    model3.addAttribute("number", counter.incrementAndGet());
    return "greeting";
  }

  public String getRandomHello(){
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    int r = (int) Math.round(Math.random() * hellos.length);
    String randomHello = hellos[r];
    return randomHello;
  }


 public int R = (int) Math.round(Math.random() * 255);
 public int B = (int) Math.round(Math.random() * 255);
 public int G = (int) Math.round(Math.random() * 255);
 public int fontSize = (int) Math.round(Math.random() * 10);
}