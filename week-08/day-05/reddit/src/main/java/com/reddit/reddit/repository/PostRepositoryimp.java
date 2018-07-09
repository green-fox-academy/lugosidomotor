package com.reddit.reddit.repository;
import com.reddit.reddit.model.Post;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostRepositoryimp implements PostRepository {

  @Override
  public <S extends Post> S save(S entity) {
    return null;
  }

  @Override
  public <S extends Post> Iterable<S> saveAll(Iterable<S> entities) {
    return null;
  }

  @Override
  public Optional<Post> findById(Long aLong) {
    return Optional.empty();
  }

  @Override
  public boolean existsById(Long aLong) {
    return false;
  }

  @Override
  public Iterable<Post> findAll() {
    return null;
  }

  @Override
  public Iterable<Post> findAllById(Iterable<Long> longs) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void deleteById(Long aLong) {

  }

  @Override
  public void delete(Post entity) {

  }

  @Override
  public void deleteAll(Iterable<? extends Post> entities) {

  }

  @Override
  public void deleteAll() {

  }
}
