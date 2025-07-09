package com.devbruto93.workshopmongodb.config;

import com.devbruto93.workshopmongodb.Post;
import com.devbruto93.workshopmongodb.domain.User;
import com.devbruto93.workshopmongodb.repository.PostRopository;
import com.devbruto93.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRopository postRopository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRopository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Gray", "bob@gmail.com");

        Post post1 = new Post(null, sdf.parse("21/03/18"), "Partiu viagem.", "Vou viajar para São Paulo, abraços!", maria);
        Post post2 = new Post(null, sdf.parse("21/03/18"), "Bom dia!", "Acordei feliz hoje!", maria);


        userRepository.saveAll(Arrays.asList(maria, alex, bob));
        postRopository.saveAll(Arrays.asList(post1, post2));
    }

}
