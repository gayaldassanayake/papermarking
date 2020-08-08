package org.papermarking.papermarking.model.fileModel;

import org.papermarking.papermarking.model.submissionModel.Submission;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "markedPaper")
public class MarkedPaper {
    @Id
    private String id;

    @DBRef(lazy = true)
    private Submission submission;

    private String description;
    private Date date;

    @PersistenceConstructor
    public MarkedPaper(String id, Submission submission, String description, Date date) {
        this.id = id;
        this.submission = submission;
        this.description = description;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
