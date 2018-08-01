package com.pallidaretake.pallidaretake.repository;

import com.pallidaretake.pallidaretake.model.Warehouse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface WarehouseRepository extends CrudRepository<Warehouse, Integer> {

  List<Warehouse> findAll();
  Warehouse findById(int id);


}
