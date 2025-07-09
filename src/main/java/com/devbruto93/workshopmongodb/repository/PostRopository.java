package com.devbruto93.workshopmongodb.repository;

import com.devbruto93.workshopmongodb.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRopository extends MongoRepository<Post,String> {

}
