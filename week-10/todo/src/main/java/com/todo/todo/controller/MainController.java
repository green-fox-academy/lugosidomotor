package com.todo.todo.controller;

import com.todo.todo.model.Todo;
import com.todo.todo.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  TodoServiceImpl todoService;

  @GetMapping("/")
  public String getIndex(Model model){
    model.addAttribute("todos",todoService.findAll());
    model.addAttribute("newtodo", new Todo());
    return "index";
  }

  @PostMapping("/add")
  public String addnewTodo(@ModelAttribute Todo todo){
    todoService.save(todo);
    return "redirect:/";
  }

  @PostMapping("/delete/{id}")
  public String deleteTodo(@PathVariable("id") Long id) {
    todoService.delete(id);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public String editTodo(@PathVariable("id") Long id, Model model) {
    model.addAttribute("todo",todoService.findById(id));
    return "edit";
  }

  @PostMapping("/edit")
  public String saveEditedTodo(@ModelAttribute Todo todo ) {
    todoService.save(todo);
    return "redirect:/";
  }
}
