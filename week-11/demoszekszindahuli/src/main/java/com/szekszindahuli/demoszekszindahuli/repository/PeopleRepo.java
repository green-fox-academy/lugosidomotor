package com.szekszindahuli.demoszekszindahuli.repository;

import com.szekszindahuli.demoszekszindahuli.model.People;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepo extends CrudRepository<People, Long> {

  List<People> findAllByGenderIsFalse();
  List<People> findAllByGenderIsTrue();
}
