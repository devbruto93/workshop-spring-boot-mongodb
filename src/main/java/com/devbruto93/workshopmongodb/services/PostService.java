package com.devbruto93.workshopmongodb.services;

import com.devbruto93.workshopmongodb.Post;
import com.devbruto93.workshopmongodb.repository.PostRopository;
import com.devbruto93.workshopmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRopository repo;

    public Post findById(String id){
        Optional<Post> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }

}
