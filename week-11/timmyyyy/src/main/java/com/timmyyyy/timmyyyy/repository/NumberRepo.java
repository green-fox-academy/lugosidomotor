package com.timmyyyy.timmyyyy.repository;

import com.timmyyyy.timmyyyy.model.NumberModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NumberRepo extends CrudRepository<NumberModel, Long> {

  List<NumberModel> findAll();
  NumberModel findById(long id);
}
