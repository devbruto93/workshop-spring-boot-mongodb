package com.devbruto93.workshopmongodb.dto;

import com.devbruto93.workshopmongodb.domain.User;

import java.io.Serializable;

public class UserDTO implements Serializable {

    private String id;
    private String name;
    private String email;

    public UserDTO(){

    }

    public UserDTO(User obj){

        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
