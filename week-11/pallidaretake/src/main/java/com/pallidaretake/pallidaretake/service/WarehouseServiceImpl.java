package com.pallidaretake.pallidaretake.service;
import com.pallidaretake.pallidaretake.model.Warehouse;
import com.pallidaretake.pallidaretake.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService{

  @Autowired
  WarehouseRepository warehouseRepository;

  @Override
  public List<Warehouse> findAll() {
    return warehouseRepository.findAll();
  }

  @Override
  public Warehouse findById(int id) {
    return warehouseRepository.findById(id);
  }

  @Override
  public List<Warehouse> findDistinctByItemName() {
    return warehouseRepository.findDistinctByItemName();
  }


}
