package com.todo.todo.controllers;

import com.todo.todo.models.Todos;
import com.todo.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

  @Autowired
  TodoService todoService;

  @GetMapping("/")
  public String getIndexPage(Model model){
    model.addAttribute("todos",todoService.findAll());
    model.addAttribute("newTodo", new Todos());
    return "index";
  }

  @GetMapping("/edit/{id}")
  public String getEditPage(@PathVariable (value = "id") long id, Model model){
   model.addAttribute("todo", todoService.findById(id));
    return "edit";
  }

  @PostMapping("/edit")
  public String addEditedTodo(@ModelAttribute Todos todo){
    todoService.save(todo);
    return "redirect:/";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todos todo){
    todoService.save(todo);
    return "redirect:/";
  }

  @PostMapping("/delete/{id}")
  public String deleteToDo(@PathVariable (value = "id") long id){
    todoService.delete(id);
    return "redirect:/";
  }
}

