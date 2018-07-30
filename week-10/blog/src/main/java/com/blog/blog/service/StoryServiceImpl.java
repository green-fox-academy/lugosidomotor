package com.blog.blog.service;

import com.blog.blog.model.Story;
import com.blog.blog.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class StoryServiceImpl implements StroryService {

  @Autowired
  StoryRepository storyRepository;

  @Override
  public List<Story> findAll() {
    return storyRepository.findAllByOrderByLikeNumberDesc();  }

  @Override
  public Story findById(long id) {
    return null;
  }

  @Override
  public void save(Story story) {
    storyRepository.save(story);
  }

  @Override
  public void delete(long id) {
  }

  @Override
  public void upvote(long id) {
    Story story = storyRepository.findById(id);
    story.setLikeNumber(story.getLikeNumber() + 1);
    storyRepository.save(story);
  }

  @Override
  public void downvote(long id) {
    Story story = storyRepository.findById(id);
    story.setLikeNumber(story.getLikeNumber() - 1);
    storyRepository.save(story);
  }
}
