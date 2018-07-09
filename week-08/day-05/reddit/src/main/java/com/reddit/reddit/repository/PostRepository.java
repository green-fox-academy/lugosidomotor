package com.reddit.reddit.repository;
import com.reddit.reddit.model.Post;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface PostRepository extends CrudRepository<Post, Long> {
}