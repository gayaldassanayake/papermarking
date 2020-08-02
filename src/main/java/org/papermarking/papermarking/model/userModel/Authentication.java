package org.papermarking.papermarking.model.userModel;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "authentication")
public class Authentication {
    @Id
    private String id;
    private String email;
    private String password;
    private int accessLevel;
    /**
     * @param accessLevel
     * @param email
     * @param password
     */
    public Authentication(String email, String password, int accessLevel) {
        super();
        this.accessLevel = accessLevel;
        this.password = password;
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

