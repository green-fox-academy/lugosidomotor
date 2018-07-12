package com.todo.todo.services;

import com.todo.todo.models.Todos;
import com.todo.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {


  @Autowired
  TodoRepository todoRepository;

  @Override
  public List<Todos> findAll() {
    //    List<Attractions> list = new ArrayList<>();
//    attractionrepository.findAll().forEach(attraction -> list.add(attraction));
//    return list;
    return todoRepository.findAll();
    // ehhez átírtam a repoban a visszatérést

  }

  @Override
  public Todos findById(long id) {
    return todoRepository.findById(id);
  }

  @Override
  public void save(Todos todo) {
    todoRepository.save(todo);

  }

  @Override
  public void delete(long id) {
    todoRepository.delete(findById(id));
  }

}