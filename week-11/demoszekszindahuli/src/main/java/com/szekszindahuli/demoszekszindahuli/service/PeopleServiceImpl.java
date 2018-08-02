package com.szekszindahuli.demoszekszindahuli.service;
import com.szekszindahuli.demoszekszindahuli.model.People;
import com.szekszindahuli.demoszekszindahuli.repository.PeopleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;


@Service
public class PeopleServiceImpl implements PeopleService{

  @Autowired
  PeopleRepo peopleRepo;


  @Override
  public List<People> findAllGirl() {
    return peopleRepo.findAllByGenderIsFalse();
  }

  @Override
  public List<People> findAllMan() {
    return peopleRepo.findAllByGenderIsTrue();
  }

  @Override
  public People doEveryStuff(People people) {
    Random rand = new Random();
    int randomPower = rand.nextInt(1500);
    people.setPower(randomPower);
    peopleRepo.save(people);
    return people;
  }

  @Override
  public String calculateResult() {

    Random rand = new Random();
    int n = rand.nextInt(1000);

    if (n <= 100) {
      return "ALKALMI SZEX";
    } else if (n <= 200) {
      return "HÁZASSÁG";
    } else if (n <= 300) {
      return "MÓNIKA-SHOW";
    } else if (n <= 400) {
      return "SZERELEM";
    } else if (n <= 500) {
      return "10 PUJA";
    } else if (n <= 600) {
      return "LE SE MEREM ÍRNI...";
    } else if (n <= 700) {
      return "SEGGBŐLSZÁJBA";
    } else if (n <= 800) {
      return "NABAZZEG...";
    } else{
      return "SZÜZEN HALNAK MEG";
    }
  }

  @Override
  public void counterPlus(People girl, People boy) {
    if(boy.getPower() > girl.getPower()){
      boy.setSexCounter(boy.getSexCounter()+1);
      peopleRepo.save(boy);
    }else {
      girl.setSexCounter(girl.getSexCounter()+1);
      peopleRepo.save(girl);
    }
  }
}
