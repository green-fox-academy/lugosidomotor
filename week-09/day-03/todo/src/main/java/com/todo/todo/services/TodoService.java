package com.todo.todo.services;

import com.todo.todo.models.Todos;
import java.util.List;

public interface TodoService {

  List<Todos> findAll();
  Todos findById(long id);
  void save(Todos todo);
  void delete(long id);
}
