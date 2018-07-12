package com.todo.todo.repositories;

import com.todo.todo.models.Todos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todos, Long> {

  List<Todos> findAll();
  Todos findById(long id);


}
