package com.timmyyyy.timmyyyy.service;

import com.timmyyyy.timmyyyy.model.NumberModel;
import com.timmyyyy.timmyyyy.repository.NumberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberServiceImpl implements NumberService {

  @Autowired
  NumberRepo numberRepo;

  @Override
  public void save(NumberModel numberModel) {
    if (isItNumber(numberModel)) {
      numberRepo.save(numberModel);
    }
  }

  @Override
  public boolean isItNumber(NumberModel numberModel) {
    return numberModel.getFirstNumber().matches("^\\d+$") && numberModel.getSecondNumber().matches("^\\d+$") && numberModel.getThirdNumber().matches("^\\d+$") && numberModel.getFourthNumber().matches("^\\d+$");
  }

  @Override
  public List<NumberModel> findAll() {
    return numberRepo.findAll();
  }

  @Override
  public NumberModel findById(long id) {
    return numberRepo.findById(id);
  }

  @Override
  public String message(NumberModel numberModel) {
    String result = "No result yet!";
    if (isItNumber(numberModel)) {
      result = "Succes! The saved numbers: " + numberModel.getFirstNumber() + " " + numberModel.getSecondNumber() + " " + numberModel.getThirdNumber() + " " + numberModel.getFourthNumber();
    } else {
      result = "Go fuck yourself!";
    }
    return result;

  }
}