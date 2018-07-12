package com.todo.todo.controllers;
import com.todo.todo.models.Todos;
import com.todo.todo.services.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class TodoRESTController {

  @Autowired
  TodoServiceImpl todoService;

  @GetMapping
  public ResponseEntity<?> getTodo() {
    List<Todos> todos = todoService.findAll();
    return ResponseEntity.ok().body(todos);
  }
}
