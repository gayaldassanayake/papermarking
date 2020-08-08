package org.papermarking.papermarking.model.fileModel;

import org.papermarking.papermarking.model.submissionModel.Tag;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "paper")
public class Paper {
    @Id
    private String id;
    private String subject;
    private int securityLevel;
    private String type;

    @DBRef(lazy = true)
    private List<Tag> tags;

    @PersistenceConstructor
    public Paper(String id, String subject, int securityLevel, String type , List<Tag> tags) {
        this.id = id;
        this.subject = subject;
        this.securityLevel = securityLevel;
        this.type = type;
        this.tags = tags;
    }
    public Paper(String id, String subject , List<Tag> tags) {
        this.id = id;
        this.subject = subject;
        this.securityLevel = 0;
        this.tags = tags;
    }

    public Paper(String id, String subject) {
        this.id = id;
        this.subject = subject;
        this.securityLevel = 0;
        this.tags = new ArrayList<>();
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
