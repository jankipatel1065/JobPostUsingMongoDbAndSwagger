package com.janki.jobpost.jobpost;

import com.janki.jobpost.jobpost.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postRepo extends MongoRepository<Post, String> {
}
