package org.papermarking.papermarking.model.userModel;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "notification")
public class Notification {
    @Id
    private String id;

    @DBRef(lazy = true)
    private User receiver;

    @DBRef(lazy = true)
    private User sender;
    
    private String topic;
    private String content;
    private Date date;

    @PersistenceConstructor
    public Notification(String id, User receiver, User sender, String topic, String content, Date date) {
        this.id = id;
        this.receiver = receiver;
        this.sender = sender;
        this.topic = topic;
        this.content = content;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
