package com.blog.blog.repository;

import com.blog.blog.model.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoryRepository extends CrudRepository<Story, Long> {

  List<Story> findAll();
  Story findById(long id);

  List<Story> findAllByOrderByLikeNumberDesc();

}
