package com.exam.exam.repositories;

import com.exam.exam.models.Attractions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttractionRepository  extends CrudRepository <Attractions, Long> {

  List<Attractions> findAll();
}
