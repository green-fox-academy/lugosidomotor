package com.todo.todo.services;

import com.todo.todo.models.Todo;

import java.util.List;

public interface TodoService {

  Todo save(Todo todo);

  Todo getOneTodo(Long id);

  List<Todo> getTodos();

  void deleteTodo(Todo todo);

}
