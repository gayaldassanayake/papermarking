package org.papermarking.papermarking.model.fileModel;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "answer")
public class Answer {
    @Id
    private String id;

    @DBRef(lazy = true)
    private Paper paper;

    private Date date;

    @PersistenceConstructor
    public Answer(String id, Paper paper, Date date) {
        this.id = id;
        this.paper = paper;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
