package com.exam.exam.services;

import com.exam.exam.models.Attractions;

import java.util.List;

public interface AttractionService {

  List<Attractions> getAllAttractions();
  void save(Attractions attraction);

}
