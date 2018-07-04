package com.todo.todo.controllers;

import com.todo.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {


  TodoRepository todoRepository;

  @Autowired
  public MainController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value="", method=RequestMethod.GET)
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "index";
  }
}

