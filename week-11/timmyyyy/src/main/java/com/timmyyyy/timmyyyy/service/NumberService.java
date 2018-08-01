package com.timmyyyy.timmyyyy.service;

import com.timmyyyy.timmyyyy.model.NumberModel;

import java.util.List;

public interface NumberService {

  void save(NumberModel numberModel);
  boolean isItNumber (NumberModel numberModel);


  List<NumberModel> findAll();
  NumberModel findById(long id);
  String message(NumberModel numberModel);
}
