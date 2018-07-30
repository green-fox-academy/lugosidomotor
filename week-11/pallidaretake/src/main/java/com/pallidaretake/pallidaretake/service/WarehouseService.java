package com.pallidaretake.pallidaretake.service;
import com.pallidaretake.pallidaretake.model.Warehouse;

import java.util.ArrayList;
import java.util.List;

public interface WarehouseService {


  List<Warehouse> findAll();
  Warehouse findById(int id);
  List<Warehouse> findDistinctByItemName();

}
