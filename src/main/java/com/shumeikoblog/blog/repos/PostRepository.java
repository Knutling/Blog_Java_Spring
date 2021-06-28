package com.shumeikoblog.blog.repos;

import com.shumeikoblog.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
