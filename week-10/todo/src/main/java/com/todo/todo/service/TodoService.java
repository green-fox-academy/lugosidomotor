package com.todo.todo.service;

import com.todo.todo.model.Todo;
import java.util.List;

public interface TodoService {

  List<Todo> findAll();
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);
}
