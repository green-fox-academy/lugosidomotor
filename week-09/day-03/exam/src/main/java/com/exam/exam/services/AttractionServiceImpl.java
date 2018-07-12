package com.exam.exam.services;

import com.exam.exam.models.Attractions;
import com.exam.exam.repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttractionServiceImpl implements AttractionService {

  @Autowired
  AttractionRepository attractionrepository;


  @Override
  public List<Attractions> getAllAttractions() {
//    List<Attractions> list = new ArrayList<>();
//    attractionrepository.findAll().forEach(attraction -> list.add(attraction));
//    return list;
    return attractionrepository.findAll();
    // ehhez átírtam a repoban a visszatérést
  }

  @Override
  public void save(Attractions attraction) {
    attractionrepository.save(attraction);

  }
}
