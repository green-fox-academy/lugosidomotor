package com.szekszindahuli.demoszekszindahuli.service;

import com.szekszindahuli.demoszekszindahuli.model.People;

import java.util.List;

public interface PeopleService {


  List<People> findAllGirl();
  List<People> findAllMan();
  People doEveryStuff(People people);

  String calculateResult();
  void counterPlus(People boy, People girl);
}
