package org.papermarking.papermarking.model.submissionModel;

import org.papermarking.papermarking.model.fileModel.Answer;
import org.papermarking.papermarking.model.fileModel.Paper;
import org.papermarking.papermarking.model.userModel.PaperMarker;
import org.papermarking.papermarking.model.userModel.Student;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "submmision")
public class Submission {
    @Id
    private String id;

    @DBRef(lazy = true)
    private Paper paper;
    @DBRef(lazy = true)
    private Answer answer;
    @DBRef(lazy = true)
    private Student student;
    @DBRef(lazy = true)
    private PaperMarker marker;

    private String state;
    private String title;
    private String description;
    private String rejectReason;
    private Date date;

    @PersistenceConstructor

    public Submission(String id, Paper paper, Answer answer, Student student, PaperMarker marker, String state, String title, String description, String rejectReason, Date date) {
        this.id = id;
        this.paper = paper;
        this.answer = answer;
        this.student = student;
        this.marker = marker;
        this.state = state;
        this.title = title;
        this.description = description;
        this.rejectReason = rejectReason;
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

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
