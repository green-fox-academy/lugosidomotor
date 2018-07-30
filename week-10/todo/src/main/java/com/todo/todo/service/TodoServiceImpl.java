package com.todo.todo.service;

import com.todo.todo.model.Todo;
import com.todo.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  @Autowired
  TodoRepository todoRepository;

  @Override
  public List<Todo> findAll() {
    return todoRepository.findAll();
  }

  @Override
  public Todo findById(long id) {
    return todoRepository.findById(id);
  }

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void delete(long id) {
    todoRepository.deleteById(id);
  }
}