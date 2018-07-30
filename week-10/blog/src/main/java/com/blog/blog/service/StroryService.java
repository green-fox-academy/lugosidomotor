package com.blog.blog.service;

import com.blog.blog.model.Story;

import java.util.List;

public interface StroryService {

  List<Story> findAll();
  Story findById(long id);
  void save(Story todo);
  void delete(long id);
  void upvote(long id);
  void downvote(long id);
}
