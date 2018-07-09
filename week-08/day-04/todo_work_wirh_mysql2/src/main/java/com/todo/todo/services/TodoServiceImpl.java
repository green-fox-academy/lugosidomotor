package com.todo.todo.services;

import com.todo.todo.models.Todo;
import com.todo.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

  TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public Todo save(Todo todo) {
    return todoRepository.save(todo);
  }

  @Override
  public Todo getOneTodo(Long id) {
    return todoRepository.findById(id).get();
  }

  @Override
  public List<Todo> getTodos() {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos;
  }

  @Override
  public void deleteTodo(Todo todo) {
    todoRepository.delete(todo);
  }
}
