package org.papermarking.papermarking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class User {

    @Id
    private String id;
    @DBRef(lazy =  true)
    private Authentication authentication;

    public User() {
    }

    public User(Authentication auth) {
        this.authentication = auth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Authentication getAuth() {
        return authentication;
    }

    public void setAuth(Authentication auth) {
        this.authentication = auth;
    }
}
