package com.devbruto93.workshopmongodb.services;

import com.devbruto93.workshopmongodb.domain.User;
import com.devbruto93.workshopmongodb.repository.UserRepository;
import com.devbruto93.workshopmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> user = repo.findById(id); //ATUALMENTE O SPRING DATA NAO ACEITA O METODO FindOne() SENDO NECESSARIO MUDAR PRO FindById()###
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));//NAO É MAIS NECESSARIO CHECAR MANUALMENTE SE O USUARIO ESTA PASSANDO UM ID EXISTENTE OU NAO, POIS ESSE METODO CHECA E LANÇA A EXCESSAO SE NECESSARIO###
    }

}
