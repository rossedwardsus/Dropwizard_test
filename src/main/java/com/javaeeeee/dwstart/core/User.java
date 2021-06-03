package com.javaeeeee.dwstart.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty
    private String email;

    public User() {
    }

    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}