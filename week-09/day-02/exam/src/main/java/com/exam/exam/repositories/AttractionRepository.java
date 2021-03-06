package com.exam.exam.repositories;
import com.exam.exam.models.Attractions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttractionRepository extends CrudRepository<Attractions, Long> {

  List<Attractions> findAll();
  List<Attractions> findByCategory(String category);
  List<Attractions> findByCity(String city);
  List<Attractions> findByCityAndCategory(String city, String category);

}