package com.devbruto93.workshopmongodb.repository;

import com.devbruto93.workshopmongodb.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRopository extends MongoRepository<Post,String> {

    List<Post> findByTitleContainingIgnoreCase(String text);

}
