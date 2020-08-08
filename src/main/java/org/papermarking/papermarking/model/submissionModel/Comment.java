package org.papermarking.papermarking.model.submissionModel;

import org.papermarking.papermarking.model.userModel.PaperMarker;
import org.papermarking.papermarking.model.userModel.Student;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "comment")
public class Comment {

    @Id
    private String id;

    @DBRef(lazy = true)
    private Student student;

    @DBRef(lazy = true)
    private PaperMarker marker;

    @DBRef(lazy = true)
    private Submission submission;

    private String comment;
    private Date date;

    @PersistenceConstructor
    public Comment(Student student, PaperMarker marker, Submission submission, String comment, Date date) {
        this.student = student;
        this.marker = marker;
        this.submission = submission;
        this.comment = comment;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public PaperMarker getMarker() {
        return marker;
    }

    public void setMarker(PaperMarker marker) {
        this.marker = marker;
    }

    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
