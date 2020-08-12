package org.papermarking.papermarking.model.submissionModel;

import org.papermarking.papermarking.model.userModel.PaperMarker;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "markerRejectReason")
public class MarkerRejectReason {

    @Id
    private String id;

    @DBRef(lazy = true)
    private Submission submission;

    @DBRef(lazy = true)
    private PaperMarker paperMarker;

    private String reason;
    private Date date;

    @PersistenceConstructor

    public MarkerRejectReason(Submission submission, PaperMarker paperMarker, String reason, Date date) {
        this.submission = submission;
        this.paperMarker = paperMarker;
        this.reason = reason;
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

    public PaperMarker getPaperMarker() {
        return paperMarker;
    }

    public void setPaperMarker(PaperMarker paperMarker) {
        this.paperMarker = paperMarker;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
