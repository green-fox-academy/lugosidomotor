package com.timmyyyy.timmyyyy.service;

import com.timmyyyy.timmyyyy.model.NumberModel;
import com.timmyyyy.timmyyyy.repository.NumberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
      result = "Succes! The saved numbers: " + numberModel.getFirstNumber() + "   " + numberModel.getSecondNumber() + "   " + numberModel.getThirdNumber() + "   " + numberModel.getFourthNumber();
    } else {
      result = "Go fuck yourself!";
    }
    return result;
  }

  @Override
  public int sum(NumberModel numberModel) {
    int one = Integer.parseInt(numberModel.getFirstNumber());
    int two = Integer.parseInt(numberModel.getSecondNumber());
    int three = Integer.parseInt(numberModel.getThirdNumber());
    int four = Integer.parseInt(numberModel.getFourthNumber());
    int sum = one + two + three + four;
    return sum;
  }

  @Override
  public List<Integer> square(NumberModel numberModel){
    List<Integer> square = new ArrayList<>();
    int one = Integer.parseInt(numberModel.getFirstNumber());
    int two = Integer.parseInt(numberModel.getSecondNumber());
    int three = Integer.parseInt(numberModel.getThirdNumber());
    int four = Integer.parseInt(numberModel.getFourthNumber());
    square.add(one*one);
    square.add(two*two);
    square.add(three*three);
    square.add(four*four);
    return square;
  }
}
