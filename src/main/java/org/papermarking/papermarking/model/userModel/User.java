package org.papermarking.papermarking.model.userModel;


import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private String id;
    private String email;
    private String name;
    private int telephone;
    private int type;
    private int state;
    private Date createdAt;
    private Date updatedAt;
    private Date lastLoggedAt;
    /*
    payment method and profile pic
    * */
    private List<String> subjects;

    @PersistenceConstructor
    public User(String id, String email, String name, int telephone, int type, int state, Date createdAt, Date updatedAt, Date lastLoggedAt, List<String> subjects) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.telephone = telephone;
        this.type = type;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.lastLoggedAt = lastLoggedAt;
        this.subjects = subjects;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getLastLoggedAt() {
        return lastLoggedAt;
    }

    public void setLastLoggedAt(Date lastLoggedAt) {
        this.lastLoggedAt = lastLoggedAt;
    }

    public List<String> getSubjects() {
        return this.subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}

